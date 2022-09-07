import java.util.Arrays;
import java.util.Scanner;

public class EXERCICIO5 {
    // Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código
    // inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se
    // for 2, mostre o vetor na ordem inversa. Caso, o código for diferente de 1 e 2 escreva uma
    // mensagem informando que o código é invalido.

    public static void main(String[] args) {
        int[] num = new int[5];
        int op=4;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("digite o "+(i+1)+" numero: ");

            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        System.out.println("");
        do {
            System.out.println("=============================");
            System.out.println("= 1- mostrar ordem direta   =");
            System.out.println("= 2- mostrar ordem inversa  =");
            System.out.println("= 0- sair                   =");
            System.out.println("=============================");
            System.out.print("   ---> ");
            op = scanner.nextInt();
            if ( op == 1 ){
                for (int i = 0; i < num.length; i++) {
                    System.out.println((i + 1) + " numero -> " + num[i]);
                }
            }
             else if ( op == 2 ){
                 int cont= 1, inv=4;
                for (int i = 0; i < num.length; i++ ){
                    System.out.println(cont+" numero -> "+num[inv]);
                    cont++;
                            inv--;
                }
            }
            else if (op > 2){
                System.out.println("NUMERO INVALIDO");
            }
        } while (op != 0);
    }
}

