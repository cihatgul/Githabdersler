package D08_practice4;

import java.util.Arrays;

public class C29_PassByValueArray {

    public static void main(String[] args) {

        int[] arr={3,4,5};

        rakamlari5Artir(arr);

    }

    public static void rakamlari5Artir(int[] arr) {

        for (int i = 0; i < arr.length; i++) arr[i]=arr[i]+5;
        System.out.println(Arrays.toString(arr));

    }
}
