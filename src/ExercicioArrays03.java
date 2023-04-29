import java.util.Random;

public class ExercicioArrays03 {
	Random random = new Random();
	int[] numerosAleatorios = new int[5];
	
	public void retornar() {
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("Numeros aleatórios: ");
		for(int numero : numerosAleatorios) {
			System.out.println(numero);
			int num = 5, count = 1;
	        do {
	            num += count;
	            System.out.println(num);
	        } while (count <= 3);
		}
		
		System.out.println("Sucessores dos numeros aleatórios: ");
		for(int numero : numerosAleatorios) {
			System.out.println(numero + 1);
		}
	}
}
