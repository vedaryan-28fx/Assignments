import java.util.Scanner;
public class Prog_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the hexagon: ");
        double side = sc.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * (side * side);

        System.out.println("The area of the hexagon is: " + area);

    }
}
