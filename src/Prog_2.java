import java.util.Scanner;
public class Prog_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double rad = input.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        double area = Math.PI * rad * rad;
        double vol = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + vol);

    }
}

