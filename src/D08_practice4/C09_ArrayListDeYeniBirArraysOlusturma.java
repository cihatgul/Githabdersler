package D08_practice4;

import D07_practice3.C24_KullaniciyaArrayOlusturma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_ArrayListDeYeniBirArraysOlusturma {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        C24_KullaniciyaArrayOlusturma abc=new C24_KullaniciyaArrayOlusturma();

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(4);
        sayilar.add(5);

        System.out.println(sayilar);

    }
}
