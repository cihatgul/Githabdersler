package D06_practice2;

import java.util.Scanner;

public class C08_EmeklilikHesaplama {

    // Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
    // Erkek 65 yas ve uzeri emekli olabilir.
    // Cinsiyet ve yasini dikkate alarak
    // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

    // ana degisken yas olsun

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cinsiyeti giriniz: ");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("\nLutfen yasinizi giriniz: ");
        int yas= scan.nextInt();

        if (yas<18){
            System.out.println("Hatali giris yapildi");

        } else if (yas<60) {
            if (cinsiyet == 'K') {
                System.out.println("daha " + (60 - yas) + " sene calismalisin kadin olarak");
            } else if (cinsiyet == 'E') {
                System.out.println("daha " + (65 - yas) + " sene calismalisin erkek olarak");
            } else {
                System.out.println("hatali cinsiyet girisi");
            }

        } else if (yas<65) {
            // kadin ise emekli olabilir, erkek calismasi lazim
            if (cinsiyet == 'K') {
                System.out.println("emekli olabilirsin kadin olarak");
            } else if (cinsiyet == 'E') {
                System.out.println("emekli olamk icin " + (65 - yas) + " yil daha calismalisin erkek olarak");
            } else {
                System.out.println("hatali cinsiyet girisi");
            }
        }else { // yas 65'den buyukse
            System.out.println("emekli olabilirsin");

        }
    }
}
