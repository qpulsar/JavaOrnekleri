public class a04_Antreman {
    public static void AdimiYaz() {
        System.out.println("Emin Korkusuz");
    }

    public static void OkulumuYaz() {
        System.out.println("Necatibey Eğitim Fakültesi");
    }

    public static void main(String[] args) {
        System.out.println("Buradan alta\n gec");
        System.out.println("Hoca \"bu dersten zor geçersiniz\" dedi.");
        System.out.println(2+5+"3"+5*3);

        double anapara = 250;
        double faiz = 10;
        double hesap = (anapara * faiz /100)+anapara;
        System.out.println("Anapara : "+anapara+"\nfaiz:"+faiz+"\ntoplam="+hesap);

        AdimiYaz();
        AdimiYaz();
        AdimiYaz();
        AdimiYaz();
        AdimiYaz();
        OkulumuYaz();
    }
}
