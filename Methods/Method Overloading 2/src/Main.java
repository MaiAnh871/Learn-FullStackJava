// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("2 + 4 = " + sum(2, 4));
        System.out.println("1 + 2.5 = " + sum(1, 2.5F));
        System.out.println("1.3 + 2.3 = " + sum(1.3, 2.3));
    }

    public static int sum(int x, int y) {
        System.out.println("Adding 2 int entities: ");
        return x + y;
    }

    public static float sum(int x, float y) {
        System.out.println("Adding 1 int and 1 float entities: ");
        return x + y;
    }

    public static double sum(double x, double y) {
        System.out.println("Adding 2 double entities: ");
        return x + y;
    }
}