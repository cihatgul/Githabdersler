package D06_practice2;

import java.util.Scanner;

public class C05_GirilenHarfiBuyutmek {

    public static void main(String[] args) {

        // girilen harfi buyutmek

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char krtk=scan.next().toUpperCase().charAt(0);

        System.out.println("Girilen Karakter: "+krtk);
    }
}
