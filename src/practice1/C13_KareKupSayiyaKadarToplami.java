package practice1;

import java.util.Scanner;

public class C13_KareKupSayiyaKadarToplami {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println("girilen sayiya kadar olan sayilarin toplami: "+toplam(sayi));
        System.out.println("girilen sayiya kadar olan sayilarin karelerinin toplami: "+karelerininToplami(sayi));
        System.out.println("girilen sayiya kadar olan sayilarin kuplerinin toplami: "+kuplerininToplami(sayi));

    }

    private static int kuplerininToplami(int x) {
        int sonuc=((x*(x+1))/2)*((x*(x+1))/2);

        return sonuc;
    }

    private static int karelerininToplami(int x) {
        int sonuc=(x*(x+1)*(2*x+1))/6;

        return sonuc;
    }

    private static int toplam(int x) {
        int sonuc=(x*(x+1))/2;

        return sonuc;
    }
}
