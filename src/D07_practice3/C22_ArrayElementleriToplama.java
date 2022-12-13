package D07_practice3;

public class C22_ArrayElementleriToplama {
    public static void main(String[] args) {

        // Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int[] arr={3,-3,5,-7,-6,1,-2};

        pozitifSayilariTopla(arr);

        System.out.println(pozitifSayilariTopla(arr));

    }

    private static int pozitifSayilariTopla(int[] arr) {

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) toplam=toplam+arr[i];
        }
        return toplam;
    }
}
