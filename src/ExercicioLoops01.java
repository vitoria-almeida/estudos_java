import java.util.ArrayList;
import java.util.Scanner;

//escreva um programa que receba vários nomes e seja interrompido quando o número 0 for inserido
public class ExercicioLoops01 {
	public ArrayList<String> nomes = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);
	
	public ExercicioLoops01(ArrayList<String> nomes) {
		super();
		this.nomes = nomes;
	}

	public ExercicioLoops01() {}

	public void retornarArray() {
		while(true) {				
			System.out.println("Nome: ");
			String nome = scan.nextLine();
			System.out.println("Sobrenome: ");
			String sobrenome = scan.nextLine();
			
			if(nome.equals("0") || sobrenome.equals("0")) {
				break;
			} else if(nome.equals("") == !false || sobrenome.equals("") == !false) {
				System.out.println("Nome inválido, falta nome ou sobrenome.");
				retornarArray();
			} 
			
			nomes.add(nome + " " + sobrenome);		
		}
		
		System.out.println(nomes);		
	}	
}