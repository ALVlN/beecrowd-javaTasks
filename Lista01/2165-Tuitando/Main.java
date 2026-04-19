import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        String postagem = sc.nextLine();
        
        if (postagem.length() <= 140) {
            System.out.println("TWEET");
        } else {
            System.out.println("MUTE");
        }
        
    }
}
