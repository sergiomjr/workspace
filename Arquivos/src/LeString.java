import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class  LeString {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream entrada = new FileInputStream("File.txt");
		InputStreamReader entradaFormatada = new InputStreamReader(entrada);
		BufferedReader entradaString = new BufferedReader(entradaFormatada);
		
		String linha = entradaString.readLine();
		
		while (linha != null){
			System.out.println(linha);
			linha = entradaString.readLine();
		}
		entradaString.close();
	}

}
