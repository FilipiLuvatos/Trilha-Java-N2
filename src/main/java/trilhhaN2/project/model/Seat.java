package trilhhaN2.project.model;

import jakarta.persistence.*;
import lombok.*;
import trilhhaN2.project.domain.SeatDTO;
import trilhhaN2.project.enumeration.Status;

import java.time.LocalDate;

@Entity
@Table(name = "seat")
@EqualsAndHashCode(of = "id")
@Getter
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

    @Enumerated(EnumType.STRING) // salva como texto no banco
    @Column(nullable = false, length = 200)
    private Status status;

    public Seat(SeatDTO seatDTO) {
        this.id = seatDTO.getId(); // opcional
        this.lugar = seatDTO.getLugar(); // obrigatório
        this.status = seatDTO.getStatus();
        this.dtReservaInicio = seatDTO.getDtReservaInicio();
        this.dtReservaFim = seatDTO.getDtReservaFim();
    }


    public Seat() {

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

    public void atualizaSeatStatus(SeatDTO seatDTO) {

        this.status = seatDTO.getStatus();
        this.dtReservaInicio = seatDTO.getDtReservaInicio();
        this.dtReservaFim = seatDTO.getDtReservaFim();

    }
}
