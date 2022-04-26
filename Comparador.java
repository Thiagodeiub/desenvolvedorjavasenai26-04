import java.util.Scanner;

public class Comparador {
    public static void main(String[] args) {

        int numero1, numero2;
        System.out.println("digite o primeiro número");
        Scanner scan = new Scanner(System.in);
        numero1 = scan.nextInt();
        System.out.println("digite o segundo número");
        numero2 = scan.nextInt();

        if (numero1 > numero2) {
            System.out.printf("O numero %s é o maior", numero1);

        }else {
            System.out.printf("o numero %s é o maior", numero2);

        }

    }
}

