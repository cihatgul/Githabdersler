package D01_practice;

import java.util.Scanner;

public class C03_KullanicidanSayiAlipBirlerBasamaginiBulma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.printf("mutlak degerini almak istediginiz sayiyi giriniz");
        int sayi=scan.nextInt();

        if (sayi<0){
            System.out.println(-sayi);

        }else {
            System.out.println(sayi);

        }
    }
}
