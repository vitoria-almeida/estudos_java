import java.util.Scanner;

public class ExercicioLoops02 {
	public int nota;
	
	Scanner scan = new Scanner(System.in);

	public ExercicioLoops02(int nota) {
		super();
		this.nota = nota;
	}
	public ExercicioLoops02() {}
	
	public void retornar() {
		System.out.println("Digite uma nota entre 0 a 10: ");
		int nota = scan.nextInt();
			
		while(nota < 0 || nota > 10) {
			System.out.println("Valor inválido. Digite novamente: ");
			nota = scan.nextInt();
		}
		
		System.out.println("nota: " + nota);
	}		
}