package D08_practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C16_OrtalamaninUstundekiNotsayisi {
    public static void main(String[] args) {

        // Ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen 100'den buyuk bir sayi girip, bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        List<Double> notlar=listeOlusturun();
        System.out.println(notlar);
        raporlar(notlar);


    }

    public static void raporlar(List<Double> notlar) {

        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        int ogrenciSayisi=notlar.size();
        double notlarToplami=0.0;
        double sinifNotOrtalamasi=0.0;
        int ortalamaUstundekiogrenciSayisi=0;

        // notlar toplamini bulalim

        for (int i = 0; i < notlar.size(); i++) notlarToplami=notlarToplami+notlar.get(i);

        // not ortalamasini bulalim

        sinifNotOrtalamasi=notlarToplami/ogrenciSayisi;

        // ortalama ustundeki ogrenci sayisini bulalim

        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>sinifNotOrtalamasi) ortalamaUstundekiogrenciSayisi++;
        }
    }

    public static List<Double> listeOlusturun() {

        List<Double> notlar=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        Double girilenNot=5.5;

        while (girilenNot<=100){

            System.out.println("Lutfen listeye eklemek icin not giriniz" +
                    "\nBitirmek icin 100'den buyuk bir sayi yazin");
            girilenNot= scan.nextDouble();

            if (girilenNot<=100) notlar.add(girilenNot);
        }
        return notlar;
    }
}
