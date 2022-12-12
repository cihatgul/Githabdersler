package D06_practice2;

import java.util.Scanner;

public class C22_KullanicininGirdigiSayininRakamlariToplami {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int rakamlariToplami=0;
        int birlerBasamagi=0;
        String sayiStr= ""+sayi;

        for (int i = 1; i < sayiStr.length(); i++) {

            birlerBasamagi=sayi%10;
            rakamlariToplami=rakamlariToplami+birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlariToplami);
    }
}
