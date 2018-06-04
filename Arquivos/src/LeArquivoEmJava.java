import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class LeArquivoEmJava {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	InputStream entrada = new FileInputStream("File2.txt");
	int umByte = entrada.read();
	 
	while(umByte != -1){
		System.out.print((char)umByte);
		umByte = entrada.read();
	}
	entrada.close();
	//System.out.println(umByte);
	//System.out.print((char)umByte);	
	}

}
