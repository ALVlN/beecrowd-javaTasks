import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int qtdsNotasValidas = 0;
        float notaAtual;
        float somaParaMedia = 0;
        while(true){
            if (qtdsNotasValidas < 2){
                notaAtual = scanner.nextFloat();
            } else {
                break;
            }

            if((notaAtual >= 0) && (notaAtual <= 10)){
                qtdsNotasValidas = qtdsNotasValidas + 1;
                somaParaMedia = somaParaMedia + notaAtual;
            } else {
                System.out.println("nota invalida");
            }
        }

        float media = somaParaMedia / 2;
        System.out.printf("media = %.2f%n", media);
    }
}
