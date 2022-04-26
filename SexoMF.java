import java.util.Locale;
import java.util.Scanner;

public class SexoMF {
    public static void main(String[] args) {
        String sexo;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o sexo");
        sexo = scan.next();
        String s = sexo.toUpperCase();
        System.out.println("o sexo é: " +s);

    }
}
