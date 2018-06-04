
public class Banco {

	private Conta[] contas;
	private int capacidade,
	numContas = 0;
	
	
	public Banco(int capacidade){
		
		this.capacidade = capacidade;
		contas = new Conta[this.capacidade];
		
	}
	
	public void adiciona (Conta c){
		   if(numContas < capacidade){
			   contas[numContas] = c;
			   numContas ++;
		}else {
			
			System.out.println("NUMEROS DE CONTAS NO LIMITE");
		}
		
	}
	
	public Conta pegaConta(int x){
		if(x < capacidade){
			return contas[x];
		}else{
			System.out.println("ESSA CONTA NÃO EXISTE");
			return null;
		}
	}
	
	public int pegaTotalContas(){
		return this.numContas;
	}
	
}
