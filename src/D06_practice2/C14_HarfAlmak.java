package D06_practice2;

import java.util.Scanner;

public class C14_HarfAlmak {

    // J : Java
    // D : Devolepment
    // K : Kit
    // Kullanicidan bir harf alin
    // alinan harf J, D, K 'dan biri ise yukaridaki kelimeleri yazdirin
    // bu harflerden biri degilse "Gecersiz harf" yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        switch (harf){

            case 'J':
            case 'j':
                System.out.println("Java");
                break;
            case 'D':
            case 'd':
                System.out.println("Devolepment");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Hatali giris yaptiniz");

        }


    }
}
