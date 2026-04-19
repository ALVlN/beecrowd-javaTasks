import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String resultado = "YOU WIN";
        int alturaPulo = scanner.nextInt();
        int qtdCanos = scanner.nextInt();

        int[] alturaCanos = new int[qtdCanos];

        for (int i = 0; i < alturaCanos.length; i++) {
            alturaCanos[i] = scanner.nextInt();
        }


        for (int i = 0; i < alturaCanos.length-1; i++){
            int canoAtual = alturaCanos[i];
            int proxCano = alturaCanos[i + 1];

            if((canoAtual + alturaPulo) < proxCano || Math.abs(canoAtual - proxCano) > alturaPulo){
                resultado = "GAME OVER";
            }
        }

        System.out.println(resultado);
    }
}
