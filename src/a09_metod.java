public class a09_metod {
    //Verilen sayının karesini döndüren metodu yazınız
    public static int karesi(int s) {
        return s*s;
    }

    //Verilen sayının iki katını döndüren metodu yazınız
    public static int ikiKat(int sayi) {
        return sayi*2;
    }

    private static double ortalama(int s1, int s2, int s3) {
        double ort=0;
        ort=(s1+s2+s3)/3.0;
        return ort;
    }

    public static void topla(double a, int b) {
        System.out.println("Ben topla metoduyum ");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a+b="+(a+b));
    }
    public static void main(String[] args) {
        int k;
        topla(1.0,5);
        System.out.println(ortalama(4,5,6));
        k = ikiKat(17);
        System.out.println(k);
        System.out.println(karesi(5));
    }
}
