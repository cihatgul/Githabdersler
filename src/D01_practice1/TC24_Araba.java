package D01_practice1;

public class TC24_Araba {

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public TC24_Araba(String marka, String model, int yil){

        this.marka=marka;
        this.model=model;
        this.model=yakit;
        this.yil=yil;
        this.fiyat=fiyat;

    }

    public TC24_Araba(String mrk,String mdl){

        marka=mrk;
        model=mdl;

    }
    public TC24_Araba(String marka, String model,String fiyat){

    }

    public TC24_Araba() {

    }

    public TC24_Araba(String porche, String cayanne, String lpg, int i, int i1) {

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
