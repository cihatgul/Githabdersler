package D06_practice2;

import java.util.Scanner;

public class C10_MusteriKartinaIndirim {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise  %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az ise  %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanicidan aldigi urun adetini giriniz");
        int urunAdeti= scan.nextInt();
        boolean kartVarmi=false;
        double listeFiyati=12.5;
        double toplanFiyat=0;

        if (kartVarmi && urunAdeti>=10){
            toplanFiyat=urunAdeti*listeFiyati*0.8;
            System.out.println("Musteri karti var ve 10 urunden fazla alinmistir %20 indirimli toplam fiyat: "+toplanFiyat);

        } else if (kartVarmi && urunAdeti<10) {
            toplanFiyat=urunAdeti*listeFiyati*0.85;
            System.out.println("Musteri karti var ve 10;un aitinda urun alinmistir %15 indirimli toplam fiyat: "+toplanFiyat);

        }else if (!kartVarmi && urunAdeti>=10) {
            toplanFiyat=urunAdeti*listeFiyati*0.85;
            System.out.println("%15 indirimli toplam fiyat: "+toplanFiyat);

        } else if (!kartVarmi && urunAdeti<10) {
            toplanFiyat=urunAdeti*listeFiyati;
            System.out.println("Musteri kartiniz yok ve 10 adetten az urun almissiniz indirimsiz fiyat: "+toplanFiyat);
        }
    }
}


