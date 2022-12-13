package D07_practice3;

public class C18_C16DaKiDosyalariCagirma {
    public static void main(String[] args) {

        C16_HastaneMethodu pers1=new C16_HastaneMethodu();
        System.out.println(pers1.persIsmi); // Isim girilmedi
        System.out.println(pers1.persYasi); // 0

        pers1.persIsmi="Suleyman";
        pers1.persYasi=35;
        pers1.persTelefonu="555 345 67 54";

        System.out.println(pers1.persIsmi); // Suleyman
        System.out.println(pers1.persYasi); // 35

        C16_HastaneMethodu pers2=new C16_HastaneMethodu();
        pers2.persIsmi="Latife";
        pers2.persYasi=32;
        pers2.persTelefonu="555 432 23 21";

        System.out.println(pers1.persIsmi); // Suleyman
        System.out.println(pers2.persIsmi); // Latife

        C16_HastaneMethodu pers3=new C16_HastaneMethodu();
        pers3.persIsmi="Huseyin";
        pers3.persYasi=30;
        pers3.persTelefonu="312 213 45 67";

        System.out.println(pers1.persYasi); // 35
        System.out.println(pers2.persYasi); // 32
        System.out.println(pers3.persYasi); // 30



    }
}
