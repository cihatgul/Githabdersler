package D01_practice1;

public class C15_Test {
    public static void main(String[] args) {

        String std1="Berkan";
        int birhYear=1980;
        int age1=calculateage(birhYear);
        System.out.println("Berkan "+age1);

        String std2="Emrah";
        int birhYear2=1986;
        int age2=calculateage(birhYear2);
        System.out.println("Emrah "+age2);

        // saga tiklayip Refactor'den Extract method'a gelirsek bu secili olanlarin hepsini methoda atar

        String std3="Semih";
        int birhYear3=1985;
        int age3=calculateage(birhYear3);
        System.out.println("Semih "+age3);

    }

    public static int calculateage(int birtYear){

        return 2022-birtYear;
    }
    public static void print(){
        System.out.println("hello");
    }
    public static void print2(){
        print();
    }
}
