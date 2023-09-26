package com.poker.mapeamento;

import javax.persistence.*;

@Entity
public class Morador {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;


    @OneToOne
    @JoinColumn(name = "unidade_id")
    private Unidade unidade;
}
