import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int idadeD = scanner.nextInt();
        int idadeA = idadeD / 365;
        int idadeM = (idadeD % 365) / 30;
        idadeD = (idadeD % 365) % 30;

        System.out.println(idadeA + " ano(s)");
        System.out.println(idadeM + " mes(es)");
        System.out.println(idadeD + " dia(s)");

    }

}
