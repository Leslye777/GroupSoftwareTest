package com.poker.condominio;

import java.util.ArrayList;
import java.util.List;

public class Bloco {
	
	private double areaDoBloco;
	private double despesasTotais = 120000.00;
	private List<Apartamento> apartamentos = new ArrayList<>();
	
	public void calcDespesas() {
		
		apartamentos.add(new Apartamento(70.0));
		apartamentos.add(new Apartamento(70.0));
		apartamentos.add(new Apartamento(70.0));
		
		for(Apartamento apartamento: apartamentos) {
			areaDoBloco += apartamento.getTamanhoDoApartamento();
		}
		for(Apartamento apartamento: apartamentos) {
			apartamento.fracaoIdeal(areaDoBloco);
		}
		for(Apartamento apartamento: apartamentos) {
			
			System.out.println("O apartamento de area "+ apartamento.getTamanhoDoApartamento() 
								+" tem o condominio no valor "+apartamento.calcCondominio(despesasTotais)
								);
		}
		
		
		
	}
		
	

	
}
