package D09_practice5;

import java.util.ArrayList;
import java.util.List;

public class C02_ImmutableClasses {

    public static void main(String[] args) {

        String str="Java guzeldir";

        System.out.println(str.toUpperCase()); // JAVA GUZELDIR

        System.out.println(str); // Java guzeldir

        str.toLowerCase();

        System.out.println(str); // Java guzeldir

        // String immutable oldugu icin, method ile yapilan degisikler String'i kalici degistirmez

        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.remove(0);

        // List ve Array mutable olduklari icin method ile yapilan degisiklikler kalici olur

    }
}
