import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int[] vetor = new int[10];
        vetor[0] = input;
        System.out.printf("N[0] = %d%n", vetor[0]);

        for (int i = 1; i < vetor.length; i++){
            vetor[i] = vetor[i - 1];
            vetor[i] = vetor[i] * 2;
            System.out.printf("N[%d] = %d%n", i, vetor[i]);
        }
    }
}
