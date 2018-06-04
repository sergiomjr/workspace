
public class TryCatch_Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nossaArray[] = new int[4];
		nossaArray[0]= 10;
		nossaArray[1]= 20;
		nossaArray[2]= 30;
		nossaArray[3]= 40;
		
		try{
			for(int i =0; i<4;i++){
				System.out.println(nossaArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("O erro " + ex.getMessage()+ " ocorreu ");
		}

	}

}
