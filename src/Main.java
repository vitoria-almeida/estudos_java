public class Main {
	public static void main(String[] args) {
		//ExercicioLoops01 exercicio1 = new ExercicioLoops01();
		//exercicio1.retornarArray();
		
		//ExercicioLoops02 exercicio2 = new ExercicioLoops02();
		//exercicio2.retornar();
		
		//ExercicioLoops03 exercicio3 = new ExercicioLoops03();
		//exercicio3.retornar();
		
		//ExercicioLoops04 exercicio4 = new ExercicioLoops04();
		//exercicio4.retornar();
		
		//ExercicioLoops05 exercicio5 = new ExercicioLoops05();
		//exercicio5.retornar();
		
		//ExercicioLoops06 exercicio6 = new ExercicioLoops06();
		//exercicio6.retornar();
		
		//ExercicioArrays01 exercicio7 = new ExercicioArrays01();
		//exercicio7.retornar();
		
		//ExercicioArrays02 exercicio8 = new ExercicioArrays02();
		//exercicio8.retornar();
		
		//ExercicioArrays03 exercicio9 = new ExercicioArrays03();
		//exercicio9.retornar();
		
		//ExercicioArrays04 exercicio10 = new ExercicioArrays04();
		//exercicio10.retornar();
		
		/*No no1 = new No("Conteúdo No 1");
		
		No no2 = new No("Conteúdo No 2");
		no1.setProximoNo(no2);
		
		No no3 = new No("Conteúdo No 3");
		no2.setProximoNo(no3);
		
		No no4 = new No("Conteúdo No 4");
		no3.setProximoNo(no4);
		
		//no1 -> no2 -> no3 -> no4 -> null
		
		System.out.println(no1.getProximoNo());
		System.out.println(no2.getProximoNo());
		System.out.println(no3.getProximoNo());
		System.out.println(no4.getProximoNo());*/
		
		/*GenericsNo<String> no1 = new GenericsNo<String>("Conteúdo Generics No 1");
		
		GenericsNo<String> no2 = new GenericsNo<String>("Conteúdo Generics No 2");
		no1.setProximoNo(no2);
		
		GenericsNo<String> no3 = new GenericsNo<String>("Conteúdo Generics No 3");
		no2.setProximoNo(no3);
		
		GenericsNo<String> no4 = new GenericsNo<String>("Conteúdo Generics No 4");
		no3.setProximoNo(no4);
		
		//no1 -> no2 -> no3 -> no4 -> null
		
		System.out.println(no1.getProximoNo());
		System.out.println(no2.getProximoNo());
		System.out.println(no3.getProximoNo());
		System.out.println(no4.getProximoNo());*/
		
		/*Pilha pilha1 = new Pilha();
		pilha1.metodoPush(new NoPilha(1));
		pilha1.metodoPush(new NoPilha(2));
		pilha1.metodoPush(new NoPilha(3));
		pilha1.metodoPush(new NoPilha(4));
		pilha1.metodoPush(new NoPilha(5));
		pilha1.metodoPush(new NoPilha(6));
		System.out.println(pilha1);
		
		System.out.println("Tirar da pilha: " + pilha1.metodoPop());
		System.out.println(pilha1);
		System.out.println("Topo da pilha: " + pilha1.metodoTop());
		
		pilha1.metodoPush(new NoPilha(666666));
		System.out.println(pilha1);
		
		System.out.println("Topo da pilha: " + pilha1.metodoTop());
		
		System.out.println("False se a pilha não estiver vazia e true se estiver vazia: " + pilha1.metodoIsEmpty());*/
	
		Fila fila1 = new Fila();
		fila1.metodoEnqueue("um");
		fila1.metodoEnqueue("dois");
		fila1.metodoEnqueue("tres");
		fila1.metodoEnqueue("quatro");
		fila1.metodoEnqueue("cinco");
		fila1.metodoEnqueue("seis");
		
		System.out.println(fila1);
		
		System.out.println(fila1.metodoDequeue());
		
		System.out.println(fila1);
		
		fila1.metodoEnqueue("ultimooo");
		System.out.println(fila1);
		
		System.out.println(fila1.metodoFirst());
	}
}
