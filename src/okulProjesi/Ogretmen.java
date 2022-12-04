package okulProjesi;

public class Ogretmen extends Kisi {

    private String bolum; // private yapma amacimiz dogrudan ulasilmamasini saglamak
    private int sicilNo;
    // burada public yaparsak direk olarak degiskene ulasiriz private ile direk
    // ulasamayiz, get ve set ile yaparsak veri alisverisini saglarim bununla

    public Ogretmen() {

        // generate'ye gidiyoruz, buradanda bos bir constructor olusturuyoruz

    }

    public Ogretmen(String isim, String soyisim, String tcNo, int yas, String bolum, int sicilNo) { // generate'ye gidiyoruz, buradanda constructor olusturuyoruz ustte olusani silebiliriz
        super(isim, soyisim, tcNo, yas); // burada super cikmasinin sebebi kisi class'in da ki verileri cektigi anlamina gelir
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {return bolum;} // generate'ye gidiyoruz, buradanda getter and setter olusturuyoruz

    public void setBolum(String bolum) {this.bolum = bolum;}

    public int getSicil() {return sicilNo;}

    public void setSicil(int sicil) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        // burayi eklememizin sebebi ekranda gormek icindir
        // burada ki bolum icin, generate'ye gidiyoruz toString kisminda olusturuyoruz
        return "Ogretmen{"+
                "bolum= "+bolum+
                ", sicilNo= "+sicilNo;
    }
}
