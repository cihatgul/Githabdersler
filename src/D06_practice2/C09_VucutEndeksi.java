package D06_practice2;

import java.util.Scanner;

public class C09_VucutEndeksi {

    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut
        // kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu(kg) girin: "+"\nLutfen boyunuzu(cm) giriniz: ");
        double kilo= scan.nextDouble();
        double boy= scan.nextDouble();
        double kitleendeksini=((kilo*10000)/(boy *boy));

        if (kitleendeksini>=30) System.out.println("Vucut endeksiniz 30'dan buyuktur ve obozsiniz");
        else if (kitleendeksini>=25) System.out.println("Vucut endeksiniz 25'dan buyuktur ve kilolusunuz");
        else if (kitleendeksini>=20) System.out.println("Vucut endeksiniz 20'dan buyuktur ve normalsiniz");
        else System.out.println("Vucut endeksiniz 20'dan kucuksunuz ve zayifsiniz");

    }
}
