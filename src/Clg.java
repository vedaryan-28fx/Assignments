import java.util.Scanner;

public class Clg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cost1 = 2999;
        int cost2  =2999;

        System.out.println("Enter the amount of ICP books :-");
        int m = sc.nextInt();

        System.out.println("Enter the amount of DM books :-");
        int n = sc.nextInt();

        double t_cost = (m * cost1) + (n * cost2);

        if (t_cost > 4999){
            t_cost = t_cost - t_cost%10;
        }
        else {
            t_cost = t_cost;
        }

        System.out.println("Is your card Axis Bank (y or n):-");
        String card = sc.next();

        if (card.equals("y")) {
            t_cost = t_cost - t_cost * (10/100.0);
            System.out.println(" Is your card Flipkart Axis (y or n) :-");
            String card1 = sc.next();
            if (card1.equals("y")){
                t_cost = t_cost - t_cost * (4/100.0);
            }
            else{
                t_cost = t_cost;
            }
        }
        else {
            t_cost = t_cost;
        }

        System.out.println("Price of ICP books :- " + cost1 + "\n" + "Price of DM books :- " + cost2);
        System.out.println(" ");
        System.out.println("Number of ICP books :- " + m + "\n" + "Number of DM books :- " + n);
        System.out.println(" ");
        System.out.println("Total amount to be paid " + t_cost);
    }
}
