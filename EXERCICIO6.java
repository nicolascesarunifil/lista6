import java.util.Scanner;

public class EXERCICIO6 {
    public static void main(String[] args) {
        //  Faça um programa que leia um vetor de 10 números. Leia um número x. Conte os múltiplos
        //  de um número inteiro x num vetor e mostre-os na tela.

        int num[] = new int[10];
        int x, i = 0;
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < num.length; i++) {
            System.out.print("insira o " + (i + 1) + " numero: ");
            num[i] = scanner.nextInt();
        }
        System.out.print("informe o valor de X: ");
        x = scanner.nextInt();
        for (i = 0; i < num.length; i++) {
            System.out.println(x + " x " + num[i] + " = " + (num[i] * x));
        }
    }
}
