import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
      try (Scanner scan = new Scanner(System.in)) {
 
         int agencia; 
         String numeroConta, nomeCliente, sobreNome;
         Double saldo;
          
         System.out.println("Por favor, digite o número da Agência:");
           agencia = scan.nextInt();
          
         System.out.println("Número da sua conta(ex.:XXXX-X):");
           numeroConta = scan.next();

         System.out.println("seu primeiro Nome:");
           nomeCliente = scan.next();
           
         System.out.println("Sobrenome:");
           sobreNome = scan.next();
          
         scan.nextLine();

         System.out.println("Saldo:");
           saldo = scan.nextDouble();

         System.out.println();

         System.out.println("Olá " + nomeCliente + " " + sobreNome + ", obrigado por criar uma conta em nosso Banco,");
         System.out.println("sua Agência é: " + agencia + ", conta Número: " +  numeroConta + " ,");
         System.out.println("e o seu saldo: " + saldo + " , já está disponível para saque!");
      
      }

    }
}