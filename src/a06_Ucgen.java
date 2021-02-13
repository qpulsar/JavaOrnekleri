public class a06_Ucgen {
    public static void ucgen() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }

    public static void dik( ) {
        System.out.println("+------+ +------+");
        for(int i=1; i<4; i++ ) {
            System.out.println("|      | |      |");
        }

    }

    public static void main(String[] args) {
        ucgen();
        dik();
    }
}
