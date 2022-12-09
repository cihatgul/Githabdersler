package D06_practice2;

import java.util.Scanner;

public class C04_EmekliOlabilme {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        if (yas>=65) System.out.println("Emekli olabilirsiniz");
        else System.out.println("Emekli olmaniz icin calismaniz yil: "+(65-yas));

    }
}
