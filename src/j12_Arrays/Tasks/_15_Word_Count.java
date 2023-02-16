package j12_Arrays.Tasks;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String buString="Removes white space from both ends of a string";
        String str[]=buString.split(" ");//buString dizisini boşluklara göre bölüp str dizisi yapıldı
        System.out.println(Arrays.toString(str));//str yazdırıldı [Removes, white, space, from, both, ends, of, a, string]
        System.out.println(str.length);//9
    }
}