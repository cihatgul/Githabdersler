package D01_practice;

import java.util.Scanner;

public class C10_IkiSayininCarpimiMethod {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("islemler icin iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();


        System.out.println("iki sayinin toplami: "+toplam(sayi1, sayi2));
        System.out.println("iki sayinin cikarmasi: "+cikarma(sayi1, sayi2));
        System.out.println("iki sayinin carpimi: "+carpimlari(sayi1, sayi2));
        System.out.println("iki sayinin bolmesi: "+bolme(sayi1, sayi2));
    }

    private static double bolme(double sayi1, double sayi2) {
        double bolme=sayi1/sayi2;

        return bolme;
    }

    private static double carpimlari(double sayi1, double sayi2) {
        double carpimlari=sayi1*sayi2;

        return carpimlari;
    }

    private static double cikarma(double sayi1, double sayi2) {
        double cikarma=sayi1-sayi2;

        return cikarma;
    }

    private static double toplam(double sayi1, double sayi2) {
        double toplam=sayi1+sayi2;

        return toplam;
    }
}
