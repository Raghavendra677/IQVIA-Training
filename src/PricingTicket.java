
import java.util.Scanner;

public class PricingTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        int price=100;

        if (age < 5) {
            price = 0;
        } else if (age < 18) {
            price = 200;
        } else if (age <= 60) {
            price = 150;
        } 
        
        System.out.println("Ticket price is " + price);

    }
}



