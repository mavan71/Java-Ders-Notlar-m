package J08_Loops.WhileLoops.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

 /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */


        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int sayi2 = input.nextInt();

        int i = Math.min(sayi1, sayi2);

        while (i <= Math.max(sayi1, sayi2)) {
            System.out.print(i + " ");

            i++;
        }
        System.out.println();
    }

}
