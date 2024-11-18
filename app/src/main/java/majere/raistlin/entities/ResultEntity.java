package majere.raistlin.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResultEntity {
    private Integer x;
    private Float y;
    private Integer r;
    private Boolean result;
}
