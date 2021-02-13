public class a08_bakteri {
    public static void main(String[] args) {
        calculate(3,4);

    }
    public static void calculate(int bac, int h) {
        int bacteria = bac;
        int hours = h-1;
        for(int i=1; i<=hours; i++) {
            bacteria *= 2;
        }
        System.out.println(bacteria);
    }
}
