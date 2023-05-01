import java.util.Locale;
import java.util.Scanner;

/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classe
* para desfrutar dos recursos oferecidos pelo autor
*
* @autor   Jeferson Carvalho
* @version 1.0
* @since   01/05/2023
*/

public class Calculadora {
    /**
    * Este módulo é utilizado para somar dois números inteiros
    * @param numeroUm este é o primeiro parâmetro do método
    * @param numeroDois este é o segundo parâmetro do método
    * @return int o resultado deste método é a soma dos dois númeors.
    */

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        double valor1, valor2, total;

        System.out.println("Digite Valor1: ");
        valor1 = scanner.nextDouble();

        System.out.println("Digite Valor2: ");
        valor2 = scanner.nextDouble();


        total = somar(valor1, valor2);


        System.out.println("Total = " + total);
    }

    public static double somar(double numeroUm, double numeroDois) {

        return numeroUm + numeroDois;
    }

}