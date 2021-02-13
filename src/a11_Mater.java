import java.util.Scanner;

public class a11_Mater {
    //while ile 1-10'a kadar sayıları yazdırın
    public static void say(int sayi) {
        int sayac = 0;
        while(sayac<sayi) {
            sayac++;
            System.out.println(sayac);
        }
    }

    //Verilen sayının faktöriyelini bulan fonksiyon
    // 5! = 5*4*3*2*1 = 120
    // while loop
    public static int faktor(int sayi) {
        int f=1;
        int i=2;
        while(i<=sayi) {
            f *= i;
            i++;
        }
        return f;
    }


    //Verilen sayının faktöriyelini bulan fonksiyon
    // 5! = 5*4*3*2*1 = 120
    public static int faktoriyel(int sayi) {
        int f = 1;
        for(int i=2; i<=sayi; i++) {
            f = f*i;
        }
        return f;
    }

    public static int topla(int sayi1, int sayi2) {
        int toplam;
        toplam = sayi1 + sayi2;
        return toplam;
    }

    public static void klavyeden() {
        int sayi;
        System.out.println("Bir sayi giriniz:");
        Scanner tarayici = new Scanner(System.in);
        sayi = tarayici.nextInt();
        tarayici.close();
        System.out.println("Girilen sayı = "+sayi);

    }
    //klavyeden girilen iki sayının toplamını bulup yazan fonksiyon
    public static void toplayan() {
        int a;
        int b;
        Scanner s = new Scanner(System.in);
        System.out.print("Birinci sayi:");
        a = s.nextInt();
        System.out.print("İkinci sayi:");
        b = s.nextInt();
        System.out.println("Toplamları = "+(a+b));
    }

    public static void main(String[] args) {
        toplayan();
        System.out.println(topla(3,5));
        System.out.println("5!="+faktoriyel(5));
        System.out.println("5!="+faktor(5));
        say(20);
        klavyeden();
    }

}
