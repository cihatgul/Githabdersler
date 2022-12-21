package D09_practice5;

import java.util.Arrays;

public class C01_PassByValueArray {

    public static void main(String[] args) {

        int[] sayilar={3,4,5,6};

        arrayaYeniDegerVerelim(sayilar);
        System.out.println("Bu nedir boyle farki nedir "+Arrays.toString(sayilar));
    }

    public static void arrayaYeniDegerVerelim(int[] sayilar) {

        int[] yeniArray=new int[sayilar.length+2];

        for (int i = 0; i < yeniArray.length; i++) yeniArray[i]=5;

        sayilar=yeniArray;

        System.out.println("Method'da sayilar'in son hali: "+ Arrays.toString(sayilar));

    }
}
