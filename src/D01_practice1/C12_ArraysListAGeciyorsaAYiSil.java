package D01_practice1;

public class C12_ArraysListAGeciyorsaAYiSil {
    public static void main(String[] args) {

        String str1="Sabah";
        String str2="Grubu";
        String str3="Ders";
        String str4="Calisiyor";
        String str5="YoRulUyor";

        // bir stringi de ki uzunlugu length bulur bize
        System.out.println(str1.length()); // 5

        // str2 de ki karakterleri hepsini buyutmek icin toUpperCase kullaniriz
        System.out.println(str2.toUpperCase());

        // str5 de ki karakterleri hepsini kucultmek icin toLowerCase kullaniriz
        System.out.println(str5.toLowerCase());

        // burada str1 ile str2 ayni olup olmadigina bakmak icin equals kullaniriz
        System.out.println(str1.equals(str2));

    }
}
