package ders25_staticKeyword;

public class CC04_PassByValue {

    public static void main(String[] args) {

        double fiyat=100;

        indirimUyla(fiyat);
        System.out.println(indirimUyla(fiyat)); // 90

        System.out.println(fiyat); // 100
    }

    private static double indirimUyla(double fiyat) {

        // %10 indirim yapsin

        fiyat=fiyat*0.9; // fiyata atama yaptik kalici olarak 90 oldu

        return fiyat;
    }
}
