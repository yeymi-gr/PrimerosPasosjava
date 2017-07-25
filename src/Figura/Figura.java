package Figura;

public abstract class Figura {
	
	private String nombre;
	private String color;
	
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

	public String getColor() {
		return color;
	}

	public static void setColor(String color) {
		color = color;
	}
	
	// Clases abstractas que eredar�n las dem�s para hacer c�lculos diferentes... 
	public abstract double area();
	
	public abstract double perimetro();
	
	
}
