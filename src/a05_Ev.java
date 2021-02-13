public class a05_Ev {
    public static void ucgen() {
        System.out.println("   /\\      /\\  ");
        System.out.println("  /  \\    /  \\  ");
        System.out.println(" /    \\  /    \\  ");
    }

    public static void dik() {
        System.out.println("+-----+ +-----+");
        for(int a=1; a<5; a++)
        {
            System.out.println("|     | |     |");
        }
        System.out.println("+-----+ +-----+");
    }

    public static void main(String[] args) {
        int i;
        for(i=0; i<4; i++)
        {
            ucgen();
        }
        dik();
        for(int j=1; j<17; j += 3)
        {
            System.out.print(j+" ");
        }

    }
}
