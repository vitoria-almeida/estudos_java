public class Fila {
	private NoFila refNoEntradaFila;
	
	public Fila() {
		this.refNoEntradaFila = null;
	}
	
	public void metodoEnqueue(Object obj) {
		NoFila novoNo = new NoFila(obj);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo; 
	}
	
	public Object metodoFirst() {
		if (!this.metodoIsEmpty()) {
			NoFila primeiroNo = refNoEntradaFila;
			while (true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				} else {
					break;
				}
			} return primeiroNo.getObject();
		} return null;
	}
	
	public Object metodoDequeue() {
		if (!this.metodoIsEmpty()) {
			NoFila primeiroNo = refNoEntradaFila;
			NoFila noAuxiliar = refNoEntradaFila;
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
		NoFila noAuxiliar = refNoEntradaFila;
		
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