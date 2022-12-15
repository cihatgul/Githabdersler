package D08_practice4;

public class C04_MDA_ElementleriToplama {
    public static void main(String[] args) {

        int[] arr1 ={3,5,7,8}; // 23

        int toplam=0;

        for (int i = 0; i < arr1.length; i++) {
            toplam=toplam+arr1[i];
        }
        System.out.println("Tek katli Arrays'in elementleri toplami: "+toplam); // 23

    }
}
