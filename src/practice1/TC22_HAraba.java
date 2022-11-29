package practice1;

public class TC22_HAraba {

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public TC22_HAraba(String mrk, String mdl, String ykt, int yl, int fyt){

        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;

    }
    public TC22_HAraba(String mrk,String mdl,int yl){
        marka=mrk;
        model=mdl;
        yil=yl;

    }

    public TC22_HAraba() {

    }


    public String toString(){

        return "Araba Ozellikleri "+
                "\nmarka : "+marka+
                "\nmodel : "+model+
                "\nyakit : "+yakit+
                "\nyil   : "+yil+
                "\nfiyat : "+fiyat;

    }

    public int maxHiz(String yakit){
        int maxHiz=120;

        if (yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;

        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;

        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;

        }

        return maxHiz;
    }
}
