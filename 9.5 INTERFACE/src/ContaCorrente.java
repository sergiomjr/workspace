
public class ContaCorrente extends Conta implements Tributavel {

	public void saca(double valor){
		//this.saldo -= (valor + 0.10);
		super.saca(valor + 0.10);
		
	}

	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.getSaldo()* 0.01;
	}

	
	public String getTitular() {
		// TODO Auto-generated method stub
		return this.getTitular();
	}
	

	public String getTipo() {
		// TODO Auto-generated method stub
		return "ContaCorrente";
	}
	
}
