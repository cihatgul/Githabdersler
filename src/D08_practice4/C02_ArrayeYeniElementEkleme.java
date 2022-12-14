package D08_practice4;

import java.util.Arrays;

public class C02_ArrayeYeniElementEkleme {
    public static void main(String[] args) {

        // verilen bir int array'e istenen bir elementi ekleyip
        // yeni halini bize donduren bir method olusturun

        int[] abc= {3,5,8,9,6,7,3,4};
        int eklenecekSayi=10;

        abc=arrayeElemanEkleme(abc,eklenecekSayi);

        System.out.println(Arrays.toString(abc));

    }
    private static int[] arrayeElemanEkleme(int[] eklenecekarr, int eklenecekSayi) {

        int[] yeniArr=new int[eklenecekarr.length+1];

        for (int i = 0; i < eklenecekarr.length; i++) {
            yeniArr[i]=eklenecekarr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekSayi;
        return yeniArr;
    }
}
