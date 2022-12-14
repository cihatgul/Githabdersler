package D07_practice3;

import java.util.Arrays;

public class C30_ArrayeYeniElementEkleme {
    public static void main(String[] args) {

        int[] arr= {2,4,6};

        int[] arr2=new int[arr.length+1]; // [0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }

        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 0]

        arr2[arr2.length-1]=8; // buraya en sona ekleyecegimiz sayiyi giriyoruz

        System.out.println("Burasi 8 eklenmis halidir: "+Arrays.toString(arr2));

        arr=arr2;

        System.out.println("Burada arr2'yi arr'e atadik"+Arrays.toString(arr));

    }
}
