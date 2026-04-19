import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
                vetor[i] = scanner.nextInt();
        }

        for(int i = 0; i < vetor.length; i++ ){
            if (vetor[i] > 0 ){
                System.out.printf("X[%d] = %d%n", i, vetor[i] );
            } else{
                vetor[i] = 1;
                System.out.printf("X[%d] = %d%n", i, vetor[i] );
            }
        }
    }
}
