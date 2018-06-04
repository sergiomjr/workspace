
public class LacosRepeticao8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y = 0;
		int x = 13;
		while(y!=1){
		   if(x % 2 == 0){
				y = x / 2;
				
			}else{
					y = 3* x + 1; 					
			}
		   System.out.print(" result " + y);
		   x = y;
		}
		 
	}

}
