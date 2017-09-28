package clase2;

public class Numeros {

	public static void Numeros() {
		
		for(int i=1;i<=100;i++){
			for(int j=1;j<=i;j++){
				if(i%j == 0){
					System.out.println(i);
				}
				else 
					System.out.println("salto");
				
			}
			
		}
	
	}

}
