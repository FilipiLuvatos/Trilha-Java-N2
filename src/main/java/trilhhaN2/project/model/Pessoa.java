package trilhhaN2.project.model;

import jakarta.persistence.*;


@Entity
@Table(name = "pessoa")
public class Pessoa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // bigserial -> identity
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;
}
