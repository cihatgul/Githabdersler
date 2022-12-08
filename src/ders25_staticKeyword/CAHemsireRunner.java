package ders25_staticKeyword;

public class CAHemsireRunner {

    public static void main(String[] args) {

        CAHemsire h1=new CAHemsire();
        h1.personelIsmi="Ayse";
        h1.personelAdresi="Cankaya";
        h1.personelTelefonu="03123242939";
        System.out.println(h1);

        CAHemsire h2=new CAHemsire();
        System.out.println("\n"+h2);

        h2.personelIsmi="Hatice";
        h2.personelAdresi="Sincan";
        h2.personelTelefonu="3123459807";
        h2.bashekimIsmi="Yasar Kemal";  // burada static oldugu icin yaptigimiz bir degisiklik h1 ve h2 dede degisir sonucta statigiz

        System.out.println("\nh1: "+h1);
        System.out.println("\nh2: "+h2);




    }
}
