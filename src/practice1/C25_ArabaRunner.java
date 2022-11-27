package practice1;

public class C25_ArabaRunner {

    public static void main(String[] args) {

        C24_Araba arb1=new C24_Araba();

        arb1.marka="Citroen";
        arb1.model="C3";
        arb1.yakit="Benzin";
        arb1.yil=2020;
        arb1.fiyat=20000;
        System.out.println(arb1);

        C24_Araba arb2=new C24_Araba("Volvo","CX60");
        System.out.println("\n"+arb2);

        C24_Araba arb3=new C24_Araba("Hyundai","I10",10000);
        System.out.println("\n"+arb3);

        C24_Araba arb4=new C24_Araba("Porche","Cayanne","LPG",1990,12000);
        System.out.println("\n"+arb4);

    }
}
