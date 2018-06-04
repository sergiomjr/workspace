
public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}
	
	ContaPoupanca(double s){
		this.saldo = s;
	}
	
	void atualiza(double taxaSelic){
		
		this.saldo = this.saldo *(taxaSelic * 0.75);
	}
	
}
