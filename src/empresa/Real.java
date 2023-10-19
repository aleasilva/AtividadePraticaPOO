package empresa;

public class Real extends Moeda {
	double cotacao;
	
	public Real(double valor, double cotacao) {
		super(valor);
		this.cotacao = cotacao;
	}

	@Override
	public double converter() {
		double valorReal = valor * cotacao;
		return valorReal;
	}

	@Override
	public void info() {
		System.out.println("Cotaçao do Real: " + cotacao);
		System.out.println("Valor em real: " + valorReal.converter());
		
	}

}
