package D07_practice3;

import java.util.Arrays;
import java.util.Scanner;

public class C24_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {

        // Kullanicidan array’in boyutunu elementlerini
        // alip array’i olusturan ve bize donduren bir method olusturun.

        int[] kullaniciArraysOlusturmak=arraysOlustur();

        System.out.println(Arrays.toString(kullaniciArraysOlusturmak));

    }

    public static int[] arraysOlustur() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Olusturulacak array'in boyutunu giriniz ");
        int arrayinUzunlugu= scan.nextInt();
        int[] kullaniciArraysOlusturmak=new int[arrayinUzunlugu];

        for (int i = 0; i < arrayinUzunlugu; i++) {
            System.out.println("array'e eklenecek bir sayi giriniz");
            kullaniciArraysOlusturmak[i]= scan.nextInt();

        }
        return kullaniciArraysOlusturmak;
    }
}
