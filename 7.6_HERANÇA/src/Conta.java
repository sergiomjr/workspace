
public class Conta {

	protected double saldo;
	
	
	void deposita(double x){
		this.saldo = this.saldo + x;
	}
	
	  void retira(double x){ 
		this.saldo = this.saldo - x;
		
		/*if(this.saldo > x){
			System.out.println("SAQUE REALIZADO COM SUCESSO");
			return true;
		}System.out.println("N�O FOI POSSIVEL REALIZAR A OPERA��O: SALDO INSUFICIENTE");
		return false;
	}*/
	  }
	public double getSaldo(){
		return this.saldo;
	}
	
	
	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	void atualiza(double taxaSelic){
		this.saldo = this.saldo * (1 + taxaSelic);
		
	}
	
}
