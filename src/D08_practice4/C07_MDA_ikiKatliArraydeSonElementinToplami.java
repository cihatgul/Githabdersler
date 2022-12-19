package D08_practice4;

public class C07_MDA_ikiKatliArraydeSonElementinToplami {
    public static void main(String[] args) {

        // Verilen 2 katli bir array’de her bir inner array’in son
        // elementlerinin toplaminini yazdiran bir method olusturun.

        int[][] arr={{5,7}, {5, 8, 9},{0,1}};

        sonElementinToplami(arr);
        System.out.println("Arrays'in son elementlerinin toplami: "+sonElementinToplami(arr));

    }

    public static int sonElementinToplami(int[][] arr) {

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam=toplam+arr[i][arr[i].length-1];
        }
        return toplam;
    }
}
