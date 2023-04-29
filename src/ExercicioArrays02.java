import java.util.Scanner;

public class ExercicioArrays02 {
	Scanner scan = new Scanner(System.in);
	String[] consoantes = new String[6];
	int qtdConsoantes = 0;
	
	public void retornar() {		
		int count = 0;
		
		do {
			System.out.println("Letra: ");
			String letra = scan.next();
			
			if (!(letra.equalsIgnoreCase("a") | 
				letra.equalsIgnoreCase("e") |
				letra.equalsIgnoreCase("i") |
				letra.equalsIgnoreCase("o") |
				letra.equalsIgnoreCase("u"))); {
				consoantes[count] = letra;
				qtdConsoantes++;
			}
				
			count++;
		} while (count < consoantes.length);
		
		System.out.println("Consoantes: ");
		for(String consoante : consoantes) {
			if (consoante != null) {
				System.out.println(consoante);
			}
		}
	}
}