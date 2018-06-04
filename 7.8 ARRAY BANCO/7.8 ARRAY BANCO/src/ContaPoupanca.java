
public class ContaPoupanca extends Conta {

	public ContaPoupanca(double s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	
	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}
	
	public void atualiza(double taxa){
		
		//this.saldo += this.saldo * taxa * 3;
		super.atualiza(taxa * 3);
		
	}
	
	
}
