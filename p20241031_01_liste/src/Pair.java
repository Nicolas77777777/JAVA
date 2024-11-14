

// crea una classe che contiente Generic
public class Pair<Tipo> {
	
	private Tipo first;
	private Tipo second;
	public Tipo getFirst() {
		return first;
	}
	
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}

	public void setFirst(Tipo first) {
		this.first = first;
	}
	public Tipo getSecond() {
		return second;
	}
	public void setSecond(Tipo second) {
		this.second = second;
	}
	public Pair(Tipo first, Tipo second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	public Pair() {
		super();
	}

}
