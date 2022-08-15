import java.util.List;

public class Banco {
	
	//Atributo
	
	private String nome;
	private List<Conta> conta;
	
	
	//GET & SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getConta() {
		return conta;
	}

	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}
	
	
	

}
