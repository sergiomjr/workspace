
public class VelocidadeUltrapassadaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double valor;
	private double maximo;
	
	public VelocidadeUltrapassadaException(double valor, double maximo){
		this.valor = valor;
		this.maximo = maximo;
		
	}

	protected double getValor() {
		return valor;
	}

	protected double getMaximo() {
		return maximo;
	}
	
   public String getMessage(){
	   return "Voce tentou ir para a velocidade " 
   + this.valor + " sendo que sua velocidade maxima era " + this.maximo;
   }
	
	
}
