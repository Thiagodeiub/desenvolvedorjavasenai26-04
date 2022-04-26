import java.util.Scanner;

public class AnoBissesto {
    public static void main(String[] args) {

        int ano;
        System.out.println("digite o ano para verificar se é bissesto ");
        Scanner scan = new Scanner(System.in);
        ano = scan.nextInt();

        if (ano % 4 == 0) {
            System.out.printf("O ano %s é bissesto", ano);

        } else {
            System.out.println("o ano não é bissesto");

        }

    }
}
