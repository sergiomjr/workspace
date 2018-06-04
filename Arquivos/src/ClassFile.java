import java.io.File;
import java.util.Scanner;


public class ClassFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o endere�o valido de um arquivo: ");
		String caminho = entrada.nextLine();
		
		metodos(caminho);
		entrada.close();
	}

	private static void metodos(String caminho) {
		// TODO Auto-generated method stub
		
		File arquivo = new File(caminho); 
		
		if(arquivo.exists()){
			System.out.println("O caminho especificado existe ! \nVamos aos testes:\n");
			
			if(arquivo.isAbsolute())
			System.out.println("� um caminho absoluto");	
			else 
				System.out.println("N�o � um caminho absoluto");
			
			if(arquivo.isFile())
				System.out.printf("� um  arquivo de tamanho %s bytes\n"
						+ "Ultima vez modificado %s\n"
						+ "Cujo o caminho � %s\n"
						+ "De caminho absoluto %s\n"
						+ "E est� no diret�rio pai %s\n",
						arquivo.length(), arquivo.lastModified(), arquivo.getPath(),
						arquivo.getAbsolutePath(), arquivo.getParent());
			else{
				System.out.println("� um diretorio cujo  conteudo tem os seguintes arquivos: ");
				String[] arquivos = arquivo.list();
				
				for(String file: arquivos)
					System.out.println(file);
				
			}
		}else
			System.out.println("Endere�o errado ");
		
	}
 
}
