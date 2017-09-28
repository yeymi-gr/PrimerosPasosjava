package clase2;


public class funciones {

	
		public static String tipoTriangulo(int a, int b, int c) {
			if (a == b && a == c) {
				return "Triangulo Equilatero";
			} else if (a == b || b == c || c == a) {
				return "Triangulo Isosceles";

			}

			return "Triangulo Escaleno";

		}

		public static double mayor(double a, double b) {
			if (a > b)
				return a;
			else
				return b;
		}

		public static double menor(double a, double b) {
			if (a < b)
				return a;
			else
				return b;
		}

		public static double mayores(int a, int b, int c) {
			if (a >= b && a >= c) {
				return a;

			} else if (b >= a && b >= c) {
				return b;
			} else
				return c;
		}

		public static void imprimir() {
			int a = 1;
			while (a <= 10) {
				System.out.println(a);
				a++;
			}

		}

		public static void imprimirFor() {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}

		}
		
		public static int imprimirForRecursivo(int x){
			if(x>10){
				
				return 10;
			}
			
			return imprimirForRecursivo(x+1);
			
		}
		
		
		public static int suma(int a, int b){
			for (; b>0; b--) {
				a++;
			}
			return a;
		}
		
		public static int sumaR(int a, int b){
			System.out.println(a +" " + b);
			if(b==1)return a;
			return sumaR(a, b-1) + a;
		}
		
		

		public static void main(String[] args) {

			System.out.println("Tipos de Triangulo " + funciones.tipoTriangulo(1, 2, 1));
			System.out.println("Numero Mayor " + funciones.mayor(3, 7));
			System.out.println("Numero Menor " + funciones.menor(3, 7));
			System.out.println("Numeros Mayores " + funciones.mayores(7, 7, 1));
			imprimir();// imprime lo que tiene el metodo no se puede con syso poruqe no espera nada
			imprimirFor();
			System.out.println(sumaR(2, 3));
	    }

}
