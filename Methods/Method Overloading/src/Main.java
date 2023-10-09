// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Area of rectangle: " + area(14.25, 10.65));
        System.out.println("Area of square: " + area(5));
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static int area(int side) {
        return side * side;
    }
}