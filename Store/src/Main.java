import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean active = true;
        double totalPrice= 0;

        while (active) {
            System.out.println("Select a product: ");
            System.out.println("Meat products (Press 1)");
            System.out.println("Dairy products (Press 2)");
            System.out.println("Fruit & vegetable products (Press 3)");
            System.out.println("Bakery products (Press 4)");
            System.out.println("Drinks (Press 5)");
            int category = input.nextInt();
            switch (category) {
                case 1 -> {
                    System.out.println("700g Pork Loin Steaks 2.99£ (Press 1)");
                    System.out.println("200g Beef Fillet Steak 6.5£ (Press 2)");
                    int meats = input.nextInt();
                    if (meats == 1) {
                        System.out.println("Enter the amount:");
                        int amount = input.nextInt();
                        double price = 2.99 * amount;
                        totalPrice += price;
                    } else if (meats == 2) {
                        System.out.println("Enter the amount:");
                        int amount = input.nextInt();
                        double price = 6.5 * amount;
                        totalPrice += price;
                    }
                }
                case 2 -> {
                    System.out.println("1L Milk 1.15£ (Press 1)");
                    System.out.println("350g Cheddar Cheese 2.75£ (Press 2)");
                    int dairies = input.nextInt();
                    if (dairies == 1) {
                        System.out.println("Enter the amount:");
                        int amount = input.nextInt();
                        double price = 1.15 * amount;
                        totalPrice += price;
                    } else if (dairies == 2) {
                        System.out.println("Enter the amount:");
                        int amount = input.nextInt();
                        double price = 2.75 * amount;
                        totalPrice += price;
                    }
                }
                case 3 -> {
                    System.out.println("Bananas Loose 0.13£ (Press 1)");
                    System.out.println("Whole Cucumber 0.45£ (Press 2)");
                    int fruits_vegetables = input.nextInt();
                    if (fruits_vegetables == 1) {
                        System.out.println("Enter the amount:");
                        int amount = input.nextInt();
                        double price = 0.13 * amount;
                        totalPrice += price;
                    } else if (fruits_vegetables == 2) {
                        System.out.println("Enter the amount:");
                        int amount = input.nextInt();
                        double price = 0.45 * amount;
                        totalPrice += price;
                    }
                }
                case 4 -> {
                    System.out.println("800g Medium Bread 0.99£ (Press 1)");
                    System.out.println("(20 pack) Chocolate Brownie Bites 1.79£ (Press 2)");
                    int bakeries = input.nextInt();
                    if (bakeries == 1) {
                        System.out.println("Enter the amount:");
                        int amount = input.nextInt();
                        double price = 0.99 * amount;
                        totalPrice += price;
                    } else if (bakeries == 2) {
                        System.out.println("Enter the amount:");
                        int amount = input.nextInt();
                        double price = 1.79 * amount;
                        totalPrice += price;
                    }
                }
                case 5 -> {
                    System.out.println("2L Diet Coke 1.59£ (Press 1)");
                    System.out.println("950ML Orange Juice 2.49£ (Press 2)");
                    int drinks = input.nextInt();
                    if (drinks == 1) {
                        System.out.println("Enter the amount:");
                        int amount = input.nextInt();
                        double price = 1.59 * amount;
                        totalPrice += price;
                    } else if (drinks == 2) {
                        System.out.println("Enter the amount:");
                        int amount = input.nextInt();
                        double price = 2.49 * amount;
                        totalPrice += price;
                    }
                }
            }
            System.out.println("Do you wish to continue? Yes - Press 1, No - Press 2");
            int shopping = input.nextInt();
            if (shopping == 1) {
                continue;
            } else if (shopping == 2) {
                active = false;
            }
        }
        System.out.println("Total price Is: " + totalPrice + " £");
    }
}
