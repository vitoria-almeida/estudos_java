import java.util.Scanner;

public class ExercicioLoops06 {	
	public int numero;
	
	Scanner scan = new Scanner(System.in);
	
	public ExercicioLoops06() {}
	
	public void retornar() {
		System.out.println("Você deseja saber o fatorial de qual número?");
		numero = scan.nextInt();
		int multiplicacao = 1;
		
		for(int i = numero; i >= 1; i--) {
			multiplicacao = multiplicacao * i;
		}
		
		System.out.println(numero + "! = " + multiplicacao);
	}
}