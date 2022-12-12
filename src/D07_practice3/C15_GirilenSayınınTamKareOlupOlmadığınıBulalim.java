package D07_practice3;

import java.util.Scanner;

public class C15_GirilenSayınınTamKareOlupOlmadığınıBulalim {

    // Kullanicidan bir pozitif sayi isteyin,
    // sayının tam kare olup olmadığını bulunuz,
    // tamkare ise true değilse false yazdırınız.
    //	Ornek :  input : 16, output: 4

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karasine bakacaginiz sayiyi giriniz");
        int sayi= scan.nextInt();
        int baslangic=1;
        int bayrak=0;

        do {
            if (baslangic*baslangic==sayi){
                System.out.println("true");
                bayrak++;
                break;

            }
        }while (baslangic*baslangic<=sayi);

        if (bayrak==0) {
            System.out.println("false");
        }
    }
}
