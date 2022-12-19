package D08_practice4;

public class C24_Araba {

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public C24_Araba(String marka, String model, String yakit, int yil, int fiyat){
        this.marka=marka;
        this.model=model;
        this.yakit=yakit;
        this.yil=yil;
        this.fiyat=fiyat;
    }

    public C24_Araba (String mrk,String mdl){
        marka=mrk;
        model=mdl;
    }

    public C24_Araba(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public C24_Araba(){
    }

    public String toString(){
        return "Araba Ozellikleri: "+
                "\nmarka: "+marka+
                "\nmodel: "+model+
                "\nyakit: "+yakit+
                "\nyil: "  +yil+
                "\nfiyat: "+fiyat;

    }
}
