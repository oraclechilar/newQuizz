package uz.jl.ui;

import org.bson.types.ObjectId;
import uz.jl.criteria.test.TestCriteria;
import uz.jl.dto.test.TestCreateDto;
import uz.jl.dto.test.TestDto;
import uz.jl.dto.test.TestUpdateDto;
import uz.jl.dto.test.WorkingTestDto;
import uz.jl.entity.answer.Answer;
import uz.jl.entity.test.Test;
import uz.jl.response.Data;
import uz.jl.response.ResponseEntity;
import uz.jl.services.test.TestService;
import uz.jl.utils.Input;
import uz.jl.utils.Print;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bakhromjon Wed, 8:17 PM 1/26/2022
 */
public class TestUI extends BaseUI<TestService> {
    public TestUI(TestService service){
        super(service);
    }

    public void create() {
        TestCreateDto testCreateDto = new TestCreateDto();
        String question = Input.getStr("Enter question: ");
        testCreateDto.setQuestion(question);
        addAnswers(testCreateDto);
        // TODO: 1/26/2022 add answers
        ResponseEntity<Data<ObjectId>> response = service.create(testCreateDto);
        showResponse(response);
    }

    private void addAnswers(TestCreateDto testCreateDto) {
        List<Answer> answers = new ArrayList<>();
        while (Input.getStr(">").equals("add")) {
            Answer answer = new Answer();
            answer.setText(Input.getStr("Enter answer text : "));
            answer.set_selected(false);
            answer.setIs_correct(Input.getNum("Correct?(1/0) : "));
            answers.add(answer);
            if (Input.getStr(">").equals("add")) {
                testCreateDto.setAnswers(answers);
                break;
            }
        }
    }

    public void delete() {
        String id = Input.getStr("Enter test id: ");
        ResponseEntity<Data<Void>> response = service.delete(new ObjectId(id));
        showResponse(response);
    }

    public void update() {
        String question = Input.getStr("Enter question: ");
        TestUpdateDto testUpdateDto = new TestUpdateDto();
        testUpdateDto.setQuestion(question);
        ResponseEntity<Data<Void>> response = service.update(testUpdateDto);
        showResponse(response);
    }

    public void list() {
        ResponseEntity<Data<List<Test>>> list = service.getList();
        showResponse(list);
    }

    public void get() {
        String id = Input.getStr("Enter test id: ");
        ResponseEntity<Data<Test>> response = service.get(new ObjectId(id));
        showResponse(response);
    }

    public void solveTests() {
        int limit = 1;
        List<Test> testList = service.getTest(WorkingTestDto.builder().subjectId(Input.getStr("Enter subject ID : ")).level(Input.getStr("Enter level : ")).count(Input.getNum("Enter count : ")).language(Input.getStr("Enter quiz language : ")).build());
        while (limit != testList.size()) {
            Test test = testList.get(limit);
            Print.println(test.toString());
            limit++;
        }
    }
}
