package D05_practice1;

public class C27_HArabaRunner {

    public static void main(String[] args) {

        C26_HAraba arb1=new C26_HAraba();
        arb1.marka="Toyota";
        arb1.marka="Corolla";
        arb1.yakit="Dizel";
        arb1.yil=2010;
        arb1.fiyat=12000;

        System.out.println(arb1);

        C26_HAraba arb2=new C26_HAraba("Honda","Civic","Benzin",2011,11000);
        System.out.println("\n"+arb2);

        C26_HAraba arb3=new C26_HAraba("Opel","Corsa","Dizel",2013,10000);
        System.out.println("\n"+arb3);

        C26_HAraba arb4=new C26_HAraba("Tesla","x",2022);


    }
}
