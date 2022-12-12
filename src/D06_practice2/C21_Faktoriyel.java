package D06_practice2;

import java.util.Scanner;

public class C21_Faktoriyel {

    public static void main(String[] args) {

        // kullanicinin verdigi sayinin faktoryelini bulalim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen faktoriyelini almak istediginiz bir sayi giriniz: ");
        int sayi= scan.nextInt();
        int faktoriyel=1;
        int toplam=0;

        for (int i = sayi; i >=1; i--) {
            faktoriyel=faktoriyel*i;
        }
        System.out.print("girilen sayinin faktoriyeli: "+faktoriyel);

        // 1'den 100'e (sinirlar dahil)kadar olan sayilari toplayin

        for (int i = 0; i <=sayi; i++) {
            toplam=toplam+i;
        }
        System.out.print("\ngirilen sayiya kadar olanlarin toplami: "+toplam);

    }
}
