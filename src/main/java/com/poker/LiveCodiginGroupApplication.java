package com.poker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poker.condominio.Bloco;
import com.poker.figuras.*;


@SpringBootApplication
public class LiveCodiginGroupApplication {

	public static void main(String[] args) {
		CalculadoraDeArea teste = new CalculadoraDeArea();
		teste.totalAreas();
		
		Bloco teste2 = new Bloco();
		teste2.calcDespesas();
		
		SpringApplication.run(LiveCodiginGroupApplication.class, args);

		
	}

}
