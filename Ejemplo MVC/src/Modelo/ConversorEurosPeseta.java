package Modelo;

public class ConversorEurosPeseta { // Adaptador de objetos
	private ConversorEuros conversor;

	public ConversorEurosPeseta() {
		conversor = new ConversorEuros(166.386D);
	}

	public double eurosApesetas(double cantidad) {
		return conversor.eurosAmoneda(cantidad);
	}

	public double pesetasAeuros(double cantidad) {
		return conversor.monedaAeuros(cantidad);
	}
}