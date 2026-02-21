import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		contaBancaria banco = new contaBancaria();
		
		System.out.print("Digite o nome do titular: ");
		banco.titular = sc.nextLine();
	
		int opcao = 0;
		
		while(opcao != 4) {
			
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Ver saldo");
		System.out.println("4 - Sair");
		
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.print("Digite o valor para deposito: ");
			double valor = sc.nextDouble();
			banco.depositar(valor);
		}
		else if (opcao == 2) {
			System.out.print("Digite para saque: ");
			double valor = sc.nextDouble();
			banco.sacar(valor);
		}
		else if (opcao == 3) {
			System.out.println("Saldo atual: " + banco.exibirSaldo());
		
		}
		else {
			System.out.println("Você encerrou o programa...");
		}
		
		
		
		
		}
	
		
		
		
		
		
		sc.close();
	}
}
