package trilhhaN2.project.model;

import jakarta.persistence.*;
import lombok.*;
import trilhhaN2.project.enumeration.Status;

import java.time.LocalDate;

@Entity
@Table(name = "seat")
@Getter

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

    public Seat() {
    }

    public Seat(Long id, String lugar, LocalDate dtReservaFim, LocalDate dtReservaInicio, Status status) {
        this.id = id;
        this.lugar = lugar;
        this.dtReservaFim = dtReservaFim;
        this.dtReservaInicio = dtReservaInicio;
        this.status = status;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDtReservaFim(LocalDate dtReservaFim) {
        this.dtReservaFim = dtReservaFim;
    }

    public void setDtReservaInicio(LocalDate dtReservaInicio) {
        this.dtReservaInicio = dtReservaInicio;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
