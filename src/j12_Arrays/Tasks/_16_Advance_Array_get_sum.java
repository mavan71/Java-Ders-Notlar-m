package j12_Arrays.Tasks;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.
        String para="$12 $23 $10 $2 $5 $2";
        String para1=para.replace("$", "");
        String paraArr[]=para1.split(" ");
        System.out.println(Arrays.toString(paraArr));



     // //
     //
     // int paraArr1[]=Integer.parseInt(paraArr[]);
     // int toplam=0;
     // for (int i = 0; i < paraArr.length; i++) {
     //     toplam+=paraArr[i];

     // }


    }
}