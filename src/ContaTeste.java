
public class ContaTeste {
	public static void main(String[] args) {
		
		Cliente Felipe = new Cliente();
		Felipe.setNome ("Felipe");
		
		Conta cc = new ContaCorrente(Felipe);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(Felipe);
		
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
