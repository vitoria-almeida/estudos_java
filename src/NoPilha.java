
public class NoPilha {
	private int dado;
	private NoPilha refNo = null;
	
	public NoPilha(int dado) {
		super();
		this.dado = dado;
	}
	
	public NoPilha() {}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public NoPilha getRefNo() {
		return refNo;
	}

	public void setRefNo(NoPilha refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "NoPilha [dado=" + dado + "]";
	}
}
