public class a07_Kira {
    public static double kira(double k) {
        double aidat = 15.0;
        double toplam = k + k * aidat / 100;
        double bir_kisi = toplam / 5;
        return bir_kisi;
    }

    public static void main(String[] args) {
        System.out.println("Taşdelen :"+kira(276.0));
        System.out.println("Çekmeköy :"+kira(322.0));
        System.out.println("Üsküdar :"+kira(391.0));
        System.out.println("Kadıköy :"+kira(483.0));
    }
}
