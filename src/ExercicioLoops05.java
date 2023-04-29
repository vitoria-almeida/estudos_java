import java.util.Scanner;

public class ExercicioLoops05 {
	public int numero;
	
	Scanner scan = new Scanner(System.in);
	
	public ExercicioLoops05() {}
	
	public void retornar() {
		System.out.println("Você deseja saber a tabuada de qual número?");
		numero = scan.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Tabuada de " + numero + " X " + i + " = " + numero * i);
		}
	}
}
