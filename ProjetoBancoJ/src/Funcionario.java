
public class Funcionario {

	String nome;
	String departamento;
	double salario;
	String dtEntrada;
	String rg;
	boolean ativo;
	
	
	void bonifica(double valor){
		double salarioNovo = this.salario + valor;
		this.salario = salarioNovo;
	}
	
	void demite(){
		System.out.println("Funcionario demitido");
		 this.ativo = true;
		
	}
}
