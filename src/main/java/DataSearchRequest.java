import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
class DataSearchRequest {

    private String id;

    private LocalDate updatedBefore;

    private int length;
}