
public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;
	
	
	public AtualizadorDeContas(double selic) {
	
		this.selic = selic;
	}
	
	public void roda(Conta c){
		System.out.printf("Antes da atualiza��o: %.2f\n" , c.getSaldo());
		c.atualiza(this.selic);
		System.out.printf("Depois da atualiza��o: %.2f\n ", c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}
	
	public  double getSaldo(){
		return saldoTotal;
	}
}
