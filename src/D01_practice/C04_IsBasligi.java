package D01_practice;

import java.util.Scanner;

public class C04_IsBasligi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.printf("lutfen karakteri giriniz");
        char isTanimi=scan.next().toLowerCase().charAt(0); // burada toLowerCase kullandigimizda kullanici
                                                            // buyuk yada kucuk harf girsede bu onu kucuk harfe ceviriyor

        if (isTanimi=='t'){
            System.out.printf("testersiniz");

        } else if (isTanimi=='d') {
            System.out.printf("Developorsunuz");

        } else if (isTanimi=='b') {
            System.out.printf("is analizisiniz");

        }else {
            System.out.printf("yanlis meslek");
        }


    }
}
