import java.util.Scanner;
 
public class Main {

	public static void main(String[] args) {
		
		
		// Creazione dello scanner per leggere l'input da console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un'operazione aritmetica");
        
        String input = scanner.nextLine();
        scanner.close();
		
		// per prima cosa tolgo tutti gli spazi bianchi
		//String esempio = " 123  + 87 " ;
		//esempio = esempio.replaceAll(" ", "");
		input = input.replaceAll(" ", "");
		//System.out.println(esempio);
		System.out.println(input);
		

		// poi provo a separare gli operandi (ci sarà una split?)
		//String[] operandi = esempio.split("[\\+\\-\\*\\/]");
		String[] operandi = input.split("[\\+\\-\\*\\/]");
		for (String s : operandi) {
			System.out.println(s);
		}
		

		// poi provo a estrarre l'operatore
		String[] voperatore = input.split("[0-9]+");
		for (String s : voperatore) {
			System.out.println("<" + s + ">");
		}
		// Quindi l'operatore sarà al secondo posto del vettore voperatori
		String operatore = voperatore[1];

		// ora avete operandi e operatore!!! Potete eseguire i calcoli

	}

}
