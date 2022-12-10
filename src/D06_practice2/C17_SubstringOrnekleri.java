package D06_practice2;

public class C17_SubstringOrnekleri {

    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.substring(5)); // 5. satirdan sonra yazdir demek oluyor "ogren, isi kap"

        System.out.println(str.substring(0)); // "Java ogren, isi kap"

        System.out.println(str.length()); // 19 karakter iceriyor

        String sonHarf=""+str.charAt(str.length()-1); // son karakter yani "p"'yi bize verir

        System.out.println(str.substring(str.length()-3)); // burada sondaki 3 harfi verir bize

        String str1= "Java gun gectikce guzellesiyor";

        System.out.println("\n"+str1.substring(5,8)); // gun

        String isim= "huseYIN";

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        System.out.println(isim); // burada ilk harfi buyuk yaptik ondan sonraki harflari de kucuk yaptik=Huseyin seklini alir

        System.out.println(isim.substring(2,5)); // sey

        System.out.println(isim.substring(3,4)); // e

        System.out.println(" buraya yazdigimiz hiclik yazdirir: "+isim.substring(2,2));


        String str2="Java";
        String str3="Guzeldir";
        boolean bl=true;
        int sayi=20;
        double dbl=3.54;

        System.out.println(bl+str2+sayi); // Javatrue20

        System.out.println(sayi+dbl); // 23.54

        System.out.println(str2.concat(" ").concat(str2)); // Java Guzeldir

        String str4 = "Java ile kodlama cok zevkli";

        System.out.println(str4.concat("cok")); // true burada str4'de cok var mi yok mu ona bakiyoruz

        System.out.println(str4.concat("oldu")); // true

        System.out.println(str4.concat("a")); // true

        System.out.println(str4.concat("java")); // false burada Java'da ki j buyk olmadigi icin false dedi

        String str5="Java";

        System.out.println(str5.concat(str4)); // true olur sonucta str4 ve str5 de ki Javalarin yazilislari ayni oldugu icin true olur

    }
}









