package trilhhaN2.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import trilhhaN2.project.enumeration.Status;

import java.time.LocalDate;

@Entity
@Table(name = "sala")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // bigserial -> identity
    private Long id;

    @Column(nullable = false, length = 30)
    private Status status;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(name = "dtreservafim")
    private LocalDate dtReservaFim;

    @Column(name = "dtreservainicio")
    private LocalDate dtReservaInicio;
}
