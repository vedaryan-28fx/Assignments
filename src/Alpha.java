import java.util.Scanner;
public class Alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        // Using nested ternary operators
        String grade = (marks >= 90) ? "E" :
                (marks >= 80 && marks < 90) ? "A" :
                        (marks >= 70 && marks < 80) ? "B" :
                                (marks >= 60 && marks < 70) ? "C" :
                                        "N";

        System.out.println("Grade = " + grade);

        sc.close();
    }
}
