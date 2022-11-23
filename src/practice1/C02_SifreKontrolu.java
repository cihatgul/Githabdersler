package practice1;

import java.util.Scanner;

public class C02_SifreKontrolu {
    public static void main(String[] args) {

        /*
        girilen sifreyi kontrol edilmesi
         */

        /*
        girilen karakter esit olup olmadigina bakar equals
        ama buyuk kucuk ayni olmasi gerekir. equalsIgnoreCase'de
        ise buyuk kucuk olmasina bakmaz sadece girilen karakterin dogru olup olmamasina bakar
        */

        Scanner scan=new Scanner(System.in);
        System.out.printf("sifre giriniz");
        String sifre= scan.next();

        if (sifre.equalsIgnoreCase("JavaLearner")){

            // burada JavaLearner L yerine l de yazinca sifreyi dogru kabul ediyor hata nereden kaynakli

            System.out.printf("girilen fisre dogru");

        }else {
            System.out.printf("girilen fisre yanlis");

        }
    }
}
