import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a coffee:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        int coffeeChoice = scanner.nextInt();

        Coffee coffee;
        switch (coffeeChoice) {
            case 1:
                coffee = new Espresso();
                break;
            case 2:
                coffee = new Americano();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        while (true) {
            System.out.println("Choose an add-on:");
            System.out.println("1. Milk");
            System.out.println("2. Sugar");
            System.out.println("4. Finish and Checkout");
            int addOnChoice = scanner.nextInt();

            switch (addOnChoice) {
                case 1:
                    coffee = new Milk(coffee);
                    break;
                case 2:
                    coffee = new Sugar(coffee);
                    break;
                case 4:
                    System.out.println("Your order: " + coffee.getDescription());
                    System.out.println("Total cost: " + coffee.cost() + " $");
                    System.out.println("Thank you for your order.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
