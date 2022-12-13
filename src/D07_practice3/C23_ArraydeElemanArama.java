package D07_practice3;

public class C23_ArraydeElemanArama {
    public static void main(String[] args) {

        // Verilen bir array’de istenen bir elemanin
        // var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {1,2,4,5,3,6,7,4,2,3,5,1,3,2};

        int arananEleman=2;

        elemanArr(arr,arananEleman);
    }

    private static void elemanArr(int[] arr, int arananEleman) {

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==arananEleman){
                sayac++;
            }
        }
        if (sayac==0) System.out.println("Aranan sayi array'de yok");
        else System.out.println("Aranan " + arananEleman + " sayisi, array'de " + sayac + " kere kullanilmis");

    }
}
