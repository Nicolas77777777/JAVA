
public class Balena extends Mammifero {
	String habitat;

	@Override
	public String Verso() {
		
		return "wiiiiiiioooo";
	}

	@Override
	public String toString() {
		return "Balena [habitat=" + habitat + ", toString()=" +
	super.toString() + "]";
	}

	public Balena(int freqCard, int peso, int zampe, int freaResp, 
			String habitat) {
		super(freqCard, peso, zampe, freaResp);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	
	
	
}
