package D01_practice;

import java.util.Scanner;

public class C08_UcBasamakliBirSayininHesaplanmasi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir 3 basamakli sayi giriniz: ");
        int sayi= scan.nextInt();

        System.out.println("Girilen sayilarin rakamlari toplami: "+toplam(sayi));

    }

    private static int toplam(int x) {

        int rkt=0;
        int b1=x%10;
        int b2=(x/10)%10;
        int b3=(x/100)%10;

        rkt=b1+b2+b3;

        return rkt;
    }
}
