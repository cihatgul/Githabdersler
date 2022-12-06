package D01_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class C019_ZarSorusu {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        map.put(4, 0);
        map.put(5, 0);
        map.put(6, 0);
        int age = 1 + 5;
        String name = "sait";
        name = name + "g";
        boolean isAdult = age >= 18;
        for (int i = 0; i < 5; i++)
            numList.add(generateRandomNumber());

        System.out.println("numList = " + numList);

        for (int item : numList) {
            if (item == 1) {
                map.put(1, map.get(1) + 1);
            }
            if (item == 2) {
                map.put(2, map.get(2) + 1);
            }
            if (item == 3) {
                map.put(3, map.get(3) + 1);
            }
            if (item == 4) {
                map.put(4, map.get(4) + 1);
            }
            if (item == 5) {
                map.put(5, map.get(5) + 1);
            }
            if (item == 6) {
                map.put(6, map.get(6) + 1);
            }
        }

        System.out.println("map = " + map);
        int result = 0;

        result = getResult(map, result);

        System.out.println("result = " + result);
    }
    private static int getResult(Map<Integer, Integer> map, int result) {
        if (map.get(1) == 3) {
            result += 1000;
        }
        if (map.get(6) == 3) {
            result += 600;
        }
        if (map.get(5) == 3) {
            result += 500;
        }
        if (map.get(4) == 3) {
            result += 400;
        }
        if (map.get(3) == 3) {
            result += 300;
        }
        if (map.get(2) == 3) {
            result += 200;
        }
        if (map.get(1) == 1) {
            result += 100;
        }
        if (map.get(5) == 1) {
            result += 50;
        }
        return result;
    }
    private static int generateRandomNumber() {
        return (int) (Math.random() * 6 + 1);
    }
}