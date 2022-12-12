package D05_practice1;

import java.util.Arrays;

public class C22_ArraysGirilenleriSiralamak {

    public static void main(String[] args) {

        int[] arr1={0,2,5,3,1};
        int[] arr2={5,2,7,1,4};
        int[] arr3={2,7};
        int[] arr4={5,4,3,2};
        int[] arr5={2,3,4,5,6};
        int[] arr6={2,3,4,5,6,-2,-6};

        mountainArrayKontrol(arr1);
        mountainArrayKontrol(arr2);
        mountainArrayKontrol(arr3);
        mountainArrayKontrol(arr4);
        mountainArrayKontrol(arr5);
        mountainArrayKontrol(arr6);
        
    }

    public static void mountainArrayKontrol(int[] arr) {

        int maxSayi=arr[0];
        int maxSayiIndex=0;
        boolean sonuc=false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxSayi){
                maxSayi=arr[i];
                maxSayiIndex=i;

            }
        }

        if (maxSayiIndex==0 || maxSayiIndex==arr.length-1){
            sonuc=false; // max sayinin yerini ayarladik

        }

        for (int i = 0; i < maxSayiIndex; i++) {
            if (arr[i]<arr[i+1]){ // max sayiya kadar surekli bir artma var mi ona baktik
                continue;

            }else {
                sonuc=false;
                break;

            }
        }

        if (sonuc){ // max sayidan sonra surekli bir azalis var mi
            for (int i = maxSayiIndex; i < arr.length-1; i++) {
                if (arr[i]>arr[i+1]){
                    continue;

                }else {
                    sonuc=false;

                }
            }
        }

        if (sonuc) System.out.println(Arrays.toString(arr)+" Montain Arrayidir");
        else System.out.println(Arrays.toString(arr)+" Montain Arrayidir degildir");

    }
}
