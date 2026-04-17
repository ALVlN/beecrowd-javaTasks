import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int senhaCerta = 2002;

        while(true){
            int senhaAtual = scanner.nextInt();

            if (senhaAtual == senhaCerta){
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }

}
