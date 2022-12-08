package ders25_staticKeyword;

public class CAHemsire {

    static String hastaneIsmi="Yildiz Hastanesi"; // static olmasi bu herkes icin ortak ve degistirince hepsi icin degisecegi anlamina gelir
    static String hastaneAdresi="Cankaya/Ankara";
    static String bashekimIsmi="Dr Mehmet Yilmaz";

    String personelIsmi="Isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
    String personelTelefonu="Telefon belirtilmedi";

    @Override
    public String toString() {
        return "CAHemsire"+
                "\npersonelIsmi= "    +personelIsmi+
                "\npersonelAdresi= "  +personelAdresi+
                "\npersonelTelefonu= "+personelTelefonu+
                "\nhastaneIsmi= "     +hastaneIsmi+
                "\nhastaneAdresi= "   +hastaneAdresi+
                "\nbashekimIsmi= "    +bashekimIsmi;
    }
}
