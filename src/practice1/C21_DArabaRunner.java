package practice1;

import ders23_constructors.DAraba;

public class C21_DArabaRunner {
    public static void main(String[] args) {

        // araba clasindan bir obje olusturalim

        C20_DAraba arb1=new C20_DAraba();

        System.out.println(arb1.marka); // Marka belirtilmedi
        System.out.println(arb1.model); // Marka belirtilmedi
        System.out.println(arb1.yakit); // null
        System.out.println(arb1.yil);   // 0
        System.out.println(arb1.fiyat); // 0

        arb1.marka="Tofas";
        arb1.model="Kartal";
        arb1.yakit="Benzin";
        arb1.yil=1991;
        arb1.fiyat=50000;

        System.out.println(arb1.marka); // Tofas
        System.out.println(arb1.model); // Kartal
        System.out.println(arb1.yakit); // Benzin
        System.out.println(arb1.yil);   // 1991
        System.out.println(arb1.fiyat); // 50000
        System.out.println(arb1.maxHiz(arb1.yakit)); // 230

        C20_DAraba arb2=new C20_DAraba();

        // arb2'nin ozelliklerini yazdirmak istesek

        System.out.println( "Marka: "  +arb2.marka+
                            "\nModel: "+arb2.model+
                            "\nYakit: "+arb2.yakit+
                            "\nYil: "  +arb2.yil+
                            "\nFiyat: "+arb2.fiyat);

        C20_DAraba arb3=new C20_DAraba();
        System.out.println(arb3);

        System.out.println(arb1);

        C20_DAraba arb4=new C20_DAraba();
        System.out.println(arb4);

    }
}
