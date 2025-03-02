package banco;
import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		String agencia, nome;
		double saldo;
		
		System.out.println("Por favor, digite o número da Conta !");
		numero = scanner.nextInt();
		System.out.println("Por favor, digite seu nome !");
		nome = scanner.next();
		System.out.println("Por favor, digite o número da Agência !");
		agencia = scanner.next();
		System.out.println("Por favor, digite o saldo !");
		scanner.nextLine();
		saldo = scanner.nextDouble();
		
		System.out.print("Olá "+ nome +" obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta: " + numero + " e seu saldo " + saldo +", já está disponível para saque");
		// TODO Auto-generated method stub
		scanner.close();

	}

}
