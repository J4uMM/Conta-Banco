import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        double saldo = 2000.00;
        
        Scanner contaTerminal = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = contaTerminal.nextInt();

        contaTerminal.nextLine();

        System.out.println("Por favor, digite o número da agência! ");
        String agencia = contaTerminal.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeClinte = contaTerminal.nextLine();

        
        String mensagem = String.format(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",    
        
        
        nomeClinte, agencia, numero, saldo);

        System.out.println(mensagem);
        contaTerminal.close();

    }
}
