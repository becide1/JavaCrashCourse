package _01GirisVariablesFor;

public class _02Variables {

    // variable isimlendirmesi, zorunlu degil ( Dünya genelimnde yazilim)
    // package isimleri : kücük harfle yazilir
    // Class isimleri : Büyük harfle baslar, Camelstyle
    // method isimleri : kücük harfle baslar, Camelstyle   -> methodIsmi()
    // degisken isimleri : kücük harfle baslar, Camelstyle  -> variableName;

    String str;
    {
        String str1 = "str2";
        str = "str";
    }
    public static int i = 3;

    // statikler --> statikler
    // nesneler  --> statik ve instance (nesne)

    // main methode, java programinin baslama metodu
    public static void main(String[] args) {
        int b = 2;
        System.out.println("Hello");
        System.out.println(i);
        System.out.println(b);
    }

    public static void yazdir(){
        System.out.println(i);
    }

}
