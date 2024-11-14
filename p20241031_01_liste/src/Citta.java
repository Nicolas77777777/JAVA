
public class Citta implements Comparable<Citta>, Geometria {
	
	private String nome;
	private Double longitudine;
	private Double latitudine;
	private Integer abitanti ;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getLongitudine() {
		return longitudine;
	}
	public void setLongitudine(Double longitudine) {
		this.longitudine = longitudine;
	}
	public Double getLatitudine() {
		return latitudine;
	}
	public void setLatitudine(Double latitudine) {
		this.latitudine = latitudine;
	}
	public Integer getAbitanti() {
		return abitanti;
	}
	public void setAbitanti(Integer abitanti) {
		this.abitanti = abitanti;
	}
	public Citta() {
		super();
	}

	public Citta(String nome, Double longitudine, Double latitudine, Integer abitanti) {
		super();
		this.nome = nome;
		this.longitudine = longitudine;
		this.latitudine = latitudine;
		this.abitanti = abitanti;
	}
	@Override
	public String toString() {
		return "Citta [nome=" + nome + ", longitudine=" + longitudine + ", latitudine=" + latitudine + ", abitanti="
				+ abitanti + "]";
	}
	@Override
	public int compareTo(Citta o) {
		// TODO Auto-generated method stub
		return nome.compareTo(o.nome);
	}
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
		return 0;
	} 
	

}
