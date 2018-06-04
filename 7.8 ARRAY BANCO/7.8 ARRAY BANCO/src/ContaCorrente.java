
public class ContaCorrente extends Conta {

	ContaCorrente(double s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void atualiza(double taxa){
		//this.saldo += this.saldo * taxa * 2;
		super.atualiza(taxa * 2);
	}
	
	public void deposita (double s){
		//this.saldo += s;
		this.saldo +=  s - 0.10;
	}
	
	
}
