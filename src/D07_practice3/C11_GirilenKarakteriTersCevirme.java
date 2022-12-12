package D07_practice3;

public class C11_GirilenKarakteriTersCevirme {

    // While loop kullanarak verilen bir String’i terse cevirip,
    // bu halini bize donduren bir method olusturun.

    public static void main(String[] args) {

        String str="Java Candir";

        String tersStr= stringTersCevirme(str);
        System.out.println(tersStr);

    }

    private static String stringTersCevirme(String str) {

        String tersStr="";
        int index=str.length()-1;

        while (index>=0){
            tersStr+=str.substring(index,index+1);
            index--;

        }
        return tersStr;

    }
}
