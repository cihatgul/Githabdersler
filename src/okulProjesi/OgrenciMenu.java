package okulProjesi;

    /*
    ============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ

	SEÇİMİNİZ:
     */

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciMenu implements Islemler {

    ArrayList<Ogrenci> ogrenciList=new ArrayList<>(); // ekleme de olusturduklarimizi bir ArrayList'e atamamiz gerektigi icin burada bir ArrayList olusturduk
    Scanner scan=new Scanner(System.in);
    void ogrMenu(){
        System.out.print("============= İŞLEMLER =============\n"+
                           "1-EKLEME\n"+
                            "2-ARAMA\n"+
                            "3-LİSTELEME\n"+
                            "4-SİLME\n"+
                            "Q-ÇIKIŞ"+
                            "SEÇİMİNİZ: ");


        while (true){

            char secim=scan.next().toUpperCase().charAt(0);

            switch (secim){
                case '1':{
                    ekleme();
                }

                case '2':{
                    arama();
                }

                case '3':{}
                case '4':{}
                case 'Q':{}

            }
        }
    }


    @Override
    public void ekleme() {
        System.out.println("Isim giriniz");
        String isim=scan.nextLine();

        System.out.println("Soyisim giriniz");
        String soyisim=scan.nextLine();

        System.out.println("TC No giriniz");
        String tcNo=scan.next();

        System.out.println("Yas giriniz");
        int yas=scan.nextInt();

        System.out.println("Sinifi giriniz");
        String sinif=scan.next();

        System.out.println("Ogrenci No giriniz");
        int ogrNo=scan.nextInt();

        Ogrenci ogrenci=new Ogrenci(isim,soyisim,tcNo,yas,sinif,ogrNo);

        ogrenciList.add(ogrenci); // bunu yapmamizin sebebi yukarida olusturdugumuz listeye atamak icindir

        ogrMenu();
    }


    @Override
    public void arama() {

        if (!ogrenciList.isEmpty()){

            System.out.println("Arama yapilacak Tc no giriniz: ");
            String aranacakTc= scan.next();

            for (Ogrenci each:ogrenciList) {

                if (each.getTcNo().equals(aranacakTc)){

                    System.out.println(each.toString());

                }
            }
            ogrMenu();

        } else{
            System.out.println("Ogrenci listesi bos");
            ogrMenu();

        }
    }


    @Override
    public void listeleme() {

        if (!ogrenciList.isEmpty()){

            for (Ogrenci each:ogrenciList) {

                System.out.println(each.toString());

            }
        } else {
            System.out.println("Ogrenci listesi bos");
            ogrMenu();

        }
    }


    @Override
    public void silme() {

    }

    @Override
    public void cikis() {

    }
}
