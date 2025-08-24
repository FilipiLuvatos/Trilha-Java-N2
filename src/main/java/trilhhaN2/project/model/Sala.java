package trilhhaN2.project.model;

import jakarta.persistence.*;
import lombok.*;
import trilhhaN2.project.enumeration.Status;

import java.time.LocalDate;

@Entity
@Table(name = "sala")
@Getter

@EqualsAndHashCode(of = "id")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // bigserial -> identity
    private Long id;

    @Enumerated(EnumType.STRING) // salva como texto no banco
    @Column(nullable = false, length = 30)
    private Status status;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(name = "dtreservafim")
    private LocalDate dtReservaFim;

    @Column(name = "dtreservainicio")
    private LocalDate dtReservaInicio;

    // Construtores
    public Sala() {
    }

    public Sala(Long id, Status status, String nome, LocalDate dtReservaFim, LocalDate dtReservaInicio) {
        this.id = id;
        this.status = status;
        this.nome = nome;
        this.dtReservaFim = dtReservaFim;
        this.dtReservaInicio = dtReservaInicio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDtReservaFim(LocalDate dtReservaFim) {
        this.dtReservaFim = dtReservaFim;
    }

    public void setDtReservaInicio(LocalDate dtReservaInicio) {
        this.dtReservaInicio = dtReservaInicio;
    }
}
