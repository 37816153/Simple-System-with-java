package mainSentaBotaClasses;

public class Endereco {
	
	//atributos
	protected String pais;
	protected String cidade;
	
	//construtores 
	public Endereco(String pais, String cidade) {
		this.pais = pais;
		this.cidade = cidade;
	}
	
	//metodos
	public String getPais() {
		return pais;
	}
	
	public String getCidade(){
		return cidade;
	}
	

}



