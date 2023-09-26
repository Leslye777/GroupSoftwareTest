package com.poker.condominio;

public class Apartamento{
	private double tamanhoDoApartamento;
	private double fracaoIdeal = 0.0;
	
	public Apartamento(double tamanhoDoApartamento){
		this.tamanhoDoApartamento = tamanhoDoApartamento;
	}
	
	public void fracaoIdeal(double areaDoBloco) {
		fracaoIdeal = tamanhoDoApartamento/areaDoBloco;
	}
	
	public double calcCondominio(double despesasTotais) {
		
		return despesasTotais*fracaoIdeal;
		
	}

	public double getTamanhoDoApartamento() {
		return tamanhoDoApartamento;
	}

	public void setTamanhoDoApartamento(double tamanhoDoApartamento) {
		this.tamanhoDoApartamento = tamanhoDoApartamento;
	}
	
	

	
}

