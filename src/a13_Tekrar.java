import java.util.Scanner;

public class a13_Tekrar {
    public static void yanyana(int limit) {
        for(int i=0; i<=limit; i++){
            System.out.print(i);
            if(i!=limit) {
                System.out.print("-");
            }
        }
    }
    public static void altalta(int basla, int bitis) {
        for(int j=basla; j<=bitis; j++) {
            System.out.println(j);
        }
    }
    public static void gerigeri(int basla, int bitis) {
        for(int j=basla; j>=bitis; j--) {
            System.out.println(j);
        }
    }
    public static void sagdansola(int bas, int bit) {
        for(int k=bas; k>=bit; k--) {
            System.out.print(k);
            if(k!=bit) {
                System.out.print("-");
            }
        }
    }
    public static boolean ciftmi(int sayi) {
        if(sayi%2==0)
            return true;
        else
            return false;
    }
    public static void fibo(int eleman) {
        //          n1 n2 n3
        // 0, 1, 1, 2, 3, 5
        //             n1 n2
        int n1 = 0;
        int n2 = 1;
        int n3;
        for(int i=2;i<eleman; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
    public static void star(int sayi) {
        for(int i=0; i<sayi; i++)
            System.out.print("*");
    }
    public static void ad3() {
        String isim;
        Scanner scanner = new Scanner(System.in);
        isim = scanner.nextLine();
        for(int i=0;i<3;i++)
            System.out.print(isim+" ");
    }

    public static void carpim() {
        //	1*1=1   1*2=2 ....1*10=10
        //  2*1=2   2*2=4
        //..
        //  10*1=10 ..........10*10=100
    }

    public static void swap() {
        int a=5;
        int b=8;
        int c;
        c = a; // c=5
        a = b; // a=8
        b = c; // b=5
    }


    public static void main(String[] args) {
        ad3();
        star(10);
        fibo(10);
        yanyana(100);
        System.out.println("\n");
        altalta(10,20);
        System.out.println("\n");
        gerigeri(20,10);
        sagdansola(40,20);
        if(ciftmi(20)==true) {
            System.out.println("çift");
        }
        else {
            System.out.println("tek");
        }
        System.out.println(ciftmi(22));

    }
}
