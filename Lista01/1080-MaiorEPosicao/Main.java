import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;
        int[] vetor = new int[100];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao+1);

    }
}
