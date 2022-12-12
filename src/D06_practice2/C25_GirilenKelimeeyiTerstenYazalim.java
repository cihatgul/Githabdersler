package D06_practice2;

import java.util.Scanner;

public class C25_GirilenKelimeeyiTerstenYazalim {

    public static void main(String[] args) {

        String input="Java ne kadar guzel";

        for (int i =input.length()-1; i >=0; i--) {

            System.out.print(input.charAt(i));

        }
    }
}
