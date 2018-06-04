
public class Casa {
	
	String cor;
	int totalDePortas;
	Porta[] portas = new Porta[3];
	
	
	void pinta (String s){
		this.cor = s;
	}
	
	void adicionaPortas(Porta p){
		for(int i =0;i< portas.length;i++){
			if(portas[i]== null){
				portas[i]= p;
				break;
			}
		}
	}

	public int quantasPortasEstaoAbertas(){
		int contadorDePortasAbertas = 0;
		for(int i =0; i < this.portas.length; i++){
			if(this.portas[i].aberta == true){
				contadorDePortasAbertas = contadorDePortasAbertas + 1;
			}
		}
		return contadorDePortasAbertas;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTotalDePortas() {
		return totalDePortas;
	}

	public void setTotalDePortas(int totalDePortas) {
		this.totalDePortas = totalDePortas;
	}

	public Porta[] getPortas() {
		return portas;
	}

	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}

	int totalDePortas(){
		for(int i = 0; i < portas.length;i++){
			if(this.portas[i] != null){
				totalDePortas += 1;
			}
		}
		return totalDePortas;
	}
	
	
}
