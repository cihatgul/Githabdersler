package D08_practice4;

import java.util.ArrayList;
import java.util.List;

public class C13_remove {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }

        sayilar.remove(2);
        System.out.println(sayilar);

        sayilar.add(5);
        System.out.println(sayilar);

    }
}
