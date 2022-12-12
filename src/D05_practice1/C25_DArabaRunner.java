package D05_practice1;

public class C25_DArabaRunner {

    public static void main(String[] args) {

        C24_DAraba arb1=new C24_DAraba();

        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);

        arb1.marka="Tofas";
        arb1.model="Kartal";
        arb1.yakit="Benzin";
        arb1.yil=1991;
        arb1.fiyat=50000;

        C24_DAraba arb2=new C24_DAraba();

        System.out.println("Marka : "+arb2.marka+
                            "\nModel : "+arb2.model+
                            "\nYakit : "+arb2.yil+
                            "\nFiyat : "+arb2.fiyat);

        C24_DAraba arb3=new C24_DAraba();

        System.out.println(arb3);
        System.out.println(arb1);

        C24_DAraba arb4=new C24_DAraba();
        System.out.println(arb4);

    }
}
