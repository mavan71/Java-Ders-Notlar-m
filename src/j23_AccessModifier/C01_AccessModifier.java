package j23_AccessModifier;
/*
         1) "private" class member'lar sadece icinde bulunduklari class'lardan erişilebilir.
         Diğer class'lardan "private" class memler'lara erişilemez

             2) Diğer package'lerden   olusturulan object için class'i import edilmeli

             3) Diğer package'lerden default class memberlara erişilemez.
              "default"  "package private" sağlar

             4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

              5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
             için : a)Child class erişebilir.  b)Child class degil ise erişilemez.

              6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
              Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.
     */

    public class C01_AccessModifier {
    private int privateYas=33;
    int defaultYas=24;
    protected int protectedYas=48;
    public int publicYas=48;

    private C01_AccessModifier(){
        System.out.println("Ağam'a private p siz cnst. selam");

    }
    public C01_AccessModifier(int privateYas,int defaultYas){
        System.out.println("Ağam'a private p siz cnst. selam");

    }


        private void privateMethod(){
            System.out.println("Ağam'a private Method selamke'");
        }
        protected void protectedMethod(){
            System.out.println();
        }
        C01_AccessModifier obj=new C01_AccessModifier();//private p siz cons call edilerek obje creat edildi
}//class sonu
