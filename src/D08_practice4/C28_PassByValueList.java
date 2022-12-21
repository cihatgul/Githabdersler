package D08_practice4;

import java.util.ArrayList;
import java.util.List;

public class C28_PassByValueList {

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elementlerBesArtiralim(sayilar);
    }

    public static void elementlerBesArtiralim(List<Integer> sayilar) {

        for (int i = 0; i < sayilar.size(); i++) sayilar.set(i, sayilar.get(i)+5);
        System.out.println(sayilar);
    }
}
