package j12_Arrays.Tasks;

import java.util.Arrays;

public class _20_Arrayboth_Ends1 {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..

        int sayiArr[]={1,2,3,4};
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        int yeniArr[]={sayiArr[0],sayiArr[sayiArr.length-1]};
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));
    }
}