package okulProjesi;

import java.util.Scanner;

public class AnaMenu {

    /*
    ====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	 1- ÖĞRENCİ İŞLEMLERİ
	 2- ÖĞRETMEN İŞLEMLERİ
	 Q- ÇIKIŞ
     */
    void anaMenu(){

        System.out.print("====================================\n"+
                           "ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n"+
                           "====================================\n"+
                           "1- ÖĞRENCİ İŞLEMLERİ\n"+
                           "2- ÖĞRETMEN İŞLEMLERİ\n"+
                           "Q- ÇIKIŞ"+
                           "SECIMINIZ: ");

        Scanner scan=new Scanner(System.in);

        while (true){
            char secim=scan.next().toUpperCase().charAt(0); // toUpperCase kullanmamizin sebebi Q yada q girdiginde kabul etsin diye

            switch (secim){
                case '1':{
                    OgrenciMenu ogrMenu=new OgrenciMenu();
                    ogrMenu.ogrMenu();

                }

                case '2':{


                }

                case 'Q':{
                    System.out.println("GÜLE GÜLE");
                    System.exit(0);

                }

                default:{
                    System.out.println("Gecerli deger giriniz");
                    anaMenu();

                }
            }
        }
    }
}