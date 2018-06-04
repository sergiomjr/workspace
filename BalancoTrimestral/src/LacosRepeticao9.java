
public class LacosRepeticao9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int result = 0;
		
		do{
			System.out.println(result);
			//nao recebe valor anterior se o valor for 0
			if(result != 0){
				//recebe valor anterior
				i = result - i;
			}
			//soma os 2 ultimos valores
			result = result + i;
		}while( result <= 100);
		
	}

}
