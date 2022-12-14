package D07_practice3;

import java.util.Arrays;

public class C27_MethodlariKullanma {
    public static void main(String[] args) {


        int[] arr={2,3,4};
        System.out.println("Ilk Array'imiz: "+Arrays.toString(arr));

        // verilen bir int array'in elementlerini 2 artirin
        System.out.println("Bu en sade ve kisa yoldur: "+Arrays.toString(C21_ArrayElementleriniArtirma.elementleriArtirma(arr)));

        // arr array'inin elementlerini toplayip sonucu yazdirin
        System.out.println("Toplayacak oldugumuz array [4, 5, 6] : "+Arrays.toString(C22_ArrayElementleriToplama.pozitifSayilariTopla(arr)));

        // arr array'inde 10 element olarak var mi?
        C23_ArraydeElemanArama.elemanArr(arr,10); // bu satiri sout etmemize gerek yok sonucta zaten methot'da sout edilmis haldedir

        // kullanicidan deger alarak bir array olusturun
        int[] yeniArr=C24_KullaniciyaArrayOlusturma.arraysOlustur();
        System.out.println("Yeni olusturdugumuz array [4, 5, 6] bu olur: "+Arrays.toString(yeniArr));





    }
}
