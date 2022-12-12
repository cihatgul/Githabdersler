package D07_practice3;

public class C04_IsimSoyisimBasHarfleriniBuyutelim {
    public static void main(String[] args) {

        String isim="OMER";
        String soyisim= "kesen";

        System.out.println(isimSoyisim(isim,soyisim));
        isimSoyisim(isim,soyisim);

    }

    private static String isimSoyisim(String isim, String soyisim) {

        String yeniIsimSoyisim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "+soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        return yeniIsimSoyisim;
    }
}
