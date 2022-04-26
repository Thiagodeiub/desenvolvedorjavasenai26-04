import java.util.Scanner;

public class TresNumerosDecrescente {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        numero1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        numero2 = scan.nextInt();
        System.out.println("Digite o terceiro número");
        numero3 = scan.nextInt();

        if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println("A ordem decrescente é:    "   + numero1 +"    "+ numero2 +"    "+ numero3);
        } else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
            System.out.println("A ordem decrescente é:    " + numero2+"    "+ numero1 +"    "+ numero3);
        } else if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
            System.out.println("A ordem decrescente é:    " + numero3 +"    "+ numero1 +"    "+ numero2);
        } else if (numero3 > numero2 && numero2 > numero1) {
            System.out.println("A ordem decrescente é:    " + numero3 +"    "+ numero2 +"    "+ numero1);
        } else if (numero2 > numero3 && numero2 > numero1 && numero3 > numero1) {
            System.out.println("A ordem decrescente é:    " + numero2 +"    "+ numero3 +"    "+ numero1);
        } else if (numero1 > numero3 && numero3 > numero2) {
            System.out.println("A ordem decrescente é:    " + numero1 +"    "+ numero3 +"    "+ numero2);
        } else {
            System.out.println("há números iguais");
        }
    }
}
