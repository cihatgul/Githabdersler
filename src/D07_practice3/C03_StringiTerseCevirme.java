package D07_practice3;

public class C03_StringiTerseCevirme {
    public static void main(String[] args) {

        String input= "java kod yazdikca ogrenilir";

        System.out.println(stringiTersCevirme(input));
        stringiTersCevirme(input);

    }

    private static String stringiTersCevirme(String input) {

        String tersStr="";

        for (int i = input.length()-1; i>=0; i--) {
            tersStr=tersStr+input.charAt(i);

        }
        return tersStr;
    }
}
