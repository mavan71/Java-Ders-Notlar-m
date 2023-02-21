package Deneme111;

import java.util.Scanner;

public class DenemeWhileLoop2 {
    public static void main(String[] args) {
        //girilen bir sayıya kadar sayıları toplayıp print eden code giriniz
        Scanner input=new Scanner (System.in);
     //   System.out.println("Ağam bir sayi gir");
     //   int sayi=input.nextInt();
//
     //   int toplam=0;
     //   while(sayi>=0) {
     //   toplam+=sayi;
     //   sayi--;
//
        //}
     //   System.out.println(toplam);
        // task07->girilen tamsayının faktöriyelini  print eden code create ediniz

  //  System.out.println("Ağam bir sayi gir");
  //  int sayi1=input.nextInt();
  //  int faktoriyel=1;
  //  while(sayi1>0){
  //      faktoriyel*=sayi1;
  //      sayi1--;
  //  }
  //  System.out.println(faktoriyel);
        //task-> girilen tamsayının rakamları toplamını print eden code create ediniz..
    //    System.out.println("Ağam bir sayi gir");
  //     int sayi2=input.nextInt();
  //     int toplam1=0;

  //     while (sayi2>0){
  //         toplam1+=sayi2%10;
  //         sayi2=sayi2/10;
  //     }
  //     System.out.println(toplam1);


        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
    //  System.out.println("Ağam bir sayi gir");
    //  int sayi3=input.nextInt();
    //  int tamBolenSyaisi=1;
    //  int tamBolenAdedi=0;
    //  while(tamBolenSyaisi<=sayi3){

    //      if(sayi3%tamBolenSyaisi==0){
    //          tamBolenAdedi++;
    //      }

    //      tamBolenSyaisi++;
    //  }
    //  System.out.println("Ağam girdiğin Sayinin "+tamBolenAdedi+" boleni var");

//task-> 3 basamaklı 4 ile tam bölünen sayıları print eden code create ediniz
   //int i=100;

   //       while (i<1000) {
   //       if(i%4==0){
   //           System.out.print(i+" ");

   //       }
   //           i++;
   //       }
// task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz.


     //  int toplam2=0;
     //  int sayac=0;
     //  while(toplam2<333){
     //      System.out.println("Ağam bir sayi gir");
     //      int sayi4= input.nextInt();
     //      toplam2+=sayi4;
     //      sayac++;
     //  }
     //  System.out.println("Ağam Yeter Gari "+sayac+"sayi girdin bu sayıların toplamı "+toplam2 +" dir");

      // Task-> girilen 7 sayının en buyugunu print eden code create ediniz

      int sayiAdedi=0;
      int enBuyukSayi=0;
      while (sayiAdedi<7){
          System.out.println("Ağam bir sayi gir");
          int sayi4= input.nextInt();
          sayiAdedi++;
          if (enBuyukSayi<sayi4){
              enBuyukSayi=sayi4;
          }
      }
      System.out.println("ağam girdiğin sayiların en büyüğü "+enBuyukSayi+" dır");

        int bykSayi = 0;


        int sayac = 1;

        while (sayac<= 7) {

            System.out.print(sayac + ". sayi giriniz : ");

             int girilenSayi = input.nextInt();
            bykSayi = (bykSayi > girilenSayi ? bykSayi : girilenSayi);

            //bykSayi = Math.max(input.nextInt(), bykSayi);//hangi sayı maximumise o sayıbykSayi olarak atanır

            sayac++;
        }
        System.out.println("bykSayi = " + bykSayi);

    }
    }
