package D06_practice2;

public class C16_KarakterUzunlugu {

    public static void main(String[] args) {

        String str="Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length()); // 34

        // son karakter u'yu bulma

        System.out.println(str.charAt(33)); // u
        System.out.println(str.charAt(str.length()-1)); // son karakteri elde etmek icin kullanilir

        System.out.println(str.charAt(str.length()-3)); // sondan 3.karakteri yazdirin g'yi yazdiririz

    }
}
