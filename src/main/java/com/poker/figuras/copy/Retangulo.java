package com.poker.figuras.copy;

public class Retangulo extends FiguraGeometrica{

	private double comprimento;
	private double largura;
	
	
	public Retangulo(double comprimento, double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}

	@Override
	public double calcularArea() {
		return comprimento*largura;
	}


}
