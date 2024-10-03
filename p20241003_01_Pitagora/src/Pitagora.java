

public class Pitagora {

	public static void main(String[] args) {
	
		double c1 =  10.345 ;
		double c2 =  20.415;
		
		double ipotenusa =  Math.pow(c1,2) + Math.pow(c2,2);
		
		double Ripotenusa = Math.sqrt(ipotenusa);
		
		
		System.out.println("ipotenusa del trinagolo " + Ripotenusa);
		
		double perimetro = c1+c2+Ripotenusa;
		
		System.out.println("Perimetro del triangolo" +  perimetro);
		
		double area = c1 *c2 / 2;
		
		System.out.println("area  " + area);
		
	}

}
