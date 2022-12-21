package D08_practice4;

import java.util.ArrayList;
import java.util.List;

public class C30_PassByvalueList {

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListeOlustur(sayilar);

    }

    public static void yeniListeOlustur(List<Integer> sayilar) {

        List<Integer> yeniList=new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) yeniList.add(sayilar.get(i)+5);

        sayilar=yeniList;

        System.out.println("Method da ki sayilarin yeni hali: "+sayilar);
    }
}
