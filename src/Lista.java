
public class Lista<T> {
	NoLista<T> referenciaEntrada;
	
	public Lista() {
		this.referenciaEntrada = null;
	}	
	
	public void add(T conteudo) {
		NoLista<T> novoNo = new NoLista<>(conteudo);
		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		NoLista<T> noAuxiliar = referenciaEntrada;
		for(int i = 0; i < this.size() - 1; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		noAuxiliar.setProximoNo(novoNo);
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	private NoLista<T> getNo(int index) {
		validaIndice(index);
		
		NoLista<T> noAuxiliar = referenciaEntrada;
		NoLista<T> noRetorno = null;
		
		for(int i = 0; i <= index; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		return noRetorno;
	}
	
	public T remove(int index) {
		NoLista<T> noRemov = this.getNo(index);
		
		if(index == 0) {
			referenciaEntrada = noRemov.getProximoNo();
			return noRemov.getConteudo();
		}
		
		NoLista<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noRemov.getProximoNo());
		return noRemov.getConteudo();
	}
	
	public int size() {
		int tamanhoLista = 0;
		NoLista<T> referenciaAux = referenciaEntrada;
		
		while(true) {
			if(referenciaAux != null) {
				tamanhoLista++;
				
				if(referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();
				} else break;
			} else break;
		}
		
		return tamanhoLista;
	}
	
	private void validaIndice(int index) {
		if(index >= size()) {
			int ultimoIndice = size() - 1;
			throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Essa lista só vai até o índice " + ultimoIndice + ".");
		}
	}
	
	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;
	}
	
	@Override
	public String toString() { 
		String strRetorno = "";
		NoLista<T> noAuxiliar = referenciaEntrada;
		
		for(int i = 0; i < this.size(); i++) {
			strRetorno += "[NoLista {conteudo = " + noAuxiliar.getConteudo() + "}] ---> ";
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		strRetorno += "NULL";
		return strRetorno;
	}
}