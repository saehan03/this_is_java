import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter


public class PatientOfAnimal {
    private String name;
    private String id;
    private LocalDate dayOfHosipital;
    private LocalDate dayOfDischarge;
    private int countOfVisitation;
}
