package D09_practice5;

public class C04_Immutable {
    public static void main(String[] args) {

        // Bu kod calistiginda Java kac obje olusturur ?

        String str="Ali";

        for (int i = 0; i < 10; i++) str=str+".";
        System.out.println("Buna bakalim: "+str);
    }
}
