package D06_practice2;

public class C18_MailKontrolu {

    /*
       mail kontrolu yapan bir program hazirlayin
       1- mail @ isareti icermiyorsa "gecersiz email"
       2- @gmail.com icermiyorsa "gmail adresi giriniz"
       3- @gmail.com ile bitmiyorsa "yazim hatasi"
       seklinde sonuc yazdirin
        */

    public static void main(String[] args) {

        String email="ahmet@gmail.com";

        if (!email.contains("@")) System.out.println("gecersiz email");

        else if (!email.contains("egmail.com")) System.out.println("gmail adresi giriniz");

        else if (!email.endsWith("@gmail.com")) System.out.println("yazim hatasi");

        else System.out.println("email basari ile kaydedildi");


    }
}
