import java.util.Scanner;
public class Prog_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the basic salary of the employee: ");
        double basicSalary = sc.nextDouble();

        double da = 0.40 * basicSalary;
        double hra = 0.20 * basicSalary;

        double grossSalary = basicSalary + da + hra;

        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("House Rent Allowance (HRA): " + hra);
        System.out.println("Gross Salary: " + grossSalary);

    }
}
