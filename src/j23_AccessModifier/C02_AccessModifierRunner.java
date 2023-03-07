package j23_AccessModifier;

public class C02_AccessModifierRunner {
    public static void main(String[] args) {
       // C01_AccessModifier obj=new C01_AccessModifier();//private cons farklı class dan call edilemez
        C01_AccessModifier obj1=new C01_AccessModifier(45,34);
        C02_AccessModifierRunner obj2=new C02_AccessModifierRunner();
        System.out.println("obj1.defaultYas = " + obj1.defaultYas);
        System.out.println("obj1.protectedYas = " + obj1.protectedYas);
        System.out.println("obj1.publicYas = " + obj1.publicYas);
        //obj1.privateYas;//private class dışında çalşmaz
        //obj1.privateMethod();//private class dışında çalşmaz
        //C01_AccessModifier.privateMethod();//private Method class dışında çalşmaz




    }
}
