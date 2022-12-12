package D07_practice3;

public class C02_IkiStringAralarindaBoslukBirakma {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Candir";

        arayaBoslukBirakmak(str1,str2);
        System.out.println(arayaBoslukBirakmak(str1,str2));

    }

    private static String arayaBoslukBirakmak(String str1,String str2) {

        return str1+" "+str2;
    }
}
