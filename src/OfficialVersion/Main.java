/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfficialVersion;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    
    static List<Mac> macList = new ArrayList<>();
    static List<Iphone> ipList = new ArrayList<>();

    public static void addIphone() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter ID: ");
        String id = sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Procesor: ");
        String chip = sc.nextLine();
        System.out.println("Enter Price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter Quantity: ");
        int quan = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Description: ");
        String des = sc.nextLine();
        System.out.println("Enter Category ID: ");
        String cat = sc.nextLine();
        System.out.println("Enter Battery Capacity: ");
        int bat = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Screen Size: ");
        double size = Double.parseDouble(sc.nextLine());

        Iphone ip = new Iphone(bat, size, id, name, chip, price, quan, des, cat);
        ipList.add(ip);

        System.out.println("Created successfully!");
    }

    public static void addMac() {
        Scanner sc = new Scanner(System.in);
        // List<Mac> macList = new ArrayList<>();

        System.out.println("Enter ID: ");
        String id = sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Procesor: ");
        String chip = sc.nextLine();
        System.out.println("Enter Price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter Quantity: ");
        int quan = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Description: ");
        String des = sc.nextLine();
        System.out.println("Enter Category ID: ");
        String cat = sc.nextLine();
        System.out.println("Enter Ram: ");
        int ram = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Storage: ");
        int sto = Integer.parseInt(sc.nextLine());

        Mac mac = new Mac(ram, sto, id, name, chip, price, quan, des, cat);
        macList.add(mac);

        System.out.println("Created successfully!");
    }

    public static void findProductByName(List<Iphone> ipList, List<Mac> macList, Scanner sc) {
        System.out.print("Enter product name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        boolean found = false;

        for (Iphone ip : ipList) {
            if (ip.getName().equalsIgnoreCase(name)) {
                ip.display();
                found = true;
            }
        }

        for (Mac mac : macList) {
            if (mac.getName().equalsIgnoreCase(name)) {
                mac.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }
    }

    public static void createNewObject() {
        Scanner sc = new Scanner(System.in);
        int choise;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Create new Iphone model");
            System.out.println("2. Create new Macbook model");
            System.out.println("3. Find Product");
            System.out.println("4. Exit");
            choise = sc.nextInt();

            switch (choise) {
                case 1:
                    addIphone();
                    break;
                case 2:
                    addMac();
                    break;
                case 3:
                    findProductByName(ipList, macList, sc);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        } while (choise != 4);
    }

    public static void main(String[] args) {
        createNewObject();
    }
}
