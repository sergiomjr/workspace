
public class TryCatch_Teste2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Carro{
			private double velocidade;
			private double velocidadeMaxima = 120;
			
			void acelera(double valor){
				if(valor + this.velocidade > this.velocidadeMaxima){
					throw new VelocidadeUltrapassadaException(valor + this.velocidade , 
							this.velocidadeMaxima);
					}else{
						this.velocidade += valor;
					}
				
			}
			
		}

		Carro c = new Carro();
		try{
		c.acelera(100);
		c.acelera(100);
		}catch(VelocidadeUltrapassadaException ex){
			System.out.println("problemas: " + ex.getMessage());
		}
		
	}

}
