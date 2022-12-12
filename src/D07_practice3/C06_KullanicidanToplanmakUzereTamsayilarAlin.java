package D07_practice3;

import java.util.Scanner;

public class C06_KullanicidanToplanmakUzereTamsayilarAlin {

    /*
    Kullanicidan toplanmak uzere tamsayilar alin
    kullanici 0'a basarsa sayi alma islemini bitirin
    kullanicinin kac sayi girdigini
    ve bu sayilarin toplaminin kac oldugunu yazdirin
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz: ");
        int girilenSayi = 5;
        int sayac=0;
        int toplam=0;

        while (girilenSayi !=0){
            System.out.println("Lutfen toplamak icin tamsayi girelim: "+"\nBitirmek icin 0'a basiniz: ");
            girilenSayi= scan.nextInt();

            if (girilenSayi!=0){
                sayac++;
                toplam=toplam+girilenSayi;

            }
        }
        System.out.println("Girilen "+sayac+" adet sayinin toplami: "+toplam);

    }
}
