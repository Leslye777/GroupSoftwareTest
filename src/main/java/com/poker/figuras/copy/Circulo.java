package com.poker.figuras.copy; 

public class Circulo extends FiguraGeometrica{

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*2*raio;
	}

}
