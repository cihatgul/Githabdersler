package D03manavProjesi;

import java.util.HashMap;
import java.util.Map;

public class Product {

    String name_of_Product;
    int price;

    Product(String name_of_Product, int price){

        this.name_of_Product=name_of_Product;
        this.price=price;

        Map<String, Integer> product_map=new HashMap<>();

        product_map.put(name_of_Product,price);

        System.out.println(product_map);

    }

    public int getPrice() {
        return price;
    }

}
