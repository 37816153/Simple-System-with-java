package mainSentaBotaClasses;

public class NotaFiscal extends MetodoPagamento {
		
	public NotaFiscal(String pais, String cidade, String nome, String cartao, String cpf) {
		super(pais, cidade, nome, cartao, cpf);
	}
	
	public String toString() {
		return "Nota fiscal: informacoes do Cliente"
				+ "\npais: "
				+ pais
				+ "\ncidade: "
				+ cidade
				+ "\nnome: "
				+ nome
				+ "\nCPF: "
				+ cpf;
	}

}
