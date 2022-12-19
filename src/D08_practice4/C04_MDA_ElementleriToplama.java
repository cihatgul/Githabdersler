package D08_practice4;

public class C04_MDA_ElementleriToplama {
    public static void main(String[] args) {

        int[] arr={3,5,7,8}; // 23

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam=toplam+arr[i];
        }
        System.out.println("\nTek katli arr'in toplami: "+toplam); // 23

        int[][] arr1 = {{1,2},{3,4,5},{7}};

        toplam=0; // toplam'i 0'a esitlemezsel sonuc ilk ve bunun toplamini verir bize = 45

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toplam=toplam+arr1[i][j];
            }
        }
        System.out.println("Cift katli arr'in toplami: "+toplam);





    }
}
