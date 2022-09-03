import java.util.Scanner;

public class EXERCICIO1 {
    // Faça um programa que preencha um vetor com 10 números reais, calcule e mostre a
    // quantidade de números negativos e a soma dos números positivos desse vetor.
    public static void main(String[] args) {

        float num[] = new float[10], qtdNegativos = 0, positivos = 0;
        Scanner scanner = new Scanner(System.in);
        for (int cont = 0; cont < 10; cont++) {
            System.out.print("Insira o " + (cont + 1) + "° número Real: ");
            num[cont] = scanner.nextFloat();

            if (num[cont] >= 0) {
                positivos = positivos + num[cont];
            } else {
                ++qtdNegativos;
            }
        }

        if (qtdNegativos > 0) {
            System.out.println("A quantidade de números Reais negativos é: " + qtdNegativos);
        }

        if (positivos > 0) {
            System.out.println("A soma dos números positivos do vetor é: " + positivos);
        }

    }
}
