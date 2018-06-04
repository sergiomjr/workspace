
public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double s) {
		// TODO Auto-generated constructor stub
		this.saldoTotal = s;
	}
	
	public void roda(Conta c){
		System.out.println("Antes da atualização: %.2f\n" + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Depois da atualização: %.2f\n" + c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}


	public double getSaldoTotal() {
		return saldoTotal;
	}


	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
}
