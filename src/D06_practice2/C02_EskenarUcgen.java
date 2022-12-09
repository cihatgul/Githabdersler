package D06_practice2;

import java.util.Scanner;

public class C02_EskenarUcgen {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenarini giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if (kenar1>0||kenar2>0||kenar3>0){
            if (kenar1==kenar2||kenar2==kenar3) System.out.println("Girilen Degerler eskenar ucgendir");

        }else System.out.println("Girilen Degerler eskenar ucgen degildir");

    }
}
