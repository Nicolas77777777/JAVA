import java.util.Scanner;

public class Cicli {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			System.out.println(i);
		}

		for (int i = 0; i < 77; i += 7) {

			System.out.println("tabella 7 "+ i);
		}

		for (int i = -77; i>0; i -= 7) {

			System.out.println(i);
		}
	
		int n= 7 ;
		if ( n % 2 == 0 ) {
			
			System.out.println(true);		
		}
	
		else {
			System.out.println(false);
		}
		
		// leggere da tastiera 
		Scanner leggi = new Scanner(System.in);
		
		
		
		
		
		int n2 = leggi.nextInt();
		
				
		

	
		
		
		for (int i = 10; i<10; i++) {
			System.out.println("inserire un numero");
			int num = leggi.nextInt();
			
			if (num > 10 ) {
				System.out.println();
			}
			
	}
}
