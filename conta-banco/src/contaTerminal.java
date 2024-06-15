import java.util.Scanner;
import java.util.Locale;

public class contaTerminal
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println ("SEU BANCO");

    System.out.println ("Digite seu nome: ");
  String nomeCliente = scanner.next();


  System.out.println ("Digite seu numero: ");
  int numero = scanner.nextInt();


  System.out.println ("Digite sua Agência: ");
  String agencia = scanner.next();

  System.out.println ("Digite seu Saldo R$: ");
  double saldo = scanner.nextDouble();

  System.out.println ("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+numero+ " e seu saldo R$ "+saldo+ " já está disponível para saque");

  }
}

