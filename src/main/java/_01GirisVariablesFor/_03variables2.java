package _01GirisVariablesFor;

public class _03variables2 {

    public static void main(String[] args) {
        /*
            primitive variables : byte, short, char, integer, long, float, double, boolean
                                 {String}
            non primitive variables : String, Arrays, Class

            Java pure Object Oriented bir dil degildir, primitive variables dan dolayi

            Java primitive vars --> variable havuzunda
            int, Integer
            ArrayList<Integer> list = new ArrayList<>();
         */

        int a = 5;
        String str = "Hello";   // immutable, mutable   // RAM de Hello --> yer acilir  --> id : X01C

        str = str + " World";                            // RAM de yeni bir Hello World yer acilir id : X03D


        System.out.println(str);
        System.out.println(str.substring(2,5));
        System.out.println(str.toUpperCase());
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);
    }

}
