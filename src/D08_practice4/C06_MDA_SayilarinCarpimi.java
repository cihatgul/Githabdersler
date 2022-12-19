package D08_practice4;

public class C06_MDA_SayilarinCarpimi {
    public static void main(String[] args) {

        // Verilen 2 katli bir array’de bulunan
        // tum sayilarin carpinini bize donduren bir method olusturun.

        int[][] arr={{5,7}, {5, 8, 9},{0,1}};

        elementlerinCarpimi(arr);

        System.out.println("Arrays'in carpimi: "+elementlerinCarpimi(arr));

    }
    public static int elementlerinCarpimi(int[][] arr) {

        int carpim=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim=carpim*arr[i][j];
            }
        }
        return carpim;
    }
}
