package D08_practice4;

public class C05_MDA_EnUzunKelime {
    public static void main(String[] args) {

        // Verilen multi dimensional String bir array'deki
        // en uzun String'i bulan kod yaziniz

        String [][] arr= {{"Ilker","Nesrin"} ,{"Hasan","Heysem","Adem","Yusuf Enes"}};

        String enUzunKelimeNedir=arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].length()>enUzunKelimeNedir.length()) enUzunKelimeNedir=arr[i][j];
            }
        }
        System.out.println("En uzun kelime: "+enUzunKelimeNedir);
    }
}
