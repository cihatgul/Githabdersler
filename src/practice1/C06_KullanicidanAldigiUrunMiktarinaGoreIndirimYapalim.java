package practice1;

import java.util.Scanner;

public class C06_KullanicidanAldigiUrunMiktarinaGoreIndirimYapalim {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("kac tane aldiniz");
        System.out.println("tamesi ne kadar");
        int adet= scan.nextInt();
        double tamFiyat= scan.nextDouble();
        double toplamUcret=tamFiyat*adet;

        System.out.printf("musteri kartiniz var mi? varsa ise 'E' yoksa 'H' tiklayiniz");
        char musteriKartiVarmiYokMu=scan.next().toLowerCase().charAt(0);
        // burada toLowerCase kullandigimizda 'e' yada 'E' girdigimizde ikisini de kabul etmesi icindir

        if (musteriKartiVarmiYokMu=='e'){
            if (adet>10){
                toplamUcret*=0.8;

            }else {
                toplamUcret*=0.85;

            }
        } else if (musteriKartiVarmiYokMu=='h') {
            if (adet>10){
                toplamUcret*=0.85;

            }else {
                toplamUcret*=0.9;

            }

        }else {
            System.out.println("yanlis tuslama yaptiniz");

        }
        System.out.printf("toplam borcunuz: "+toplamUcret);

    }
}

