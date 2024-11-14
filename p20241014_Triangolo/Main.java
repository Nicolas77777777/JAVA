
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] v;

		v = new int[100]; // ho dichiarato un array di interi e gli
							// ho assegnato un array di 100 elementi
		System.out.println(v);

		v[4] = 100;
		v[90] = 200;
		v[0] = v[4] + v[90];

		int j = 10;
		v[j] = v[9];

		// Come scandire un array?

		// Inserire nell'array v (di 100 elementi interi)
		// i numeri da 0 a 99
		for (int k = 0; k < 100; k++) {
			v[k] = k;
		}

		// Quanto è lungo un array già dichiarato?
		System.out.println(v.length);

		// Quindi potrei scrivere
		for (int i = 0; i < v.length; i++) {
			v[i] = i;
		}

		// Riempire un array di numeri casuali
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 1000);
		}

		// Dichiarare un array di 1000 double//inserire nell'array 100 valori casuali
		// compresi tra 0 e 100 : Math.random()100//
		// contare quanti elementi dell'array sono//minori di 50

		double[] N;
		N = new double[1000];
		int somma = 0;

		for (int z = 0; z < N.length; z++) {
			N[z] = (int) (Math.random() * 100);
		
			//System.out.println(N[z]);
			
			if (N[z] < 50) {
			somma ++;
					
			}
			
		}
		System.out.println(somma);

	}

}
