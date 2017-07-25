package Figura;

public class Circulo extends Figura {

	public double radio;
	
	public String hola;
	
	public Circulo(double radio) {
		super("Circulo","rosado");
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radio,2);
	}

	@Override
	public double perimetro() {
		return (2*radio)*Math.PI;
	}

	@Override
	public String toString() {
		String calcir = "Nombre -->" + getNombre() + "  Color -->" + getColor() + "  Area -->" + area() + "  Perimetro -->  " + perimetro();
		return calcir;
	}


}
