package trilhhaN2.project.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import trilhhaN2.project.enumeration.Status;

import java.time.LocalDate;

@Data
@Getter
@Setter
public class SeatDTO {

    private Long id;

    private Status status;

    private LocalDate dtReservaInicio;

    private LocalDate dtReservaFim;

    private String lugar;

}
