package okulProjesi;

public class Kisi {

    private String isim; // private yapma amacimiz dogrudan ulasilmamasini saglamak

    private String soyisim;
    // burada public yaparsak direk olarak degiskene ulasiriz private ile direk
    // ulasamayiz, get ve set ile yaparsak veri alisverisini saglarim bununla

    private String tcNo;
    private String yas;

    public Kisi() {

        // generate'ye gidiyoruz, buradanda bos bir constructor olusturuyoruz

    }

    public Kisi(String isim, String soyisim, String tcNo, String yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public String getTcNo() { // burada diger claslardan TC numarami aliyorum

        return tcNo;

    }

    public void setTcNo(String tcNo) { // burada diger claslardan TC numarama veri gonderiyorum

        this.tcNo = tcNo;

    }

    public String getIsim() { // private String isim'e ulasmak icin getIsim method'unu kullaniyoruz,
                              // getIsim method'uyla biz private String isim'de ki icinde ki
                              // veriyi aliyoruz direk degiskene ulasamiyoruz

        return isim;

    }

    public void setIsim(String isim) {

        this.isim = isim;

    }

    public String getSoyisim() {

        return soyisim;

    }

    public void setSoyisim(String soyisim) {

        this.soyisim = soyisim;

    }

    public String getYas() {

        return yas;

    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        // burayi eklememizin sebebi ekranda gormek icindir
        // burada ki bolum icin, generate'ye gidiyoruz toString kisminda olusturuyoruz
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas='" + yas + '\'' +
                '}';
    }
}
