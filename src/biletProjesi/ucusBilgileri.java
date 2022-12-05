package biletProjesi;

import java.util.Scanner;

public class ucusBilgileri {

    Scanner scan=new Scanner(System.in);
    int seferSayisi=1000;
    public void ucusKontrol(){

        System.out.println("Yapmak istediginiz yolculuk seklini seciniz.\n"+
                           "Tek yon icin 1'e\n"+
                           "Cift yon icin 2'ye basiniz:");

        int secim=scan.nextInt();

        switch (secim){
            case 1:{
                tekYon();
                break;

            }

            case 2:{}
            default:{
                System.out.println("Yanlis deger girdiniz.");
                ucusKontrol();

            }
        }
    }

    int fiyatHesapla(){

        return (int) (Math.random()*100);

    }


    private void tekYon() {

        System.out.print("Kalkis noktasi giriniz");
        String kalkis=scan.nextLine();
        System.out.print("Inis noktasi giriniz");
        String inis= scan.nextLine();
        System.out.print("Ucus tarihi giriniz: (yyyy/mm/dd)");
        String tarih= scan.nextLine();
        char kalkisIlkHarf=kalkis.charAt(0);
        char inisIlkHarf=inis.charAt(0);
        seferSayisi++;
        String ucusBilgileri=kalkis+"======"+inis+" "+tarih+" "+kalkisIlkHarf+inisIlkHarf+seferSayisi+" Nolu ucusun fiyati $ "+fiyatHesapla()+
                "Bilet fiyatiniz";

        System.out.print(ucusBilgileri+"onayliyormusunuz?E/H");

        char secim=scan.next().toUpperCase().charAt(0);

        if (secim=='E'){

            System.out.print("Biletiniz onaylanmistir "+ucusBilgileri);

        }else {

            System.out.print("Tesekkirler. iyi gunler.");

        }

    }
}
