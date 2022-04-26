import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        int numero;
        System.out.println("digite um número para verificar se é par ou impar");
        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O numero %s é par", numero);

        }else {
            System.out.printf("o numero %s é impar", numero);

        }

    }
}


