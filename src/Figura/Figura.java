package Figura;

public abstract class Figura {
	
	public String nombre;
	static String color;
	
	// Constructor
	public Figura(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}
	
	// Encapsulamiento
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Figura.color = color;
	}

	// Clases abstractas que eredarán las demás para hacer cálculos diferentes... 
	public abstract double area();
	
	public abstract double perimetro();
	
	
}
