package D07_practice3;

import java.util.Arrays;

public class C28_VerilenStrDaKacTaneEHarfiOldugunuBulunuz {
    public static void main(String[] args) {

        String str= "java gercekten cok cok guzel";
        // verilen str'da kac tane e harfi oldugunu bulunuz

        String[] eArrayi=str.split("e"); // burada e'leri sildik

        System.out.println(Arrays.toString(eArrayi)); // [java g, rc, kt, n cok cok guz, l]
        System.out.println(eArrayi.length-1);

        System.out.println("Merimdeki e sayisi: "+(eArrayi.length-1));

        String[] tumKarakterlerArr=str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));

        int sayac=0;

        // bir loop ile tum karakterleri kontrol edelim

        for (int i = 0; i <tumKarakterlerArr.length; i++) {
            if (tumKarakterlerArr[i].equals("e")){
                sayac++;
            }
        }
        System.out.println("Metindeki e sayisi: "+sayac);
    }
}
