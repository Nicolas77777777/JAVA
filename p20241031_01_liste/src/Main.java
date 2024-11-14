import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        
         

   // ho essenzialmente due tipi di liste LinkedList, ArrayList*/
          LinkedList<Integer> li;
          li = new LinkedList<Integer>();
          //appendi in fondo
          li.add(7);
          li.add(2);
          li.add(70);
          li.add(30);
          System.out.println(li);
          //Il primo elemento
          System.out.println(li.getFirst());


        //Ultimo elemento
        System.out.println(li.getLast());

        //elemento i
        System.out.println(li.get(2));

        for (Integer i: li) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (var i: li) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Ora vorrei stampare al contrario
        Collections.reverse(li);
        System.out.println(li);
        
        // Disordinare
        Collections.shuffle(li);
        System.out.println(li);
        
        // ORDINARE
        Collections.sort(li);
        System.out.println(li);
        
  
        Citta roma = new Citta("roma", 0.0, 0.0, 3578922);
        LinkedList<Citta> lc = new LinkedList <Citta> ();
        lc.add(new Citta("milano", 1.0, 1.0, 150000));
        lc.add(new Citta("firenze", 1.0, 1.0, 750000));
        
        System.out.println(lc);
        Collections.sort(lc);
        System.out.println(lc);
        
        Collections.shuffle(lc);
        lc.sort(new Comparator<Citta>() {
        @Override
        
        public int compare (Citta o1, Citta o2 ) {
        	return o1.getNome().compareTo(o2.getNome());
        }
        });
        
        Pair<String> ps = new Pair <String>("uno", "due");
        Pair<Integer> in = new Pair <Integer>(1,2);
        System.out.println(ps );
        
        var l3int = Crealista3 (10, 20 ,30);
        var l3str = Crealista3 ("uno", "due", "tra");
        System.out.println();
  
	}
    
    
    public static List<Integer> Crealista3(Integer i1, Integer i2, Integer i3){
    	LinkedList<Integer> li = new LinkedList<Integer>();
    	li.add(i1);
    	li.add( i2);
    	li.add(i3);
    	return li ;
    	
    }
    
    public static List<String> Crealista3(String i1, String i2, String i3){
    	LinkedList<String> li = new LinkedList<String>();
    	li.add(i1);
    	li.add( i2);
    	li.add(i3);
    	return li ;
    	
    }
    
    
    public static <Tipo> List<Tipo> Crealista3(Tipo i1, Tipo i2, Tipo i3){
    	LinkedList<Tipo> li = new LinkedList<Tipo>();
    	li.add(i1);
    	li.add( i2);
    	li.add(i3);
    	return li ;
}
    public static void Hanoi (int n, String p1, String p2, String p3) {
    	
    	
    }
}

    
    
