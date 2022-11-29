package practice1;

public class TC23_HArabaRunner {

    public static void main(String[] args) {

        TC22_HAraba arb1=new TC22_HAraba();
        arb1.marka="Toyota";
        arb1.marka="Corolla";
        arb1.yakit="Dizel";
        arb1.yil=2010;
        arb1.fiyat=12000;

        System.out.println(arb1);

        TC22_HAraba arb2=new TC22_HAraba("Honda","Civic","Benzin",2011,11000);
        System.out.println("\n"+arb2);

        TC22_HAraba arb3=new TC22_HAraba("Opel","Corsa","Dizel",2013,10000);
        System.out.println("\n"+arb3);

        TC22_HAraba arb4=new TC22_HAraba("Tesla","x",2022);


    }
}
