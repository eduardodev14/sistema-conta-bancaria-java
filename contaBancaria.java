
public class contaBancaria {

	public String titular;
	public double saldo;
	
	
	public void depositar(double valor) {
		if( valor > 0) {
			saldo += valor;
		}
		else {
			System.out.println("Não foi possivel realizar o deposito, tente outro valor!");
		}
	}
	
	public void sacar(double valor) {
		if(valor > 0  &  valor <= saldo){
			saldo -= valor;
		}
		else {
			System.out.println("Não foi possivel realizar o saque, tente outro valor!");
		}
	}
	
	public double exibirSaldo() {
		return saldo;
	}
	
}
