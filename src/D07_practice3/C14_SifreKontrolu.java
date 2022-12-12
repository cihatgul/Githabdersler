package D07_practice3;

import java.util.Scanner;

public class C14_SifreKontrolu {

    /*
    Kullanicidan bir sifre girmesini isteyin.
    Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
    Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
    ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
    - Sifre buyuk harf icermelidir
    - Sifre ozel karakter icermelidir
    - Sifre en az 8 karakter olmalidir.
    SADECEa54
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String sifre;
        int bayrak;
        boolean sifreDogruMu;

        do {
            System.out.println("Lutfen bir sifre giriniz");
            sifre= scan.nextLine();
            bayrak=0;
            
            int sonuc=kucukHarfKontroluYapalim(sifre);
            bayrak=bayrak+sonuc;

            sonuc=buyukHarfKontroluYapalim(sifre);
            bayrak=bayrak+sonuc;
            
            sonuc=ozelKarakterKontroluYapalim(sifre);
            bayrak=bayrak+sonuc;
            
            if (sifre.length()<8) System.out.println("sifre en az 8 karakter olmalidir");
            else bayrak++;
            
        }while (bayrak!=4);
        System.out.println("Sifreniz basari ile kaydedildi");
        
        
    }

    private static int ozelKarakterKontroluYapalim(String sifre) {
        int bayrak=0;

        for (int i= 0; i<sifre.length() ; i++) {
            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                bayrak++;
                break;
            }
        }
        if (bayrak==0){
            System.out.println("Sifre kucuk harf icermelidir");
            return 0;
        }else return 1;
    }

    private static int buyukHarfKontroluYapalim(String sifre) {
        int bayrak=0;

        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i)>='A' && sifre.length()<='Z'){
                bayrak++;
                break;
            }
        }

        if (bayrak==0){
            System.out.println("Sifre buyuk harf icermelidir");
            return 0;
        }else return 1;
    }

    private static int kucukHarfKontroluYapalim(String sifre) {
        
        int bayrak=0;
        String ozelKarakterler = "§±@!$%^&*()_-+=?/>.<,`~#";

        for (int i = 0; i < sifre.length(); i++) {
            if (ozelKarakterler.contains(sifre.substring(i,i+1))){
                bayrak++;
                break;
            }
        }
        if (bayrak==0){
            System.out.println("Sifre ozel karakter icermelidir");
            return 0;
        }else return 1;
    }
}
