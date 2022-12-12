package D07_practice3;

import java.util.Scanner;

public class C09_UstluSayilar {

    // Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
    // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.

    public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);
     System.out.println("Lutfen ustunu alacaginiz ilk sayiyi giriniz");
     int altSayi= scan.nextInt();
     int ustSayi= scan.nextInt();

     ustlerSayiHesaplama(altSayi,ustSayi);


    }

    private static boolean ustlerSayiHesaplama(int altSayi, int ustSayi) {

        int sonuc=1;

        while (ustSayi>0){

            sonuc=sonuc*altSayi;

            ustSayi--;

        }
        System.out.println(sonuc);
        return false;
    }
}
