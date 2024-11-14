
public class Leopardo extends Mammifero  {

	Integer velocita;
	@Override
	public String Verso() {
		
		return "Rorarrrr";
	}
	@Override
	public String toString() {
		return "Leopardo [velocita=" + velocita + ", toString()=" + super.toString() + "]";
	}
	public Leopardo(int freqCard, int peso, int zampe, int freaResp, Integer velocita) {
		super(freqCard, peso, zampe, freaResp);
		this.velocita = velocita;
	}
	public Integer getVelocita() {
		return velocita;
	}
	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}

}
