package practice1;

import java.util.Scanner;

public class C01_KullanicidanAlinanİkiSayininEsitligi {
    public static void main(String[] args) {

        /*
        girilen sayilarin esit olup olmadigina bakilmasi
         */

        Scanner scan=new Scanner(System.in);
        System.out.printf("ilk float sayinizi seciniz");
        float sayi1=new Scanner(System.in).nextFloat();

        float say2=1234f;

        if (sayi1==say2){
            System.out.printf("sayi1 ve sayi2 esittir");

        }else {
            System.out.printf("girilen sayilar birbirine esit degildir");

        }
    }
}
