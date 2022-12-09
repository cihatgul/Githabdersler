package D06_practice2;

import java.util.Scanner;

public class C07_NegatifBozitifOldugunuBulma {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi= scan.nextInt();

        if (sayi<0) System.out.println("Sayi negatiftir");
        else if (-1<sayi && sayi<10) System.out.println("Girilen sayi rakamdir");
        else if (9<sayi && sayi<100) System.out.println("Girilen sayi iki basamaklidir");
        else System.out.println("Girilen sayi buyuk sayidir");

    }
}
