
public class ContaCorente extends Conta {

	public ContaCorente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato da Conta Corrente");
		super.ImprimirInformacaoComuns();		
	}
}
