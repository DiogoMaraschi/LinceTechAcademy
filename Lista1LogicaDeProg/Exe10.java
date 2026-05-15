package Lista1LogicaDeProg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exe10 {

    /*
     * 10. Implemente um algoritmo que receba uma sequência de X números e:
     * a) Imprima todos os números em ordem crescente
     * b) Imprima todos os números em ordem decrescente
     * c) Imprima o maior número
     * d) Imprima o menor número
     * e) Imprima a soma dos números
     * f) Imprima a média dos números
     * g) Imprima a soma dos números pares
     * h) Imprima a soma dos números ímpares
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Como não foi informado o número de posições, preferi usar arraylist
        ArrayList<Integer> numeros = new ArrayList<>();

        // Declaração de variáveis
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;

        String entrada;

        System.out.println("Digite números (P para parar):");

        // Recebe números até digitar P
        while (true) {

            entrada = sc.next();

            // Verifica se recebeu comando de parada
            if (entrada.equalsIgnoreCase("P")) {
                break;
            }

            // Converte String para int
            int numero = Integer.parseInt(entrada);

            // Adiciona o número digitado ao array
            numeros.add(numero);

            // Incrementa a soma
            soma += numero;

            // Soma pares e ímpares
            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }
        }

        // Verifica se nenhum número foi digitado
        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi digitado.");
        } else {

            // Maior e menor
            int maior = numeros.get(0);
            int menor = numeros.get(0);

            for (int i = 0; i < numeros.size(); i++) {

                if (numeros.get(i) > maior) {
                    maior = numeros.get(i);
                }

                if (numeros.get(i) < menor) {
                    menor = numeros.get(i);
                }
            }

            // Média com cast para double
            double media = (double) soma / numeros.size();

            // Ordenação por seleção, ele vai percorrer todos os indices procurando 
            // sempre o menor valor e trocando a posição
            // Sei que poderia usar Collections, mas acredito que o entuito seja estrutura de dados
            for (int i = 0; i < numeros.size() - 1; i++) {

                // Assume que o menor número esta na posição atual
                int indiceDoMenor = i;

                // Percorre os próximos elementos procurando um número menor
                for (int j = i + 1; j < numeros.size(); j++) { // j+1 para que não percorra uma posição já ordenada

                    // Se encontrar um valor menor guarda a posição dele
                    if (numeros.get(j) < numeros.get(indiceDoMenor)) {
                        indiceDoMenor = j;
                    }
                }

                // Guarda temporariamente o valor atual
                int temp = numeros.get(i);

                // Coloca o menor valor encontrado na posição atual
                numeros.set(i, numeros.get(indiceDoMenor));

                // Coloca o valor antigo na posição do menor para que seja usado no em algum dos próximos loops
                numeros.set(indiceDoMenor, temp);
            }

            // Ordem Crescente
            System.out.println("\n--- Ordem Crescente ---");

            for (int i = 0; i < numeros.size(); i++) {
                System.out.println(numeros.get(i));
            }
            // Ordem Decrescente
            System.out.println("\n--- Ordem Decrescente ---");

            for (int i = numeros.size() - 1; i >= 0; i--) {
                System.out.println(numeros.get(i));
            }

            // Resultados
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("Soma dos números: " + soma);
            System.out.println("Média dos números: " + media);
            System.out.println("Soma dos pares: " + somaPares);
            System.out.println("Soma dos ímpares: " + somaImpares);
        }

        sc.close();
    }
}
