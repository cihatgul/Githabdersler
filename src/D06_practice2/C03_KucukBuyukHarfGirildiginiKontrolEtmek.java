package D06_practice2;

import java.util.Scanner;

public class C03_KucukBuyukHarfGirildiginiKontrolEtmek {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='A' && krk<='Z') System.out.println("Girilen karakter buyuk harftir");
        else System.out.println("Kucuk harf girildi");

    }
}
