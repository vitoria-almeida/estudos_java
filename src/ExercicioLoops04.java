import java.util.Scanner;

public class ExercicioLoops04 {
	int quantNumero;
	Scanner scan = new Scanner(System.in);
	
	public ExercicioLoops04(int quantNumero) {
		super();
		this.quantNumero = quantNumero;
	}
	
	public ExercicioLoops04() {}
	
	public void retornar() {
		System.out.println("Quantos números você deseja inserir?");
		quantNumero = scan.nextInt();
		
		int count = 0;
		int numero = 0;		
		int par = 0, impar = 0;
		
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) par = par + 1;
			else impar = impar + 1;
			
			count = count + 1;
		} while(count < quantNumero);
		
		System.out.println(par);
		System.out.println(impar);
	}
}
