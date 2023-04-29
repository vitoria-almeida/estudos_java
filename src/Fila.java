public class Fila<T> {
	private NoFila<T> refNoEntradaFila;
	
	public Fila() {
		this.refNoEntradaFila = null;
	}
	
	public void metodoEnqueue(T obj) {
		NoFila<T> novoNo = new NoFila<T>(obj);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo; 
	}
	
	public T metodoFirst() {
		if (!this.metodoIsEmpty()) {
			NoFila<T> primeiroNo = refNoEntradaFila;
			while (true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				} else {
					break;
				}
			} return primeiroNo.getObject();
		} return null;
	}
	
	public T metodoDequeue() {
		if (!this.metodoIsEmpty()) {
			NoFila<T> primeiroNo = refNoEntradaFila;
			NoFila<T> noAuxiliar = refNoEntradaFila;
			while (true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				} else {
					noAuxiliar.setRefNo(null);
					break;
				}
			} return primeiroNo.getObject();
		} return null;
	}
	
	public boolean metodoIsEmpty() {
		return refNoEntradaFila == null ? true : false;	
	}

	@Override
	public String toString() {
		String stringRetorno = "";
		NoFila<T> noAuxiliar = refNoEntradaFila;
		
		if(refNoEntradaFila != null) {
			while(true) {
				stringRetorno += "[No {objeto = " + noAuxiliar.getObject() + "}]";
				
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				} else break;
			}
		} 
		else stringRetorno = "Null";	
		
		return stringRetorno;
	}	
}