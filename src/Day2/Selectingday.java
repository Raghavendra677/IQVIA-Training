package Day2;

import java.util.Scanner;

    public class Selectingday{
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter a number 1-3:");

            int choice= sc.nextInt();
            switch (choice) {
                case 1:System.out.println("Monday.");
                    break;
                case 2:System.out.println("Tuesday");

                case 3: System.out.println("Wednesday");
                    break;
                default: System.out.println("Invalid choice.Please enter 1, 2, or 3");
            }
        }
    }


