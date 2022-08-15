
public class App {
	
	public static void main(String[] args) {
		
		Cliente wilame = new Cliente();
		wilame.setNome("wilame");
		
		Conta corente = new ContaCorente(wilame);
		Conta poupanca = new ContaPoupanca(wilame);
		
	
		corente.depositar(100);	//deposito na conta corrente		
		corente.tranferir(100, poupanca); // da conta corrente para conta poupança
		
		corente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
