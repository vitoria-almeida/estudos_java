import java.util.Scanner;

public class ExercicioLoops03 {
	public int numero;

	Scanner scan = new Scanner(System.in);
	
	public ExercicioLoops03(int numero) {
		super();
		this.numero = numero;
	}
	
	public ExercicioLoops03() {}
	
	public void retornar() {
		int count = 0;
		int maior = 0;
		int soma = 0;
		
		do {
			System.out.println("numero: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			if (numero > maior) maior = numero; 
			
			count = count + 1;
		} while(count < 5);
		
		System.out.println("Maior número: " + maior);
		System.out.println("Média: " + soma/5);
	}
}