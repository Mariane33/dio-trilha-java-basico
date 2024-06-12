import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criação de um objeto Scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);

         // Solicitar e ler o número da conta
         System.out.print("Por favor, digite o número da Conta: ");
         int numero = scanner.nextInt();

        // Solicitar e ler a agência
        System.out.print("Por favor, digite o número da Agência: ");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String agencia = scanner.nextLine();

         // Solicitar e ler o nome do cliente
         System.out.print("Por favor, digite o seu Nome: ");
         String nomeCliente = scanner.nextLine();

        // Solicitar e ler o saldo
        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

        // Fechar o scanner
         scanner.close();

        // Exibir a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}
