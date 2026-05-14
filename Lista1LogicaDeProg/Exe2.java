package Lista1LogicaDeProg;

import java.util.Scanner;

/* Monte um algoritmo que receba 5 números, 
e imprima todos os números ímpares recebidos.*/


public class Exe2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Instância de scanner

        //Declaração de variáveis
        int[] numeros = new int[5];
        boolean encontrouImpar = false;

        //Loop para ler os valores do usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("--- Números ímpares no vetor ---");

        // Loop que verifica se é impar
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
                encontrouImpar = true;
            }
        }

        //Caso não tiver número impar, é informado
        if (!encontrouImpar) {
            System.out.println("Não foram encontrados números ímpares!");
        }


        sc.close();

        
    }
}
