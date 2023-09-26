package com.poker.mapeamento;

import javax.persistence.*;

@Entity
public class Unidade {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String numeroUnidade;

    @ManyToOne
    @JoinColumn(name = "condominio_id")
    private Condominio condominio;

    @OneToOne(mappedBy = "unidade")
    private Morador morador;

}
