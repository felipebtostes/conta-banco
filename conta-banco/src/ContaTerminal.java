/**
 * @author Felipe Borsato Tostes (Filho de Everton Andrade Tostes, titular da conta)
 * @version 1.0
 * @since 20/04/2025
 */

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Importando a classe Scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Adiquirindo os dados necessários para a criação da conta
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();

        // Exibindo os dados do cliente
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
