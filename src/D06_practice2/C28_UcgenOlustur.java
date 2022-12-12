package D06_practice2;

public class C28_UcgenOlustur {

    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        System.out.println("\n");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(i*j +" ");
            }
            System.out.println("");

        }
    }
}
