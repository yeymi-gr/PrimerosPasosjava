package Figura;

public class Cuadrado extends Figura {
	
	public double lado;
	
	// Costructor de lo que va a recibir
	public Cuadrado(double lado) {
		super("Cuadrado","azul");
		this.lado = lado;		
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	// metodos sobreescritos
	@Override
	public double area() {
		double areCalc = lado * lado;
		return areCalc;
	}
	
	@Override
	public double perimetro() {
		double perCalc = lado * 4;   
		return perCalc;
	}
	
	@Override
	public String toString() {
		String calculo = "Nombre --> " + getNombre() + "  Area --> " + area() + "  Color -->" + getColor() + "  Perimetro -->" + perimetro(); 
		return calculo;
	}
	
}
