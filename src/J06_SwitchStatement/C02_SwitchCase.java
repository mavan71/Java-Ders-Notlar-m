package J06_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
        //Task girilen Ay numarasına göre ayın ismini print eden code creat ediniz.
        Scanner scan =  new Scanner(System.in);

        System.out.println("Dadaş hele Bir Sayi gir");
        int  aySayi =scan.nextInt();
        switch (aySayi) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("MArt");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("Kurban olam Düzgün bir şey gir ");



        }


        System.out.println("Kod Cıncık");



    }





}
