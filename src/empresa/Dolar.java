package empresa;

public class Dolar extends Moeda {
	double cotacao;
	double valorDolar;
	
	
	
	public Dolar(double valor, double cotacao, double valorDolar) {
		super(valor);
		this.cotacao = cotacao;
		this.valorDolar = valorDolar;
	}

	@Override
	public double converter() {
		cotacao = 4.79;
		valorDolar = valor * cotacao;
		return valorDolar;
	}

	@Override
	public void info() {
		System.out.println("Cotaçao do Dolar: " + cotacao);
		System.out.println("Valor em Dolar: " + valorDolar);
		
	}

}
