package D07_practice3;

import java.util.Scanner;

public class C07_GirilenSayilar500EsitOldugundaBitirelim {

    /*
    Kullanicidan toplanmak uzere sayi alin sayilarin
    toplami 500'e esit olur veya gecerse girilen sayi adedi,
    girilen sayilarin toplamini ve "Bu kadar yeter" yazdirin
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double girilenSayi=0;
        double toplam=0;
        int sayac=0;

        while (toplam<=500){
            System.out.println("Toplamak istediginiz sayilari giriniz: ");
            girilenSayi= scan.nextDouble();

            toplam=toplam+girilenSayi;
            sayac++;
        }
        System.out.println("Girilen "+sayac+" sayinin toplami: "+toplam+" oldu. bu kadar yeterli");

    }
}
