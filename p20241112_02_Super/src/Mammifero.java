
public abstract class Mammifero {
	
	private int freqCard;
	private int peso;
	private int zampe;
	private int freaResp;
	public Mammifero(int freqCard, int peso, int zampe, int freaResp) {
		super();
		this.freqCard = freqCard;
		this.peso = peso;
		this.zampe = zampe;
		this.freaResp = freaResp;
	}
	public Mammifero() {
		super();
	}
	@Override
	public String toString() {
		return "Mammifero [freqCard=" + freqCard + ", peso=" + peso + ", zampe=" + zampe + ", freaResp=" + freaResp
				+ "]";
	}
	public int getFreqCard() {
		return freqCard;
	}
	public void setFreqCard(int freqCard) {
		this.freqCard = freqCard;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getZampe() {
		return zampe;
	}
	public void setZampe(int zampe) {
		this.zampe = zampe;
	}
	public int getFreaResp() {
		return freaResp;
	}
	public void setFreaResp(int freaResp) {
		this.freaResp = freaResp;
	}
	
	public abstract String Verso();
}
