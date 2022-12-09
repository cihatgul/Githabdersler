package D01_practice1;

import java.time.LocalDate;
import java.util.Scanner;

public class C21_Deneme {
    /*
    Task kullanicidan dogum tarihini isteyin ve gelen tarihi LocalDate clasindan bir degiskene atayin.
    Daha sonra kullanicidan random tarih girmesini isteyin. Random tarih dogum tarihinizden sonra ise program kabul etmesin
    ve kullanici yeniden tarih girsin. Sonuc olarak girilen random tarih dogum gununuzden once olmali.

     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int dYil;
        int dAy;
        int dGun;

        System.out.println("Dogum yilini giriniz"); // kullanicidan dogum tarihini isteyin
        dYil=scan.nextInt();

        System.out.println("Dogum ayinizi giriniz");
        dAy=scan.nextInt();

        System.out.println("Dogum gununuzu giriniz");
        dGun=scan.nextInt();

        LocalDate dogumGunu=LocalDate.of(dYil,dAy,dGun);
        System.out.println(dogumGunu);



        System.out.println("Karsilastirmak istediginiz yili giriniz");
        dYil=scan.nextInt();

        System.out.println("Karsilastirmak istediginiz ayi giriniz");
        dAy=scan.nextInt();

        System.out.println("Karsilastirmak istediginiz gunu giriniz");
        dGun=scan.nextInt();

        LocalDate girilenTarih=LocalDate.of(dYil,dAy,dGun);

        // karsilastirmada isAfter() kullaniriz

        if (girilenTarih.isAfter(dogumGunu)){

            System.out.println("gecersiz giris, girdiginiz tarih dogum tarihinden ince olmali");


        }else {

            System.out.println("giris kabul edildi");

        }
    }
}
