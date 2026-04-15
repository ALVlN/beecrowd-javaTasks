import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        double areaTRI = (A * C) / 2;
        double areaCIR = 3.14159 * (C*C);
        double areaTRA = ((A+B) * C) / 2;
        double areaQUA = B * B;
        double areaRET = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTRI);
        System.out.printf("CIRCULO: %.3f%n", areaCIR);
        System.out.printf("TRAPEZIO: %.3f%n", areaTRA);
        System.out.printf("QUADRADO: %.3f%n", areaQUA);
        System.out.printf("RETANGULO: %.3f%n", areaRET);

    }

}
