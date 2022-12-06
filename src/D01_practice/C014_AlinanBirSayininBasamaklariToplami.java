package D01_practice;

import java.util.Scanner;

public class C014_AlinanBirSayininBasamaklariToplami {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println("girilen sayinin rakamlari toplami: "+toplam(sayi));
    }

    private static int toplam(int x) {

        int rkt=0;
        int b1=x%10;
        int b2=(x/10)%10;
        int b3=(x/100)%10;

        rkt=(b1+b2+b3);

        return rkt;
    }
}
