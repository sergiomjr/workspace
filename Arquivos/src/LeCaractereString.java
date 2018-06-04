import java.io.*;

public class LeCaractereString {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		FileInputStream entrada = new FileInputStream("File.txt");
		InputStreamReader entradaFormatada = new InputStreamReader(entrada);
		int c = entradaFormatada.read();
		
		while(c!= -1){
		//System.out.println(c);
		System.out.print((char)c);
		c = entradaFormatada.read();
		}
		entradaFormatada.close();
	}
}
