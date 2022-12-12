package D07_practice3;

import java.util.Scanner;

public class C10_GirilenSayininRakamlariToplami {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen rakamlarini toplayacak sayiyi giriniz");
        int sayi= scan.nextInt();
        int birlerBasamagi=0;
        int rakamlariToplami=0;

        while (sayi!=0){
            birlerBasamagi=sayi%10;
            rakamlariToplami=rakamlariToplami+birlerBasamagi;
            sayi/=10;

        }
        System.out.print("Girilen sayinin rakamlari toplami: "+rakamlariToplami);

    }
}
