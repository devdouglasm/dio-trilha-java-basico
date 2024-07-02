import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia = "";
        String nomeCliente = "";
        double saldo;

        System.out.println("Digite seu nome por favor: ");
        nomeCliente = scanner.next();

        System.out.println("Digite sua agência: ");
        agencia = scanner.next();

        System.out.println("Digite o numero da sua conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
