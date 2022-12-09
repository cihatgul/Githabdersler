package D01_practice1;

import java.util.Scanner;

public class C05_MailAdresiKarsilastirma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.printf("mail adresinizi giriniz");
        String email= scan.next();

        if (email.endsWith("@gmail.com")){
            System.out.printf("Email onaylandi");

        } else if (email.endsWith("@hotmail.com")) {
            System.out.printf("lutfen gmail adresinizi giriniz");

        }else {
            System.out.printf("lutfen gecerli email adresini giriniz");

        }
    }
}
