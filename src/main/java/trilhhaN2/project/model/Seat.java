package trilhhaN2.project.model;

import jakarta.persistence.*;
import lombok.*;
import trilhhaN2.project.enumeration.Status;

import java.time.LocalDate;

@Entity
@Table(name = "seat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // bigserial -> identity
    private Long id;

    @Column(nullable = false, length = 5)
    private String lugar;

    @Column(name = "dtreservafim")
    private LocalDate dtReservaFim;

    @Column(name = "dtreservainicio")
    private LocalDate dtReservaInicio;

    @Column(nullable = false, length = 200)
    private Status status;
}
