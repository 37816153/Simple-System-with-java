package mainSentaBotaClasses;

public class Pessoa extends Endereco {

	//atributos
	protected String nome;
	protected String cpf;
	
	//construtores
	public Pessoa(String pais, String cidade, String nome,String cpf) {
		super(pais,cidade);
		this.nome = nome;
		this.cpf = cpf;
		
	}
	//metodos
	public String getNome() {
		return nome;
	}
	
	public void setName(String x) {
		this.nome = x;
	}
    
	
}
