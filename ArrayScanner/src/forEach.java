import java.util.Scanner;


public class forEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] numero = new int[5];
	int soma = 0;
	Scanner entrada = new Scanner(System.in);
	
	for(int cont=0; cont < numero.length; cont++){
		System.out.print("Entre com o numero "+(cont +1)+":");
		numero[cont]= entrada.nextInt();
	}
	
	//exibindo e somando
	for(int cont : numero){
		soma += cont;
	}
		
	System.out.println("A soma dos numeros  que você digitou é "+soma );
	}

}
