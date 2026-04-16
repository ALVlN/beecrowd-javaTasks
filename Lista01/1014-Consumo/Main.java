import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        float consumo = scanner.nextFloat();

        float kmPL = distancia / consumo;

        System.out.printf("%.3f km/l%n", kmPL);
    }

}
