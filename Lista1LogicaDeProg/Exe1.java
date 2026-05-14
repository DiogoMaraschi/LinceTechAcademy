package Lista1LogicaDeProg;

import java.util.Scanner;

/* Monte um algoritmo que receba dois números decimais,
 e dívida o maior número pelo menor número.  */

public class Exe1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Instância de scanner

        //Declaração de variáveis
        double num1, num2;
        double maior, menor;
        double resultado;

        //Recebe valores
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        //Verifica qual número é maior
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }

        resultado = maior / menor; //Faz o cálculo 

        System.out.println("Maior número: " + maior + " | " + "Menor número: " + menor);
        System.out.println("Resultado da divisão: " + resultado);

        sc.close();

    }
}
