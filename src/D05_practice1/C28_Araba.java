package D05_practice1;

public class C28_Araba {

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public C28_Araba(String marka, String model, int yil){

        this.marka=marka;
        this.model=model;
        this.model=yakit;
        this.yil=yil;
        this.fiyat=fiyat;

    }

    public C28_Araba(String mrk, String mdl){

        marka=mrk;
        model=mdl;

    }
    public C28_Araba(String marka, String model, String fiyat){

    }

    public C28_Araba() {

    }

    public C28_Araba(String porche, String cayanne, String lpg, int i, int i1) {

    }

    public String toString(){
        return "Araba Ozellikleri "+
                "\nmarka : "+marka+
                "\nmodel : "+model+
                "\nyakit : "+yakit+
                "\nyil   : "+yil+
                "\nfiyat : "+fiyat;
    }
}
