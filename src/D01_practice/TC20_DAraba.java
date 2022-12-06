package D01_practice;

public class TC20_DAraba {

    String marka="Marka belirtilmedi";
    String model="Marka belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

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
