
  class Funcionario{
	String nome;
	String departamento;
	String dataEntrada;
	String rg;
	double salario;
	boolean estaNaEmpresa;// = true;
	
	
	void Bonifica(double aumento){
		double novoSalario = this.salario + aumento;
		 this.salario = novoSalario;
	}
	double CalculaGanhoAnual(){
		return this.salario * 12;
	}
	 void Demite(){
		 this.estaNaEmpresa= true;
	 }
	
	 void mostra(){
		    System.out.println("Nome do Funcionario: " + this.nome);
			System.out.println("Nome do departamento: " + this.departamento);
			System.out.println("Data da Entrada: " + this.dataEntrada);
			System.out.println("Numero Rg: " + this.rg);
			System.out.println("Salario Inicial : " + this.salario);
	 }
}


public class Banco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Funcionario empregado = new Funcionario();
		empregado.nome = "Kakaroto";
		empregado.departamento = "T.I";
		empregado.dataEntrada = "01/01/2018";
		empregado.rg = "99.999.999-9";
		empregado.salario = 3300;
		
		empregado.mostra();
		/*
		System.out.println("Nome do Funcionario: " + empregado.nome);
		System.out.println("Nome do departamento: " + empregado.departamento);
		System.out.println("Data da Entrada: " + empregado.dataEntrada);
		System.out.println("Numero Rg: " + empregado.rg);
		System.out.println("Salario Inicial : " + empregado.salario);
		*/
		empregado.Demite();
		//empregado.estaNaEmpresa = true;
		if(empregado.estaNaEmpresa){
			System.out.println("Situacao : Empregado ");
		}else{
			System.out.println("Situação : Demitido ");
		}
		empregado.Bonifica(335);
		System.out.println("Salario após aumento: " + empregado.salario);
		System.out.println("Ganho anual: " + empregado.CalculaGanhoAnual());
		empregado.Demite();
		empregado.estaNaEmpresa = false;
		if(empregado.estaNaEmpresa){
			System.out.println("Situacao : Empregado ");
		}else{
			System.out.println("Situação : Demitido ");
		}

	}

	

}
