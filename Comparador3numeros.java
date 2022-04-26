import java.util.Scanner;

public class Comparador3numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2, numero3;
        System.out.println("Entre com o primeiro número");
        numero1 = scan.nextInt();
        System.out.println("Entre com o segundo número");
        numero2 = scan.nextInt();
        System.out.println("Entre com o terceiro número");
        numero3 = scan.nextInt();

        if (numero1>numero2 && numero1>numero3) {
            System.out.printf("O maior número é %s",numero1);
        } else if (numero2>numero1 && numero2>numero3){
            System.out.printf("O maior número é %s",numero2);
        } else if ( numero3>numero1 && numero3>numero2) {
            System.out.printf("O maior número é %s",numero3);
        } else {
            System.out.println("há número iguais");
        }



        }



    }





