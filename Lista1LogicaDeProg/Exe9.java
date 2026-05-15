package Lista1LogicaDeProg;

import java.util.Scanner;

public class Exe9 {

    /*
     * Implemente um algoritmo que dado um texto, e imprima:
     * a) A quantidade de vogais
     * b) A quantidade de consoantes
     * c) A quantidade total de letras
     * d) A quantidade de palavras
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto;

        int vogais = 0;
        int consoantes = 0;
        int letras = 0;
        int palavras = 0;

        boolean dentroPalavra = false;

        // Recebe texto
        System.out.print("Digite um texto: ");
        texto = sc.nextLine().toLowerCase();

        // Percorre o texto
        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            // Verifica letras
            if (letra >= 'a' && letra <= 'z') {

                letras++;

                // Verifica vogais
                if (letra == 'a' || letra == 'e' || letra == 'i'
                        || letra == 'o' || letra == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }

                // Detecta início de palavra na primeira letra, só muda quando achar um char diferente de algo entre A e Z
                if (!dentroPalavra) {
                    palavras++;
                    dentroPalavra = true;
                }
            } else {
                // Saiu da palavra
                dentroPalavra = false;
            }
        }

        // Exibe resultados
        System.out.println("--- RESULTADOS ---");
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de consoantes: " + consoantes);
        System.out.println("Quantidade total de letras: " + letras);
        System.out.println("Quantidade de palavras: " + palavras);

        sc.close();
    }
}
