

public class NoListaDupla<T> {
	private T conteudo;
	private NoListaDupla<T> noProximo;
	private NoListaDupla<T> noPrevio;
	
	public NoListaDupla(T conteudo) {
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public NoListaDupla<T> getNoProximo() {
		return noProximo;
	}

	public void setNoProximo(NoListaDupla<T> noProximo) {
		this.noProximo = noProximo;
	}

	public NoListaDupla<T> getNoPrevio() {
		return noPrevio;
	}

	public void setNoPrevio(NoListaDupla<T> noPrevio) {
		this.noPrevio = noPrevio;
	}

	@Override
	public String toString() {
		return "NoListaDupla [conteudo=" + conteudo + "]";
	}
}