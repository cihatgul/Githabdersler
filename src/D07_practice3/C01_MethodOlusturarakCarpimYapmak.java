package D07_practice3;

import java.util.Scanner;

public class C01_MethodOlusturarakCarpimYapmak {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println(carpmaMethodu(sayi1, sayi2));

    }
    private static double carpmaMethodu(double sayi1, double sayi2) {
        System.out.println("carpim method'u calistiralim");

        return sayi1*sayi2;
    }
}
