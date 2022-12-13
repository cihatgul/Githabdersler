package D07_practice3;

public class C17_BaskaBirClastakiDosyalariCekme {
    // C16_HastaneMethodu deki verileri cekelim

    public static void main(String[] args) {

        System.out.println(C16_HastaneMethodu.hastaneIsmi); // Yildiz hastanesi

        System.out.println(C16_HastaneMethodu.hastaSayisi); // 23453

        C16_HastaneMethodu.hastaSayisi++;
        System.out.println(C16_HastaneMethodu.hastaSayisi); // 23454
        C16_HastaneMethodu.hastaSayisi++;
        System.out.println(C16_HastaneMethodu.hastaSayisi); // 23455

        C17dekiMethod();



    }

    private static void C17dekiMethod() {
        C16_HastaneMethodu.hastaSayisi++;

    }
}
