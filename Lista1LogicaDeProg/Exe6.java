package Lista1LogicaDeProg;

import java.util.Scanner;

public class Exe6 {

    /* Implemente um algoritmo que receba as medidas dos catetos de um triangulo retângulo, 
    e imprima o valor da hipotenusa (teorema de Pitágoras).  */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Instância de scanner

        //Declaração de variáveis
        double cat1, cat2, hipotenusa;

        //Recebe valores
        System.out.print("Digite o primeiro cateto: ");
        cat1 = sc.nextDouble();

        System.out.print("Digite o segundo cateto: ");
        cat2 = sc.nextDouble();

        //Calcula hipotenusa = raiz das somas dos quadrados dos catetos
        hipotenusa = Math.sqrt((cat1*cat1) + (cat2*cat2));

        //Exibe resultado
        System.out.println("O valor da hipotenusa é: " + hipotenusa);

        sc.close();
    }
}
