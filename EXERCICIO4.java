import java.util.Scanner;

public class EXERCICIO4 {
    //Leia um vetor com 20 números inteiros. Escreva os elementos do vetor eliminando elementos
    //repetidos.

    public static void main(String[] args) {
        int[] num = new int[10];
        int[] aux = new int[10];
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° numero: ");
            num[i] = (scanner.nextInt());

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (int[i]==int[j]){
                    cont= cont+1;
                    aux[i] = cont;
                }
            }

            }
    }
}
