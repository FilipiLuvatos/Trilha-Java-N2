package trilhhaN2.project.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "pessoa")
@Setter
@Getter
public class Pessoa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // bigserial -> identity
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;
}
