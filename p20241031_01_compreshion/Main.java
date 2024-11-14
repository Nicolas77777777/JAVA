
public class Main {

	public static void main(String[] args) {
		int somma = Somma(7,20);
		
		System.out.println(somma);      
	}

	private static int Somma(int inizio, int fine) {
		if (inizio == fine ) {
			
			return fine ;	
		}
		
		return inizio + Somma(inizio +1, fine);
	
		
	}


}
