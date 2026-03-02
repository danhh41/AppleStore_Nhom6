/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfficialVersion;

import java.util.Scanner;

public class StoreService {

    static Scanner sc = new Scanner(System.in);

    public static void showIphoneList() {
        for (Model m : FileManager.list) {
            if (m instanceof Iphone) {
                m.showBasicInfo();
            }
        }
    }

    public static void showMacList() {
        for (Model m : FileManager.list) {
            if (m instanceof Mac) {
                m.showBasicInfo();
            }
        }
    }

    public static String inputString(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

    public static void addIphone() {
        String name = inputString("Enter Name: ");
        String id = inputString("Enter ID: ");
        String screenSize = inputString("Enter Screen Size: ");
        String displayTechnology = inputString("Enter Display Technology: ");
        String resolution = inputString("Enter Resolution: ");
        String refreshRate = inputString("Enter Refresh Rate: ");
        String displayType = inputString("Enter Display Type: ");
        String rearCamera = inputString("Enter Rear Camera: ");
        String frontCamera = inputString("Enter Front Camera: ");
        String chipset = inputString("Enter Chipset: ");
        String gpu = inputString("Enter GPU: ");
        String internalStorage = inputString("Enter Internal Storage: ");
        String operatingSystem = inputString("Enter Operating System: ");
        String dimensions = inputString("Enter Dimensions: ");
        String weight = inputString("Enter Weight: ");
        String charging = inputString("Enter Charging: ");
        String port = inputString("Enter Port: ");
        String waterResistance = inputString("Enter Water Resistance: ");
        String connectivity = inputString("Enter Connectivity: ");
        String launchDate = inputString("Enter Launch Date: ");
        String price = inputString("Enter Price: ");

        Model currentModel = new Iphone(rearCamera, frontCamera, charging, port, waterResistance, dimensions, displayType, id,
                name, screenSize, displayTechnology, resolution, refreshRate, chipset, gpu, null, internalStorage, operatingSystem, connectivity,
                weight, launchDate, price);
        FileManager.list.add(currentModel);
        System.out.println("Created successfully!");
    }

    public static void addMac() {

        String name = inputString("Enter Name: ");
        String id = inputString("Enter ID: ");
        String cpu = inputString("Enter CPU: ");
        String gpu = inputString("Enter GPU: ");
        String neuralEngine = inputString("Enter Neural Engine: ");
        String ram = inputString("Enter RAM: ");
        String storage = inputString("Enter Storage: ");
        String display = inputString("Enter Display: ");
        String resolution = inputString("Enter Resolution: ");
        String brightness = inputString("Enter Brightness: ");
        String refreshRate = inputString("Enter Refresh Rate: ");
        String weight = inputString("Enter Weight: ");
        String battery = inputString("Enter Battery: ");
        String connectivity = inputString("Enter Connectivity: ");
        String os = inputString("Enter OS: ");
        String price = inputString("Enter Price: ");

        Model currentModel = new Mac(battery, brightness, display, neuralEngine, id, name, null, 
                display, resolution, refreshRate, cpu, gpu, ram, storage, os, connectivity, weight, 
                null, price);
        FileManager.list.add(currentModel);
        System.out.println("Created successfully!");
    }

    public static void findProductByName() {
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        boolean found = false;

        for (Model p : FileManager.list) {
            if (p.getName().equalsIgnoreCase(name)) {
                if (p instanceof Mac) {
                    p.showBasicInfo();
                } else if (p instanceof Iphone) {
                    p.showBasicInfo();
                }
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }
    }
}
