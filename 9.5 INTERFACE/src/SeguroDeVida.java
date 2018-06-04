
public class SeguroDeVida implements Tributavel {

	private double valor;
    private String titular;
    private int numeroApolice;
    
    
    public double getValorImposto() {
        return 42 + this.valor * 0.02;
    }
    
	public String getTitular() {
		// TODO Auto-generated method stub
		return this.titular;
	}
	public String getTipo() {
		// TODO Auto-generated method stub
		return "SEGURO DE VIDA";
	}

	protected double getValor() {
		return valor;
	}

	protected void setValor(double valor) {
		this.valor = valor;
	}

	protected void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
    
    
	
}
