import java.util.Arrays;


public class arraysClasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]numeros={1, 4, 0, -13, 2112, 14, 17};
		int posicao;
		
		System.out.println("Os elementos do array s�o: "+ Arrays.toString(numeros));
		System.out.println("Ordenando...");
		
		Arrays.sort(numeros);
		
		System.out.println("Arrays ordenado: "+ Arrays.toString(numeros));
		
		posicao= Arrays.binarySearch(numeros, 2112);
		System.out.println("Posi��o do elemento '2112': "+ posicao);
		
	}

}
