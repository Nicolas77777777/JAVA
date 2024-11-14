
public class Cibo {
	
	private String cibi;
	private double calorie;
	private double peso;
	
	public Cibo(String cibi, double calorie, double peso) {
		super();
		this.cibi = cibi;
		this.calorie = calorie;
		this.peso = peso;
	}

	public Cibo() {
		super();
	}

	public String getCibi() {
		return cibi;
	}

	public void setCibi(String cibi) {
		this.cibi = cibi;
	}

	public double getCalorie() {
		return calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
}
