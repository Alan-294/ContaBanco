import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        var nomeCliente = leitura.nextLine();

        System.out.println("Digite o número da sua conta: ");
        var numero = leitura.nextInt();

        System.out.println("Digite o número da agencia: ");
        var agencia = leitura.next();

        System.out.println("Digite o seu saldo: ");
        var saldo = leitura.nextDouble();


        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero+" e seu saldo de R$"+ saldo+" já está disponível para saque.");
    }
}
