package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /* Task->
           girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Yıl Gir");
        int yil= scan.nextInt();

        if(yil%4==0 && (yil %100!=0 || yil%400==0)) {
            System.out.println("Yil Artık yıldır");
        }
        else System.out.println("Artık yıl Değildir");
        System.out.println("*************Ternary****************");
        System.out.println(yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0) ? "Yil Artık yıldır" : "Artık yıl Değildir");



    }
}
