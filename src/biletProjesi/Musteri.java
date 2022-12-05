package biletProjesi;

import java.util.HashMap;
import java.util.Scanner;

public class Musteri {


        HashMap<String,String> kullanicilar=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        public void musteriKontrol(){

            System.out.println("kullanici adi giriniz");
            String userName= scan.nextLine();

            if (!kullanicilar.containsKey(userName)){
                System.out.println("kullanici kayitli degil.");

                musteriKayit();

            }else {

                System.out.println("Sifreyi giriniz.");
                String password= scan.next();

                if (kullanicilar.get(userName).equals(password)){ // burada yaptigimiz useName ile password ayni mi ona bakiyoruz
                    System.out.println("Sisteme basariyla giris yaptiniz");

                }else {

                    while (kullanicilar.get(userName).equals(password)){

                        System.out.println("Yanlis sifre girdiniz tekrar deneyiniz.");

                        password=scan.next();

                    }

                }
            }
        }


    public void musteriKayit() {

        System.out.println("Kullanici adi giriniz: ");
        String userName= scan.nextLine();

        if (kullanicilar.containsKey(userName)){
            System.out.println("Bu isimde kullanici kayitli tekrar kullanici giriniz");
            musteriKayit();

        }else {

            System.out.println("Sifre giriniz");
            String password= scan.next();
            kullanicilar.put(userName, password);
            System.out.println("Kayit yapilmistir");


        }
    }
}
