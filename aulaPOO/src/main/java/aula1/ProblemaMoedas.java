package aula1;

import java.util.Scanner;

/**
 *
 * @author vxfontes
 */
public class ProblemaMoedas {

//Faça um programa para, a partir de um valor;
//informado em centavos, indicar a menor
//quantidade de moedas que representa esse valor
//– Considere moedas de 1, 5, 10, 25 e 50 centavos, e 1
//real
//– Exemplo: para o valor 290 centavos, a menor
//quantidade de moedas é 2 moedas de 1 real, 1 moeda
//de 50 centavos, 1 moeda de 25 centavos, 1 moeda de
//10 centavos e 1 moeda de 5 centavos
    public static void main(String[] args) {

        int valor = 0, resto = 0, val100 = 0, val50 = 0, val25 = 0, val10 = 0, val5 = 0, val1 = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor total sem utilizar virgula, exemplo: 2.90 eh 290");
        System.out.print("Valor: ");
        valor = scan.nextInt();

        val100 = valor / 100;
        resto = valor - val100;

        val50 = resto / 50;
        resto = resto - val50 * 50;

        val25 = resto / 25;
        resto = resto - val25 * 25;

        val10 = resto / 10;
        resto = resto - val10 * 10;

        val5 = resto / 5;
        resto = resto - val5 * 5;

        val1 = resto / 1;
        resto = resto - val1 * 1;

        System.out.println("O valor: " + valor + " tera " + val100 + " moedas de 1 real, "
                + "\n" + val50 + " moedas de 50 centavos, " + val25 + " moedas de 25 centavos, "
                + "\n" + val10 + " moedas de 10 centavos, " + val5 + " moedas de 5 centavos"
                + "\n e " + val1 + " moedas de 1 centavo");

    }
}
