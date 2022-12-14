package D07_practice3;

import java.util.Arrays;

public class C26_EnBuyukEnKucukElementiBulma {
    public static void main(String[] args) {

        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun

        int[] arr={3,8,1,5,2,9};
        enKucukEnbuyukElementleriYazdiralim(arr);

    }

    private static void enKucukEnbuyukElementleriYazdiralim(int[] arr) {

        Arrays.sort(arr); // [1, 2, 3, 5, 8, 9]

        System.out.println("Arrays'in son hali: "+arr);
        System.out.println("En buyuk: "+arr[arr.length-1]);
        System.out.println("En kucuk: "+arr[0]);
    }
}
