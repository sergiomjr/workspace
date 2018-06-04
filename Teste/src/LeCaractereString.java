import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeCaractereString {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		FileInputStream entrada = new FileInputStream("File.txt");
		InputStreamReader entradaFormatada = new InputStreamReader(entrada);
		int c = entradaFormatada.read();
		
		System.out.println(c);
		
	}

}
