package ders25_staticKeyword;

public class CDeneme {

    int a=10;
    static int b=20;
    String str1="Ali";
    static String str2="Ayse";

    CDeneme (){
        str1="Hasan";
        str2+="++";

    }

    CDeneme(int x,int y){
        a=x;
        b=y;

    }

    public static void main(String[] args) {

        CDeneme dnm1=new CDeneme(6,8);
        System.out.println(dnm1.b);

        CDeneme dnm2=new CDeneme(10,12);
        System.out.println(dnm1.b);

    }
}
