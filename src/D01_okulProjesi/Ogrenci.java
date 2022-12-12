package D01_okulProjesi;

public class Ogrenci extends Kisi {

    private String sinif; // private yapma amacimiz dogrudan ulasilmamasini saglamak
    private int ogrNo;
    // burada public yaparsak direk olarak degiskene ulasiriz private ile direk
    // ulasamayiz, get ve set ile yaparsak veri alisverisini saglarim bununla

    public Ogrenci() {}

    // generate'ye gidiyoruz, buradanda bos bir constructor olusturuyoruz

    public Ogrenci(String isim, String soyisim, String tcNo, int yas, String sinif, int ogrNo) { // generate'ye gidiyoruz, buradanda constructor olusturuyoruz
        super(isim, soyisim, tcNo, yas);
        this.sinif = sinif;
        this.ogrNo = ogrNo;
    }

    public String getSinif() {return sinif;} // generate'ye gidiyoruz, buradanda getter and setter olusturuyoruz

    public void setSinif(String sinif) {this.sinif = sinif;}

    public int getOgrNo() {return ogrNo;}

    public void setOgrNo(int ogrNo) {this.ogrNo = ogrNo;}

    @Override
    public String toString() {
        // burayi eklememizin sebebi ekranda gormek icindir
        // burada ki bolum icin, generate'ye gidiyoruz toString kisminda olusturuyoruz
        return super.toString() +
                " sinif= "+sinif+
                ", ogrNo= "+ogrNo;

    }
}

