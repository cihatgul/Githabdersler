package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_Test {
    public static void main(String[] args) {

        // Verilen String bir array’deki her bir elementi kontrol edip,
        // Kelimenin uzunlugu cift sayi ise ilk yarisini
        // Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        // yeni bir listeye ekleyip yazdirin.

        String[] arr= {"Sumeyra","Mehmet","Ekrem","Yilmaz","Ayse"};

        List<String> yeniListe=new ArrayList<>();

        for (String each:arr) {

            if (each.length()%2==0){ // uzunlugu cift
                each.substring(0,each.length()/2);
                yeniListe.add(each.substring(0,each.length()/2));


            }else { // uzunluk tek
                yeniListe.add(each.substring((each.length()-1)/2));

            }
        }
        System.out.println(yeniListe);
    }
}
