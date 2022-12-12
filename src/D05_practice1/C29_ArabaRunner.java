package D05_practice1;

public class C29_ArabaRunner {

    public static void main(String[] args) {

        C28_Araba arb1=new C28_Araba();

        arb1.marka="Citroen";
        arb1.model="C3";
        arb1.yakit="Benzin";
        arb1.yil=2020;
        arb1.fiyat=20000;

        System.out.println(arb1);

        C28_Araba arb2=new C28_Araba("Volvo","CX60");
        System.out.println("\n"+arb2);

        C28_Araba arb3=new C28_Araba("Hyundai","i10",10000);
        System.out.println(arb3);

        C28_Araba arb4=new C28_Araba("Porche","cayanne","lpg", 1990, 12000);

    }
}
