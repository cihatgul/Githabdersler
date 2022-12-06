package D03manavProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {

    public static List<Product> product_maping(){

        List<Product> products=new ArrayList<>();

        products.add(new Product("patates",10));
        products.add(new Product("domates",12));
        products.add(new Product("sogan",13));

        return products;

    }

    public static void main(String[] args) {

        product_maping();

        boolean value=true;
        double total=0;

        while (value){

            System.out.println("ne almak istersiniz: ");
            Scanner scan=new Scanner(System.in);
            String selection= scan.next();

            System.out.println("kac kilogram almak: "+selection+" istersiniz ? ");

            double kilo= scan.nextDouble();

            double sum=toplamMaliyet(selection,kilo);

            System.out.println("baska birsey almak istermisiniz evet yada hayir ? ");
            String cevap= scan.next();

            if (cevap.equals("hayir")){

                total=total+sum;

                value=false;

            } else if (cevap.equals("evet")) {

                total=total+sum;
                
            }else {

                System.out.println("girilen ifade anlasilmadi ? ");

            }

            System.out.println("toplam fiyat: "+total);
        }
    }


    public static double toplamMaliyet(String selection, double kilo) {

        List<Product> product_list=product_maping();

        double sum=0;

        switch (selection){

            case "patates":
                sum=(kilo*product_list.get(0).getPrice())+sum;
                break;

            case "domates":
                sum=(kilo*product_list.get(1).getPrice())+sum;
                break;

            case "sogan":
                sum=(kilo*product_list.get(2).getPrice())+sum;

            default:
                System.out.println("girilen urun yok: ");

        }
        return sum;

    }
}
