package D07_practice3;

public class C12_SayilarinToplamiWhile {

    // 10,11,12 sayilarini toplayan bir while loop olusturalim

    public static void main(String[] args) {

        int sayi=10;
        int toplam=0;

        while (sayi<=12){
            toplam=toplam+sayi;
            sayi++;

        }
        System.out.println("Sayilarin toplami: "+toplam);
    }
}
