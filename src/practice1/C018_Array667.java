package practice1;

public class C018_Array667 {
    public static void main(String[] args) {

        int[] arr={6,7,2,6,6,8,6,7};

        System.out.println(array667(arr));

    }

    private static int array667(int[] arr) {

        int count=0;

        for (int i = 0; i < arr.length; i++) {

            if ((i+1)<arr.length){
                if (arr[i]==6&&arr[i+1]==6) count++;
                if (arr[i]==6&&arr[i+1]==7) count++;

            }
        }
        return count;

    }
}
