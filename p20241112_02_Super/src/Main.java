import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Balena b1 = new Balena(5,14000,2,5, "mare del nord");
		Balena b2 = new Balena(6,24000,2,3, "oceano australe");
		
		Leopardo l1 = new Leopardo(70, 60 , 4,15, 130);
		Leopardo l2 = new Leopardo(60, 60 , 3,15, 140);
		
		
		LinkedList<Balena> lb = new LinkedList<Balena>();
		lb.add(b1);
		lb.add(b2);
		
		LinkedList<Leopardo> ll = new LinkedList<Leopardo>();
		ll.add(l1);
		ll.add(l2);
		
		LinkedList<Mammifero> lm = new LinkedList<Mammifero>();
		lm.add(l1);
		lm.add(b1) ;
		lm.add(l2);
		lm.add(b2);
		
		Collections.shuffle(lm);
		lm.getFirst(); //?? balena o leopardo ?? cosa è ? 
	}

}
