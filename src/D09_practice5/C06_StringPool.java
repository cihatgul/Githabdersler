package D09_practice5;

public class C06_StringPool {
    public static void main(String[] args) {

        String a="";

        a=a+2;
        a=a+'c';
        a=a+false;

        if (a=="2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");
    }
}
