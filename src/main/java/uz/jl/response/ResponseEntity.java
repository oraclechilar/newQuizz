package uz.jl.resonse;

import lombok.*;
import uz.jl.enums.HttpStatus;
import uz.jl.enums.HttpStatus;


/**
 * @author Bakhromjon Mon, 8:30 PM 1/24/2022
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseEntity<D> {
    private D data;
    private HttpStatus status;

    public ResponseEntity(D data) {
        this.data = data;
        this.status = HttpStatus.HTTP_200;
    }
}
