public class ExercicioArrays01 {
	public int[] idades = {18, 15, 23, 27, 12};
	
	public void retornar() {
		int count = 0;
		
		System.out.println("Vetor: ");
		while(count < (idades.length)) {
			System.out.println(idades[count]);
			count++;
		}
		System.out.println("Vetor: ");
		for(int i = (idades.length - 1); i >= 0; i--) {
			System.out.println(idades[i]);
		}
	}
}