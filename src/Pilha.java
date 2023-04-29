
public class Pilha {
	private NoPilha refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	//acrescenta nó na pilha
	public void metodoPush(NoPilha novoNo) {
		NoPilha refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
		
	}
	
	public NoPilha metodoPop() {
		if(this.metodoIsEmpty() == false) {
			NoPilha noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}
	
	//mostra dado no topo da pilha
	public NoPilha metodoTop() {
		return refNoEntradaPilha;
	}
	
	public boolean metodoIsEmpty() {
		if(refNoEntradaPilha == null) return true;
		else return false;
	}

	@Override
	public String toString() {
		String stringRetorno = "----------------------\n";
		stringRetorno += "Pilha\n";
		stringRetorno += "----------------------\n";
		
		NoPilha noAuxiliar = refNoEntradaPilha;
		
		while(true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No {dado = " + noAuxiliar.getDado() + " }]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			} else {
				break;
			}
		}		
		
		stringRetorno += "------base------\n";
		return stringRetorno;
	}		
}