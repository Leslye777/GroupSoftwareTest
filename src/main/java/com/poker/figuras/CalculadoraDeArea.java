package com.poker.figuras;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeArea {
	
	private List<FiguraGeometrica> figuras = new ArrayList<>();

	
	public double totalAreas() {
		CalculadoraDeArea calc = new CalculadoraDeArea();
		
		figuras.add(new Quadrado(5.0));
		figuras.add(new Triangulo(5.0, 5.0));
		figuras.add(new Retangulo(5.0, 5.0));
		figuras.add(new Circulo(5.0));


		
		double total = figuras.stream()
			.mapToDouble(figuras -> figuras.calcularArea())
			.sum();
		
		System.out.println("Total "+total);
		
		return total;
		
	}
	
	
}
