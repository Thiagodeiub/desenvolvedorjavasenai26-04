import java.util.Scanner;

public class MediaBimestral {
    public static void main(String[] args) {
        float bimestre1, bimestre2, bimestre3, bimestre4, media;
        System.out.println("digite a nota do 1º bimestre");
        Scanner scan = new Scanner(System.in);
        bimestre1 = scan.nextFloat();
        System.out.println("digite a nota do 2º bimestre");
        bimestre2 = scan.nextFloat();
        System.out.println("digite a nota do 3º bimestre");
        bimestre3 = scan.nextFloat();
        System.out.println("digite a nota do 4º bimestre");
        bimestre4 = scan.nextFloat();
        media = (bimestre1+bimestre2+bimestre3+bimestre4)/4;
        System.out.println("A média bimestral foi igual a: " + media);
    }
}
