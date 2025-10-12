import java.util.Scanner;

public class Prog_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double cel = input.nextDouble();

        double fah = (9.0 / 5) * cel + 32;

        System.out.println(cel + " Celsius is " + fah + " Fahrenheit");

    }
}
