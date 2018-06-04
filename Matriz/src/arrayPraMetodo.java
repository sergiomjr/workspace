import java.util.Scanner;


public class arrayPraMetodo {

	
public static void exibeMatriz(int[][]Mat){
	 System.out.println("\nA matriz ficou: \n");
	 for(int linha =0; linha < 3; linha++){
		 for(int coluna =0; coluna < 3; coluna++){
			 System.out.printf("\t %d \t",Mat[linha][coluna]);
		 }
		 System.out.println();
	 }
	
	
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]matriz = new int[3][3];
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Matriz m[3][3]\n");
		
		for(int linha=0; linha <3; linha++){
		   for(int coluna =0;coluna <3;coluna++){
			   System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
			   matriz[linha][coluna]= entrada.nextInt();
		   }
		}
		exibeMatriz(matriz);
	}

}
