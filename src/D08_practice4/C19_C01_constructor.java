package D08_practice4;

import java.util.Scanner;

public class C19_C01_constructor {
    public static void main(String[] args) {

        // Scanner class'indaki method ve variable'lari(ozellikleri) kullanmak icin scan objesi olustururuz

        Scanner scan=new Scanner(System.in);

        //  class adi    obje ismi     obje olusturmak icin keyword         Scanner Constructor'i

        scan.nextInt();

        String str1=new String("Java Candir");
        String str2="Java ne guzel";

        str1.toLowerCase();

    }

    public static void C19_C01_constructor() {

        // method isimleri kucuk harfle baslar
        // class ismi ile ayni isimde olmamasi tercih edilir
        // return type var bu method'dur, constructor olamaz

    }
}
