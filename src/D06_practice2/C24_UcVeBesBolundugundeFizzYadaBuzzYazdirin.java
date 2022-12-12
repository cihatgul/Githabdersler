package D06_practice2;

import java.util.Scanner;

public class C24_UcVeBesBolundugundeFizzYadaBuzzYazdirin {

    /*
    (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin, sira
    - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
    - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
    - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");
        int sayi= scan.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (i%3==0) {
                System.out.println("fizz \n");
            }
            else if (i%5==0) {
                System.out.println("buzz \n");
            }
            else if (i%15==0) {
                System.out.print("fizzBuzz \n");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
