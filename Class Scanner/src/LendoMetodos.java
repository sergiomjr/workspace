import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class LendoMetodos {
	
	private Scanner entrada;
	
	public void abrir(){
		
		try{
			entrada = new Scanner(new File("Teste.txt"));
		}catch(FileNotFoundException arquivoNaoEncontrado){
			System.err.println("Nao foi possivel  abrir o arquivo! Nao encontrado");
			System.exit(1);// exit 0 é sucesso, outro numero significa que terminou com problemas;
		}
	}

	public void ler(){
		
		try{
			while(entrada.hasNext())
				System.out.printf("%s - %d\n" , entrada.next(),entrada.nextInt());
		}catch(NoSuchElementException entradaDiferente){
			System.err.println("Entrada Diferente da esperada");
			entrada.close();
			System.exit(1);
		}catch(IllegalStateException erroLeitura){
			System.err.println("Erro na Leitura. Scanner  foi  fechada antes  da input");
			System.exit(1);
		}	
	}
	
	public void fechar(){
		entrada.close();
	}
}
