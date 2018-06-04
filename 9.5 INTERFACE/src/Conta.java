
public class Conta {

	

		protected double saldo;
		
		Conta(double s){
			this.saldo = s; 
			
		}
		
		Conta(){
			
		}
		
		public void saca(double s){
			this.saldo -= s;
			
		}
		
		public void deposita(double s){
			this.saldo += s;
		}
		
		public double getSaldo(){
			return this.saldo;
		}
		
		void atualiza(double taxa){
			this.saldo += this.saldo * taxa;
		}
		
		
		
	}

	

