import java.util.Scanner;
public class Prog_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double a = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double b = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double c = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        double s = (a + b + c) / 2;

        double area = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);

        System.out.println("The area of the triangle is " + area);

    }
}
