package D08_practice4;

public class C23_HArabaRunner {
    public static void main(String[] args) {

        C22_HAraba arb1=new C22_HAraba();
        arb1.marka="Toyota";
        arb1.model="Corolla";
        arb1.yakit="Dizel";
        arb1.yil=2010;
        arb1.fiyat=12000;

        System.out.println(arb1+"\n");

        C22_HAraba arb2=new C22_HAraba("Honda","Civic","Benzin",2011,11000);
        System.out.println(arb2+"\n");

        C22_HAraba arb3=new C22_HAraba("Opel","Corsa","Dizel",2013,10000);
        System.out.println(arb3+"\n");

        C22_HAraba arb4=new C22_HAraba("Tesla","X",2020);
        System.out.println(arb4);


    }
}
