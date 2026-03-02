/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfficialVersion;


import java.util.Scanner;
/**
 *
 * @author FOTZS41
 */
public class Menu {
    
    static Scanner sc = new Scanner(System.in);
    
    public Menu () {
    }
    
    public static void startMenu() {
        FileManager.readFile("Data.txt");
        int choice;
        do {
            System.out.println("========== Apple.com ==========");
            System.out.println("1. Show iPhone list");
            System.out.println("2. Show Mac list");
            System.out.println("3. Find Model");
            System.out.println("4. Add iPhone Model");
            System.out.println("5. Add Mac Model");
            System.out.println("6. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    StoreService.showIphoneList();
                    break;
                case 2:
                    StoreService.showMacList();
                    break;
                case 3:
                    StoreService.findProductByName();
                    break;
                case 4:
                    StoreService.addIphone();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        } while (choice != 6);
    }
}
