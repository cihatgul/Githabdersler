package D07_practice3;

import java.util.Arrays;

public class C20_ArraysIsimYazdirma {
    public static void main(String[] args) {

        String [] arr= {"Ali", "Ulus","Nesrin"};

        // Bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i < arr.length; i++) {
            System.out.print(""+arr[i]+" "); // Ali Ulus Nesrin

        }
        System.out.println(" ");

        System.out.println(Arrays.toString(arr)); // [Ali, Ulus, Nesrin]

    }
}
