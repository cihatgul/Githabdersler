package practice1;

public class TC25_ArabaRunner {

    public static void main(String[] args) {

        TC24_Araba arb1=new TC24_Araba();

        arb1.marka="Citroen";
        arb1.model="C3";
        arb1.yakit="Benzin";
        arb1.yil=2020;
        arb1.fiyat=20000;

        System.out.println(arb1);

        TC24_Araba arb2=new TC24_Araba("Volvo","CX60");
        System.out.println("\n"+arb2);

        TC24_Araba arb3=new TC24_Araba("Hyundai","i10",10000);
        System.out.println(arb3);

        TC24_Araba arb4=new TC24_Araba("Porche","cayanne","lpg", 1990, 12000);

    }
}
