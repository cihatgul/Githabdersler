package D06_practice2;

import java.util.Scanner;

public class C23_AsalSayiBulma {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi girin: ");
        int sayi= scan.nextInt();
        boolean bayrak=true;

        for (int i = 2; i < sayi-1; i++) {
            if (sayi%i==0){
                bayrak=false;
                break;
            }
        }
        if (bayrak){
            System.out.println("asal sayidir");
        }else System.out.println("asal sayi degildir");
    }
}
