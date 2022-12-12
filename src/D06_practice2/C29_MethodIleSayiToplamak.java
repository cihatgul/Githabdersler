package D06_practice2;

import java.util.Scanner;

public class C29_MethodIleSayiToplamak {

    public static void main(String[] args) {

        isteTopla();


    }

    static void isteTopla() {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("girilen iki sayinin toplami: "+(sayi1+sayi2));
    }
}
