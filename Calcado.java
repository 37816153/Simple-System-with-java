package mainSentaBotaClasses;

public class Calcado {
	//atributos
	private int numero;
	private int price;
	private String cor;
	private int estoque;
	
	//construtor
	public Calcado(int numero, int price, String cor, int estoque) {
		this.numero = numero;
		this.price = price;
		this.cor = cor;
		this.estoque = estoque;
	}
	//metodos
	public String getCor() {
		return cor;
	}
	
	public int getPrice() {
		return price;
	}
    
	public int getNumero() {
		return numero;
	}
	
	public int desconto(int cupom) {
		price -= cupom;
		return price;
	}
	
	public void subEstoque(int quantidade) {
		estoque -= quantidade;
	}
	
	public void addEstoque(int quantidade) {
		estoque += quantidade;
	}
	
	public int getEstoque() {
		return estoque;
	}
	public String toString() {
		return cor
			+", numero: "
			+ numero
			+ ", price: "
			+ price;
	}
    
}
