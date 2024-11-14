package p20241022_01_ese;

public class Persona {

	private String nome ;
	private String cognome ;
	private String cf;
	private double eta;
	
	public Persona(String nome, String cognome, String cf, double eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.eta = eta;
	}

	public Persona() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public double getEta() {
		return eta;
	}

	public void setEta(double eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", cf=" + cf + ", eta=" + eta + "]";
	}
	
}
