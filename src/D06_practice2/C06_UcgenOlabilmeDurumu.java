package D06_practice2;

import java.util.Scanner;

public class C06_UcgenOlabilmeDurumu {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgen uzunluklarini giriniz: ");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1<=0||kenar2<=0||kenar3<=0){
            System.out.println("Gecersiz giris");

        } else if (kenar1==kenar2 && kenar2== kenar3) {
            System.out.println("Eskenar ucgendir");

        }else System.out.println("Eskenar ucgen degildir");

    }
}
