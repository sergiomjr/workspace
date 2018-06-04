
public class Principal7Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(5000);
		cc.deposita(5000);
		cp.deposita(5000);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		System.out.println("\n Criando um banco com 3 contas");
		Banco banco = new Banco(3);
		banco.adiciona(c);
		banco.adiciona(cc);
		banco.adiciona(cp);
		
		for (int i = 0; i < banco.pegaTotalContas(); i ++){
			System.out.println("\n Funcionario  de numero " + (i+1));
			System.out.println("Saldo: %.2f \n " + banco.pegaConta(i).getSaldo());
			adc.roda(banco.pegaConta(i));
		}
		
		System.out.println("\n Saldo total: %.2f\n" + adc.getSaldoTotal());
		
	}

}
