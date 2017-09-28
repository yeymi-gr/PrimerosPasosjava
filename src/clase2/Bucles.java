package clase2;

public class Bucles {

		public static void main(String[] args) {
			int n[] = new int[10];
			int x=0;
			for (int i = 0; i < n.length; i++) {
				n[i] = x++;
			}
			print(n);
		}

		public static void print(int n[]) {
				System.out.print("[");
				for (int i = 0; i < n.length; i++) {
					if(i==0)
					 System.out.print(n[i]);
					else System.out.print(", "+n[i]);
				}
				System.out.println("]");
		}
	
}
