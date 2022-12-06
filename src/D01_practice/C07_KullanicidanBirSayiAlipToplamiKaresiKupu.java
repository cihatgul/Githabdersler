package D01_practice;

import java.util.Scanner;

public class C07_KullanicidanBirSayiAlipToplamiKaresiKupu {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();


        System.out.println("birden girilen sayiya kadar ki tam sayilarin toplami: "+Toplam1(sayi));

        System.out.println("birden girilen sayiya kadar ki tam sayilarin kareleri toplami: "+Toplam2(sayi));

        System.out.println("birden girilen sayiya kadar ki tam sayilarin kupleri toplami: "+Toplam3(sayi));


        }

    private static int Toplam3(int x) {
        int sonuc=(x*(x+1)/2)*(x*(x+1)/2);

        return sonuc;
    }

    private static int Toplam2(int x) {
        int sonuc=(x*(x+1)*(2*x+1))/6;

        return sonuc;

    }

    private static int Toplam1(int x) {
        int sonuc=(x*(x+1))/2;

        return sonuc;

    }
}

