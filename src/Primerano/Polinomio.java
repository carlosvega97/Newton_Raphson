package Primerano;

public class Polinomio {
	private String simbolo;
	private int numero;
	private String simboloExp;
	private int exponente;

	public Polinomio() {
		// TODO Auto-generated constructor stub
	}

	public Polinomio(String simbolo, int numero, int exponente, String simboloExp) {
		this.simbolo = simbolo;
		this.numero = numero;
		this.simboloExp = simboloExp;
		this.exponente = exponente;

	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getSimboloExp() {
		return simboloExp;
	}

	public void setSimboloExp(String simboloExp) {
		this.simboloExp = simboloExp;
	}

	public int getExponente() {
		return exponente;
	}

	public void setExponente(int exponente) {
		this.exponente = exponente;
	}

}