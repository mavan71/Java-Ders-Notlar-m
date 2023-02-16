package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        // code start here

        int sayiArr[]={1, 2, 3, 4};
        boolean flag;
        for (int i = 0; i <sayiArr.length; i++) {
            if (sayiArr[i]==1) {
            if (1==sayiArr[i]) {
                if (4==sayiArr[i]){
                    flag=false;
                    break;
                }

            }


            }
        }


    }
}