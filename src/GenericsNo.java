
public class GenericsNo<T> {
	private T conteudo;
	private GenericsNo<T> proximoNo;
	
	public GenericsNo(T conteudo) {
		super();
		this.conteudo = conteudo;
		this.proximoNo = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public GenericsNo<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(GenericsNo<T>  proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}	
}
