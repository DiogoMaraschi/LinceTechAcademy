package Lista1LogicaDeProg;

import java.util.Scanner;

public class Exe8 {

    /* Implemente um algoritmo que receba um número X, 
    e imprima sua multiplicação de 1 até 9 (tabuada).  */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int numero, resultado;

        // Recebe valor
        System.out.print("Digite o número: ");
        numero = sc.nextInt();

        System.out.println("--- TABUADA DO " + numero + " ---");

        for (int i = 1; i <= 9; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        sc.close();
    }
}
