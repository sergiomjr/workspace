import java.util.Scanner;
import java.util.Calendar;


public class ClasseScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	int idade;
	int ano_atual;
		
	//pergunta a idade e armazena
		System.out.println("Digite sua Idade: ");
		idade = entrada.nextInt();
		
	//criando um objeto  do tipo Calendar, o 'calendario' e armazenando o ano 
   // atual
		
	Calendar calendario = Calendar.getInstance();
	ano_atual = calendario.get(Calendar.YEAR);
	
	System.out.printf("Voce nasceu em " +(ano_atual - idade)+ "\n", null);
	//System.out.printf("Voce nasceu em " +(calendario.get(Calendar.YEAR)- entrada.nextInt()), null);	
		
	}

}
