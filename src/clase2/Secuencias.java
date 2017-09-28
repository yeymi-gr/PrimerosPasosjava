package clase2;

public class Secuencias {
	
	public static void Secuencias(){
		
	}
	
	public void NumerosNaturales() {
		for(int i=0; i<=10;i++){
			System.out.println(i);
			System.out.println("Si está corriendo este");
		}
		
	}
		
		
		public static String tipoTriangulo(int a, int b, int c) {
			if (a == b && a == c) {
				return "Triangulo Equilatero";
			} else if (a == b || b == c || c == a) {
				return "Triangulo Isosceles";

			}

			return "Triangulo Escaleno";
	}

}
