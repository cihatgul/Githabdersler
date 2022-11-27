package practice1;

import java.util.Scanner;

public class C19_constructor {
    public static void main(String[] args) {

        // Scanner class'indaki method ve variable'lari(ozellikleri) kullanmak icin scan objesi olustururuz

        Scanner         scan        =   new                             Scanner(System.in);
        // class adi    obje ismi       obje olusturmak icin kaynak     Scanner constructor'i

        scan.nextInt();

        String str=new String("Java Candir");
        String str2="Java ne guzel";

        str.toLowerCase();

    }
    public static void C19_constructor(){

        // method isimleri kucuk harfler baslar
        // class ismi ile ayni isimde olmamasi tercih edilir
        //return type varsa bu method'dur constructor olmaz

    }
}
