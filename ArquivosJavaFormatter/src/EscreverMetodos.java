import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.lang.SecurityException;


public class EscreverMetodos {

	private Formatter arquivo;
	
	public void abrir(){
		
		try{
			arquivo = new Formatter("ProgramaçãoProgressiva.txt");
		}
		catch(SecurityException semPermissao){
			System.err.println("Sem permissão para escrever  no arquivo ");
			System.exit(1);// exit 0 é sucesso, outro numero significa que terminou com problemas;
		}
		catch(FileNotFoundException arquivoInexistente){
			System.err.println(" Arquivo Inexistente ou arquivo não pode ser criado ");
			System.exit(1);
		}
	}
	
	public void escrever(){
		try{
			arquivo.format("Escrita no arquivo realizada com sucesso ", null);
		}
		catch(FormatterClosedException formatoDesconhecido){
			System.err.println("Erro ao escrever");
			return;
		}
		catch(NoSuchElementException execaoElemento){
			System.err.println("Entrada invalida. Por exemplo, era pra ser uma String, mas foi um inteiro ");
		}
	}
	public void fechar(){
		arquivo.close();
	}
}
