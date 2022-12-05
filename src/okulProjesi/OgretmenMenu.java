package okulProjesi;

import java.util.ArrayList;
import java.util.Scanner;

public class OgretmenMenu implements Islemler {

        /*
    ============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ

         SEÇİMİNİZ:
     */

    static ArrayList<Ogretmen> ogretmenList=new ArrayList<>();

    Scanner scan=new Scanner(System.in);
    void ogretmenMenu(){

        System.out.print("============= İŞLEMLER =============\n"+
                "1-EKLEME\n"+
                "2-ARAMA\n"+
                "3-LİSTELEME\n"+
                "4-SİLME\n"+
                "Q-ÇIKIŞ\n"+
                "SEÇİMİNİZ:");

        while (true){

            char secim=scan.next().toUpperCase().charAt(0);

            switch (secim){
                case '1':{
                    ekleme();
                }

                case '2':{
                    arama();
                }

                case '3':{
                    listeleme();
                }

                case '4':{
                    silme();
                }

                case 'Q':{
                    cikis();
                }

            }
        }
    }


    @Override
    public void ekleme() {
        System.out.print("Ogretmenin adini giriniz");
        scan.nextLine();
        String isim= scan.nextLine();
        System.out.print("Ogretmenin soyadini giriniz");
        String soyisim= scan.nextLine();
        System.out.print("Ogretmenin TC'sini giriniz");
        String tcNo= scan.next();
        System.out.print("Ogretmenin yasini giriniz");
        int yas= scan.nextInt();
        System.out.print("Ogretmenin bolumu giriniz");
        scan.nextLine();
        String bolum= scan.nextLine();
        System.out.print("Ogretmenin sicil numarasini giriniz");
        int sicilNo= scan.nextInt();

        Ogretmen ogretmen=new Ogretmen(isim,soyisim,tcNo,yas,bolum,sicilNo);
        ogretmenList.add(ogretmen);
        ogretmenMenu();
    }


    @Override
    public void arama() {
        if (!ogretmenList.isEmpty()) {
            System.out.println("ARAMA YAPILACAK TCNO GİRİNİZ: ");
            String aranacakTcNo = scan.next();

            for (int i = 0; i < ogretmenList.size(); i++) {

                if (ogretmenList.get(i).getTcNo().equals(aranacakTcNo)) {
                    System.out.println(ogretmenList.toString());
                    ogretmenMenu();

                }
                else {
                    System.out.println("TCNO YA AİT ÖĞRETMEN BULUNAMAMIŞTIR.");
                    ogretmenMenu();

                }
            }
        }
        else {
            System.out.println("ÖĞRETMEN LİSTENİZ BOŞ.");
            ogretmenMenu();

        }
    }


    @Override
    public void listeleme() {

        if (!ogretmenList.isEmpty()){

            for (Ogretmen each:ogretmenList) {
                System.out.println(each.toString());
                ogretmenMenu();
                
            }
        }

        else {

            System.out.println("Ogretmen listesi bos");
            ogretmenMenu();

        }
    }


    @Override
    public void silme() {

        if (!ogretmenList.isEmpty()) {
            System.out.print("SİLMEK İSTEDİĞİNİZ TCNO YU GİRİNİZ: ");
            String tcNo = scan.next();

            for (int i = 0; i < ogretmenList.size(); i++) {

                if (ogretmenList.get(i).getTcNo().equals(tcNo)) {
                    ogretmenList.remove(i);
                    ogretmenMenu();

                }
            }
        }

        else {
            System.out.println("ÖĞRETMEN LİSTENİZ BOŞ.");
            ogretmenMenu();

        }
    }

    @Override
    public void cikis() {
        AnaMenu anaMenu = new AnaMenu();
        anaMenu.anaMenu();

    }
}