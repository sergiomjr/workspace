
public class ContaCorrente extends Conta {

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}
	ContaCorrente(double s){
		this.saldo = s;
	}
	
	
	void atualiza(double taxaSelic){
		this.saldo = this.saldo * (taxaSelic * 2);// - 15.00);
	}
	void deposita(double s){
		this.saldo = this.saldo + s;
		this.saldo = this.saldo - 15;
	}

}
