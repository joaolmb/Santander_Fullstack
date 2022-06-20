package exemplosJava;

public class Carro {
	String cor;
	String modelo;
	double capacidadeTanque;
	
	// Temos boas práticas aqui:
	
	// Construtores abaixo dos atributos
	public Carro(String cor, String modelo, double capacidadeTanque) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public Carro() {
		
	}
	
	// Getters and Setters abaixo do(s) construtor(es)
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	// Outros métodos por último
	double calcularTotal(double valorGasolina) {
		return capacidadeTanque*valorGasolina;
	}
	
}
