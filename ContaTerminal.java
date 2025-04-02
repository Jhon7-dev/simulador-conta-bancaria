
import java.util.Scanner;

public class ContaTerminal {

     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int num_Conta;
          String num_Agencia;
          String nome_Cliente;
          double saldo;

          System.out.println("BANCO DIO");
          System.out.println("DIGITE O NÚMERO DA CONTA!");
          num_Conta = scn.nextInt();
          System.out.println("DIGITE O NÚMERO DA AGÊNCIA!");
          num_Agencia = scn.nextLine();
          scn.nextLine();
          System.out.println("DIGITE SEU NOME!");
          nome_Cliente = scn.nextLine();
          System.out.println("DIGITE SEU SALDO BANCÁRIO!");
          saldo = scn.nextDouble();

          System.out.println(" olá," + nome_Cliente + "," + " obrigado por criar uma conta em nosso banco,sua agência é " + num_Agencia + " , " + " conta " + num_Conta + " e seu saldo " + saldo + " já está disponível para o saque " );
     }
}