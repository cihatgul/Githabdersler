package D01_practice;

public class C017_Person {

    // instance veriable

    public String name;
    public int birtYear;

    public C017_Person(String ad,int dogumTarihi){
        name=ad;
        birtYear=dogumTarihi;

    }
    public int calculateage(){

        return 2022-birtYear;
    }
}
