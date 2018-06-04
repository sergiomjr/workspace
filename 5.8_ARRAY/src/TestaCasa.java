
public class TestaCasa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Casa minhaCasa = new Casa();
		Porta p1 = new Porta();
		Porta p2 = new Porta();
		Porta p3 = new Porta();
		minhaCasa.setCor("AMARELA");
		//minhaCasa.pinta("Azul");
		p1.aberta = true;
		minhaCasa.adicionaPortas(p1);
		p2.aberta = false;
		minhaCasa.adicionaPortas(p2);
		p3.aberta = true;
		minhaCasa.adicionaPortas(p3);
		int resultadoPortasAbertas = minhaCasa.quantasPortasEstaoAbertas();
		System.out.println(resultadoPortasAbertas + " portas estão abertas");
		int resultadoTotalPortas = minhaCasa.totalDePortas();
		System.out.println("Há " + resultadoTotalPortas + " portas na casa");
		//minhaCasa.quantasPortasEstaoAbertas();
		//minhaCasa.totalDePortas();

	}

}
