package D08_practice4;

public class C27_PassByValue {

    public static void main(String[] args) {

        double fiyat=100;

        System.out.println("\nIndirim uygulanmadan onceki fiyat: "+fiyat+"indirim uygulandigi fiyat: "+indirimYap(fiyat)); // 90

        fiyat=indirimYap(fiyat);

    }

    public static double indirimYap(double fiyat) {
        // %10 indirim yapsin

        fiyat=fiyat*0.9;

        return fiyat;
    }
}
