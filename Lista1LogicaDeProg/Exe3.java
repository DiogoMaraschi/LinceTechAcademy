package Lista1LogicaDeProg;

import java.util.Scanner;

/* Monte um algoritmo que receba dois números, 
realize a subtração entre eles e retorne o valor absoluto (positivo) da operação. */

public class Exe3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Instância de scanner

        //Declaração de variáveis
        double num1, num2, resultado;


        //Recebe valores
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        resultado = num1 - num2; //Calcula subtração

        //Multiplica por -1 para deixar o valor positivo, se for negativo
        if (resultado < 0) {
            resultado = resultado * -1;
        }

        //Exibe resultado
        System.out.println("O valor absoluto da subtração de " + num1 + " - " + num2 + " é de: " + resultado);

        sc.close();
    }
}
