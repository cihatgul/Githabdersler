package D07_practice3;

import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class C08_KullanicidanSifreIstemek {

     /*
     Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
     kullanicinin yeni sifre girmesi isteyin
     Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
     gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin sartlar :
     - sifrenin ilk karakteri kucuk harf olmali
     - sifrenin son karakteri sayi olmali
     - sifre en az 8 basamkli olmali
     */
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         boolean sifreDogruMu=false;
         String sifre="";
         int bayrak=0;

         while (sifreDogruMu!=true){
             System.out.println("Lutfen difreyi giriniz");
             sifre= scan.nextLine();
             bayrak++;

             if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
                 System.out.println("Sifrenin ilk karakteri buyuk harf olamaz");
                 bayrak++;
             }

             if (!(sifre.charAt(sifre.length()-1)>=0 && sifre.charAt(sifre.length()-1)<='9')){
                 System.out.println("Sifrenin son karakteri bir rakam olmali");
                 bayrak++;
             }

             if (sifre.length()<8){
                 System.out.println("Sifre 8 karakterden fazla olmali");
                 bayrak++;
             }

             if (bayrak==0){
                 System.out.println("Girilen sifre dogrudur dogru :) ");
                 sifreDogruMu=true;
             }
         }
     }
}
