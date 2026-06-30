import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        numero = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Por favor, digite o número da agencia: ");
        agencia = teclado.nextLine();
        System.out.println("Digite seu nome: ");
        nomeCliente = teclado.nextLine();
        System.out.println("Digite o valor que irá depositar: ");
        saldo = teclado.nextBigDecimal();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
                "sua agência é %s, conta %s e seu saldo R$%.2f " +
                "já está disponível para saque", nomeCliente, agencia, numero, saldo);
        teclado.close();
    }
}
