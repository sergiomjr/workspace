
public class TestaEmpresa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa e1 = new Empresa();
		e1.setNomeEmpresa("BEBIDAS ARARAQUARA");
		e1.setCnpj(999999);
		Funcionario f1 = new Funcionario();
		f1.setNome("JUCA");
		f1.setSalario(3500);
		Funcionario f2 = new Funcionario();
		f2.setNome("MARIA");
		f2.setSalario(3500);
		e1.adicionaFuncionario(f1);
		e1.adicionaFuncionario(f2);
		e1.toString();
		e1.contem(f2);
	}

}
