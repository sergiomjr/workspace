

public class ManipuladorDeSeguroDeVida {

	private SeguroDeVida seguroDeVida;
	
	

	public SeguroDeVida getSeguroDeVida() {
		return seguroDeVida;
	}

	public void setSeguroDeVida(SeguroDeVida seguroDeVida) {
		this.seguroDeVida = seguroDeVida;
	}
	
	
public void criaSeguro(SeguroDeVida evento){
	this.seguroDeVida = new SeguroDeVida();
	this.seguroDeVida.setNumeroApolice(numeroApolice);
	
	
	}
	
	
}
