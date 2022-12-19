package D08_practice4;

public class C25_ArabaRunner {
    public static void main(String[] args) {

        C24_Araba arb1=new C24_Araba();

        arb1.marka="Citroen";
        arb1.model="C3";
        arb1.yakit="Benzin";
        arb1.yil=2020;
        arb1.fiyat=20000;

        System.out.println("\n"+"Burasi arb1 oluyor "+arb1+"\n");

        C24_Araba arb2=new C24_Araba("Volvo","CX60");
        System.out.println("Burasi arb2 oluyor "+arb2+"\n");

        C24_Araba arb3=new C24_Araba("Hyundai","I10",10000);
        System.out.println("Burasi arb3 oluyor "+arb3+"\n");

        C24_Araba arb4=new C24_Araba("Porche","Cayanne","lpg",1990,12000);
        System.out.println("Burasi arb4 oluyor "+arb4+"\n");



    }
}
