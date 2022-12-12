package D07_practice3;

public class C13_SayilarinToplamiDoWhile {

    // 10,11,12 sayilarini toplayan bir while loop olusturalim

    public static void main(String[] args) {

        int sayi=10;
        int toplam=0;

        do {
            toplam=toplam+sayi;
            sayi++;

        }while (sayi<=12);

        System.out.println("Sayilarin toplami: "+toplam);

    }
}
