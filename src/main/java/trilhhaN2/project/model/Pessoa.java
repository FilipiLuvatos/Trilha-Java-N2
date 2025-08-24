package trilhhaN2.project.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "pessoa")
@Getter
public class Pessoa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // bigserial -> identity
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    // Construtores
    public Pessoa() {
    }

    public Pessoa(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
