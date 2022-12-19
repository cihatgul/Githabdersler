package D08_practice4;

public class C22_HAraba {
    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public C22_HAraba(String mrk,String mdl,String ykt,int yl,int fyt) {

        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;

    }
    public C22_HAraba(String mrk,String mdl,int yl) {

        // istersek parametreleri azaltarak da constructor olusturabiliriz

        marka=mrk;
        model=mdl;
        yil=yl;
    }
    public C22_HAraba(){

        // gorunur durumdaki parametresiz constructor
        // default constructor DEGILDIR
        // Default constructor'in body'si de bos olur
        // ancak parametresiz constructor'da body'e kod yazilabilir

        // parametresiz constructor'in body'sinde kod yoksa
        // default constructor ile ayni islevi gorur
        // ama yine de gorunur durumdaysa default cons. denmez

    }

    // biz gozle gorunur herhangi bir constructor olusturdugumuzda
    // Java default constructor'i siler
    // Bu durumda daha once olusturulmus olan objelerin sorun olmamasi icin
    // class'a parametresiz bir constructor eklememiz faydali olur

    public String toString(){

        return "Araba Ozellikleri "+
                "\nmarka: "+marka+
                "\nmodel: "+model+
                "\nyakit: "+yakit+
                "\nyil: "  +yil+
                "\nfiyat:" +fiyat;
    }
    public int maxHiz(String yakit){
        int maxHiz=120;

        if(yakit.equalsIgnoreCase("dizel"))  maxHiz=200;
        else if (yakit.equalsIgnoreCase("benzin")) maxHiz=230;
        else if (yakit.equalsIgnoreCase("elektrikli")) maxHiz=180;

        return maxHiz;

    }
}
