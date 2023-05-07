public class ListaDupla<T> {
	private NoListaDupla<T> primeiroNo;
	private NoListaDupla<T> ultimoNo;
	private int tamanhoLista;
	
	public ListaDupla() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	public void add(T elemento) {
		NoListaDupla<T> novoNo = new NoListaDupla<>(elemento);
		novoNo.setNoProximo(null);
		novoNo.setNoPrevio(ultimoNo);
		
		if(primeiroNo == null) {
			primeiroNo = novoNo;
		}
		if(ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}
		ultimoNo = novoNo;
		tamanhoLista++;
	}
	
	public void add(int index, T elemento) {
		NoListaDupla<T> noAuxiliar = getNo(index);
		NoListaDupla<T> novoNo = new NoListaDupla<>(elemento);
		novoNo.setNoProximo(noAuxiliar);
		
		if(novoNo.getNoProximo() != null) {
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
		} else {
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo = novoNo;
		}
		
		if(index == 0) {
			primeiroNo = novoNo;
		} else {
			novoNo.getNoPrevio().setNoProximo(novoNo);
		}
		
		tamanhoLista++;
	}
	
	public void remove(int index) {
		if(index == 0) {
			primeiroNo = primeiroNo.getNoProximo();
			if(primeiroNo != null) {
				primeiroNo.setNoPrevio(null);
			}
		} else {
			NoListaDupla<T> noAuxiliar = getNo(index);
			noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
			if(noAuxiliar != ultimoNo) {
				noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
			} else {
				ultimoNo = noAuxiliar;
			}
		}
		
		this.tamanhoLista--;
	}
	
	private NoListaDupla<T> getNo(int index) {
		NoListaDupla<T> noAuxiliar = primeiroNo;
		
		for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		
		return noAuxiliar;
	}
	
	public int size() {
		return tamanhoLista;
	}
	
	@Override
	public String toString() {
		String strRetorno = "";
		NoListaDupla<T> noAuxiliar = primeiroNo;
		
		for(int i = 0; i < size(); i++) {
			strRetorno += "[No {conteudo = " + noAuxiliar.getConteudo() + "}]";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		
		strRetorno += "null";
		return strRetorno;		
	}
}