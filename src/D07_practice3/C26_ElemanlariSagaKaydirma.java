package D07_practice3;

import java.util.Arrays;

public class C26_ElemanlariSagaKaydirma {
    public static void main(String[] args) {

        // Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        int[] arr = {4, 5, 6, 7};

        arr=sagakaydiralim(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] sagakaydiralim(int[] arr) {

        int bosKova=arr[arr.length-1]; // son elementi bos kovaya koyduk

        for (int i=arr.length-2; i >=0; i--) {
            arr[i+1]=arr[i];
        }
        arr[0]=bosKova;
        return arr;
    }
}
