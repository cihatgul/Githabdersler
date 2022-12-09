package D06_practice2;


import java.util.Scanner;

public class C11_PozitifNegatifSayi {

    // kullanicidan bir sayi alin
    // sayi pozitif ise 2 katini yazdirin
    // sayi pozitif degilse sayiya 10 ekleyip yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        double sayi= scan.nextDouble();

        if (sayi>0) System.out.println("Girilen sayi pozotof ve islem sonucu: "+sayi*2);
        else if (sayi<0) System.out.println("Girilen sayi negatif ve islem sonucu: "+(sayi+10));


    }
}
