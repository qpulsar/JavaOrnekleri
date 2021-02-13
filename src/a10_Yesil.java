public class a10_Yesil {
    public static void sayiYaz(int basla, int bitir) {
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+" -");
        }
    }

    // 1-10'a kadar sayıları yan yana yazan metod
    public static void birOn() {
        for (int i = 1; i < 11; i++) {
            System.out.print(i+" ");
        }
    }

    // Verilen kelimeyi 3 kez yazan metodu yazın
    public static void kelimeUc(String k) {
        for(int i=0; i<3; i++) {
            System.out.println(k);
        }
    }

    // Adınızı 3 kez yazan metodu yazın
    public static void ucKez() {
        for(int i=0; i<3; i++) {
            System.out.print("Emin"+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ucKez();
        kelimeUc("Altıkod");
        birOn();
        sayiYaz(5,25);
    }
}
