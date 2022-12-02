package okulProjesi;

public class Ogretmen extends Kisi {

    private String bolum; // private yapma amacimiz dogrudan ulasilmamasini saglamak
    private int sicil;
    // burada public yaparsak direk olarak degiskene ulasiriz private ile direk
    // ulasamayiz, get ve set ile yaparsak veri alisverisini saglarim bununla

    public Ogretmen() {

        // generate'ye gidiyoruz, buradanda bos bir constructor olusturuyoruz

    }


    public Ogretmen(String isim, String soyisim, String tcNo, String yas, String bolum, int sicil) { // generate'ye gidiyoruz, buradanda constructor olusturuyoruz ustte olusani silebiliriz
        super(isim, soyisim, tcNo, yas); // burada super cikmasinin sebebi kisi class'in da ki verileri cektigi anlamina gelir
        this.bolum = bolum;
        this.sicil = sicil;
    }


    public String getBolum() { // generate'ye gidiyoruz, buradanda getter and setter olusturuyoruz

        return bolum;

    }

    public void setBolum(String bolum) {

        this.bolum = bolum;

    }

    public int getSicil() {

        return sicil;

    }

    public void setSicil(int sicil) {

        this.sicil = sicil;

    }

    @Override
    public String toString() {
        // burayi eklememizin sebebi ekranda gormek icindir
        // burada ki bolum icin, generate'ye gidiyoruz toString kisminda olusturuyoruz
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicil=" + sicil +
                '}';
    }
}
