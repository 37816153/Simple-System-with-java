package mainSentaBotaClasses;

public class MetodoPagamento extends Pessoa {
	
	protected String cartao;
	
	public MetodoPagamento(String pais, String cidade, String nome,String cpf, String cartao) {
		super(pais, cidade, nome, cpf);
		this.cartao = cartao;
	}
	
	public void setCartao(String x) {
		this.cartao = x;
	}
	
	public String getCartao() {
		return cartao;
	}
}
