package D06_practice2;

import java.util.Scanner;

public class C01_SayiGiripAyinIsminiVermek {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ogrenmek istediginiz ayin harfini girin");
        char ilkharf=scan.next().toLowerCase().charAt(0);

        if (ilkharf=='o') System.out.println("Ocak");

        if (ilkharf=='s') System.out.println("Subat");

        if (ilkharf=='m') System.out.println("Mart veya Mayis");

        if (ilkharf=='n') System.out.println("Nisan");

        if (ilkharf=='h') System.out.println("Haziran");

        if (ilkharf=='t') System.out.println("Temmuz");

        if (ilkharf=='a') System.out.println("Agustos veya Aralik");

        if (ilkharf=='e') System.out.println("Eylul veya Ekim");

        if (ilkharf=='k') System.out.println("Kasim");

    }
}
