import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<ContaBanco> contas = new ArrayList<ContaBanco>();
        cadastrarUsuario(input,contas);
    }


    private static void cadastrarUsuario(Scanner input, List<ContaBanco> contas){
        System.out.println("Digite o numero da Conta: ");
        int numero = input.nextInt();
        input.nextLine();
        System.out.println("Digite a agencia:");
        String agencia = input.nextLine();
        System.out.println("Digite o seu nome:");
        String nomeCliente = input.nextLine();
        System.out.println("Digite o quanto deseja depositar inicialmente:");
        double saldo = input.nextDouble();
        input.nextLine();
        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);
        conta.imprimirConta();
        contas.add(conta);
    }
}
