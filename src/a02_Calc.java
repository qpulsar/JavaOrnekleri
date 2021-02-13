public class a02_Calc {

    public static void calcArea() {

        double sideLength = 5.0;
        double alan;
        alan = Math.pow(sideLength, 2);
        System.out.print("alan = " + alan);
    }

    public static void main(String[] args) {
        int i;
        for (i = 1; i < 17; i += 3)
            System.out.print(i + " ");
        calcArea();

    }
}
