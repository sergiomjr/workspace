
public class Funcionario {

private String nome;
private String sobrenome;
private int identidade;
private double salario;


Funcionario(String n,String sb, int i, double s){
	this.nome = n;
	this.sobrenome = sb;
	this.identidade = i;
	this.salario = s;
	
}

public Funcionario() {
	// TODO Auto-generated constructor stub
}

public double getSalario(){
	return salario;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getSobrenome() {
	return sobrenome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}

public int getIdentidade() {
	return identidade;
}

public void setIdentidade(int identidade) {
	this.identidade = identidade;
}

public void setSalario(double salario) {
	this.salario = salario;
}
	



}
