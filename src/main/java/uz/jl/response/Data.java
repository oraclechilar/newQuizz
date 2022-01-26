package uz.jl.response;

import lombok.*;

/**
 * @author Bakhromjon Mon, 8:32 PM 1/24/2022
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Data<B> {
    private B body;
    private Integer total;

    public Data(B body) {
        this.body = body;
        this.total = 0;
    }
}
