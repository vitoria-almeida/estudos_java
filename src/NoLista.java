
public class NoLista<T> {
	private T conteudo;
	private NoLista proximoNo;
	
	public NoLista() {
		this.proximoNo = null;
	}
	
	public NoLista(T conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}
	
	public NoLista(T conteudo, NoLista proximoNo) {
		this.proximoNo = proximoNo;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public NoLista getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(NoLista proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "NoLista [conteudo=" + conteudo + "]";
	}
	
	public String toStringEncadeado() {
		String str = "NoLista {" + "conteudo = " + conteudo + "}";
		if(proximoNo != null) {
			str += "-> " + proximoNo.toString();
		} else {
			str += "-> null";
		}
		
		return str;
	}	
}