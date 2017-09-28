package Figura;

public class Menu {

	
	public static void main(String[] args) {

		// Instancia de cuadrado donde se envía el dato para el constructor
		Cuadrado cuadrado = new Cuadrado(12);
		// Se invoca el toString de cuadrado
		System.out.println(cuadrado); 
		
		Triangulo triangulo = new Triangulo(30,20,50,15);
		System.out.println(triangulo);
		
		Figura circulo = new Circulo(20);
		System.out.println(circulo);		

		cuadrado.setLado(10);
		System.out.println("area después del set--->" + cuadrado); 
		

	}

}
