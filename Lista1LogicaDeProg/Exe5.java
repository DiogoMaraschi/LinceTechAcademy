package Lista1LogicaDeProg;

import java.util.Scanner;

public class Exe5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        double a, b, c, delta, x1, x2;

        // Receber valores
        System.out.print("Digite o valor de A: ");
        a = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        b = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        c = sc.nextDouble();

        // Calcular delta
        delta = (b * b) - (4 * a * c);

        // Verificar se existem raízes reais
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            // Fórmula de Bhaskara
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            // Exibir resultados
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }

        sc.close();
    }
}