package j12_Arrays.Tasks;

import java.util.Arrays;

public class _14_String_method_replace1 {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        tersCevirme();




    }

    private static void tersCevirme() {
        String str="Hello world";
        String strArr[]=str.split(" ");
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));


        System.out.println(str.replace("o", "K"));
    }
}