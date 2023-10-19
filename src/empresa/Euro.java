package empresa;

public class Euro extends Moeda{
	double cotacao;
	double valorEuro;
	
	public Euro(double valor, double cotacao, double valorEuro) {
		super(nome, valor);
		this.cotacao = cotacao;
		this.valorEuro = valorEuro;
	}

	@Override
	public double converter() {
		cotacao = 5.37;
		valorEuro = valor * cotacao;
		return valorEuro;
	}
	
	@Override
	public void info() {
		System.out.println("Cotaçao do Euro: " + cotacao);
		System.out.println("Valor em Euro: " + valorEuro);
		
	}


}
