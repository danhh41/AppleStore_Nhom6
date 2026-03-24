package OfficialVersion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service.readFile("Data.txt");
        int choice;
        do {
            System.out.println("========== Apple.com ==========");
            System.out.println("0. Shop (all products)");
            System.out.println("1. Show iPhone list");
            System.out.println("2. Show Mac list");
            System.out.println("3. Find product");
            System.out.println("4. Add iPhone");
            System.out.println("5. Add Mac");
            System.out.println("6. Discount a product by name");
            System.out.println("7. Discount ALL products");
            System.out.println("8. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    Service.shop();
                    break;
                case 1:
                    Service.showIphoneList();
                    break;
                case 2:
                    Service.showMacList();
                    break;
                case 3:
                    Service.findProductByName();
                    break;
                case 4:
                    Service.addIphone();
                    break;
                case 5:
                    Service.addMac();
                    break;
                case 6:
                    Service.applyDiscountByName();
                    break;
                case 7:
                    Service.applyDiscountToAll();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 0-8.\n");
            }
        } while (choice != 8);
    }
}
