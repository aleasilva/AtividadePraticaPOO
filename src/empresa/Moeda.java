package empresa;

public abstract class Moeda extends Cofrinho {
	double valor;
	
	public Moeda(double valor) {
		this.valor = valor;
	}

	abstract void info();
	
	abstract double converter();
	
	
	
	
	
	
	
	
	
	
	
}
