package D07_practice3;

import java.util.Arrays;

public class C21_ArrayElementleriniArtirma {
    public static void main(String[] args) {

        // Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] arr = {2,4,6,8};

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+2;
        }
        System.out.println(Arrays.toString(arr)); // [4, 6, 8, 10]

        arr=elementleriArtirma(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static int[] elementleriArtirma(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+2;
        }
        return arr;
    }
}
