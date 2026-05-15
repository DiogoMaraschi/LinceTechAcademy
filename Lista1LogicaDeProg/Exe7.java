package Lista1LogicaDeProg;

import java.util.Scanner;

public class Exe7 {

    /* Implemente um algoritmo que receba um número decimal, 
    e imprima seu valor fatorial (cálculo fatorial). */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        long fatorial = 1; //Usamos long para lidar com números maiores que possam surgir

        // Recebe valor
        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        // Verifica se é negativo
        if (numero < 0) {
            System.out.println("Não existe fatorial de número negativo.");
        } else {
            // Cálculo do fatorial
            for (int i = numero; i >= 1; i--) {
                fatorial = fatorial * i;
            }

            // Exibe resultado
            System.out.println(numero + "! = " + fatorial);
        }

        sc.close();
    }
}
