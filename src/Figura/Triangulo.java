package Figura;

public class Triangulo extends Figura {

	public double lado1;
	public double lado2;
	public double base;
	public double altura;

	public Triangulo(double lado1, double lado2, double base, double altura) {
		super("Triangulo", "Rojo");
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.base = base;
		this.altura = altura;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Al crear el constructor pide generar los metodos:

	@Override
	public double area() {
		return (base * altura) / 2;
	}

	@Override
	public double perimetro() {
		return lado1 + lado2 + base;
	}

	@Override
	public String toString() {
		String triangulo = "Nombre --> " + getNombre() + "  Area --> " + area() + "  perimetro --> " + perimetro() + "  Color --> " + getColor();
		return triangulo;
	}

}
