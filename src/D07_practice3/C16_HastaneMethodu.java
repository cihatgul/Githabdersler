package D07_practice3;

public class C16_HastaneMethodu {

    static String hastaneIsmi="Yildiz hastanesi";
    static int hastaSayisi=23453;
    static String basHekimIsmi;
    String persIsmi="Isim girilmedi";
    String persTelefonu="Telefon girilmedi";
    int persYasi;

    public void main(String[] args) {

        System.out.println(hastaneIsmi);
        System.out.println(basHekimIsmi);

        Method1();
        Method2();

    }

    private static void Method1() {
        System.out.println(hastaSayisi);
        hastaSayisi++;
    }

    private void Method2() {
        System.out.println(hastaneIsmi); // yildiz hastanesi
        hastaSayisi++;
        System.out.println(persIsmi); // Isim girilmedi
        System.out.println(persYasi); // 0

    }
}
