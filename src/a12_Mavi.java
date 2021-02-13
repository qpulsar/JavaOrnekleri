import java.util.Scanner;

public class a12_Mavi {
    //klavyeden girilen sayının tek mi çift mi olduğun bulan fonksiyon
    public static void tekmiCiftmi() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int g = scn.nextInt();
        if (g % 2 == 0) {
            System.out.println("Sayı çift");
        }
        else {
            System.out.println("Sayı tektir");
        }
        //scn.close();
    }

    //üçe tam bölünen sayı için "tam" yazan fonksiyon
    public static void tamUc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int s = scanner.nextInt();
        if (s%3==0) {
            System.out.println("Üçe tam bölünür");
        }
        else {
            System.out.println("Üçe bölünmez");
        }
    }


    // Klavyeden ismi alıp merhaba yazan fonksiyon
    public static void meraba() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi girin:");
        String isim = scanner.nextLine();
        System.out.println("Merhaba "+isim);

    }

    public static void main(String[] args) {
        //tekmiCiftmi();
        //tamUc();
        meraba();
    }
}
