package OfficialVersion;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Service {

    static List<Model> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner fileSc = new Scanner(file);
            Model currentModel = null;

            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }

                int sep = line.indexOf('=');
                if (sep == -1) {
                    continue;
                }
                String key = line.substring(0, sep).trim();
                String value = line.substring(sep + 1).trim();

                switch (key) {
                    case "Type":
                        if (value.equals("iphone")) {
                            currentModel = new Iphone();
                        } else if (value.equals("mac")) {
                            currentModel = new Mac();
                        }
                        if (currentModel != null) {
                            currentModel.setType(value);
                            list.add(currentModel);
                        }
                        break;

                    case "Name":
                        if (currentModel != null) {
                            currentModel.setName(value);
                        }
                        break;
                    case "ID":
                        if (currentModel != null) {
                            currentModel.setId(value);
                        }
                        break;
                    case "Screen Size":
                        if (currentModel != null) {
                            currentModel.setScreenSize(value);
                        }
                        break;
                    case "Resolution":
                        if (currentModel != null) {
                            currentModel.setResolution(value);
                        }
                        break;
                    case "GPU":
                        if (currentModel != null) {
                            currentModel.setGpu(value);
                        }
                        break;
                    case "Connectivity":
                        if (currentModel != null) {
                            currentModel.setConnectivity(value);
                        }
                        break;
                    case "Weight":
                        if (currentModel != null) {
                            currentModel.setWeight(value);
                        }
                        break;

                    // int fields — parse directly
                    case "Refresh Rate":
                        if (currentModel != null) {
                            currentModel.setRefreshRate(Integer.parseInt(value));
                        }
                        break;
                    case "RAM":
                        if (currentModel != null) {
                            currentModel.setRam(Integer.parseInt(value));
                        }
                        break;

                    case "Price":
                        if (currentModel != null) {
                            currentModel.setPrice(Double.parseDouble(value));
                        }
                        break;

                    case "Display Technology":
                    case "Display":
                        if (currentModel != null) {
                            currentModel.setDisplayTechnology(value);
                        }
                        break;
                    case "CPU":
                    case "Chipset":
                        if (currentModel != null) {
                            currentModel.setCpu(value);
                        }
                        break;

                    case "Storage":
                    case "Internal Storage":
                        if (currentModel != null) {
                            currentModel.setStorage(value);
                        }
                        break;
                    case "OS":
                    case "Operating System":
                        if (currentModel != null) {
                            currentModel.setOs(value);
                        }
                        break;

                    case "Display Type":
                        if (currentModel instanceof Iphone) {
                            ((Iphone) currentModel).setDisplayType(value);
                        }
                        break;
                    case "Rear Camera":
                        if (currentModel instanceof Iphone) {
                            ((Iphone) currentModel).setRearCamera(value);
                        }
                        break;
                    case "Front Camera":
                        if (currentModel instanceof Iphone) {
                            ((Iphone) currentModel).setFrontCamera(value);
                        }
                        break;
                    case "Dimensions":
                        if (currentModel instanceof Iphone) {
                            ((Iphone) currentModel).setDimensions(value);
                        }
                        break;
                    case "Charging":
                        if (currentModel instanceof Iphone) {
                            ((Iphone) currentModel).setCharging(value);
                        }
                        break;
                    case "Port":
                        if (currentModel instanceof Iphone) {
                            ((Iphone) currentModel).setPort(value);
                        }
                        break;
                    case "Water Resistance":
                        if (currentModel instanceof Iphone) {
                            ((Iphone) currentModel).setWaterResistance(value);
                        }
                        break;
                    case "Launch Date":
                        if (currentModel instanceof Iphone) {
                            ((Iphone) currentModel).setLaunchDate(value);
                        }
                        break;

                    case "Neural Engine":
                        if (currentModel instanceof Mac) {
                            ((Mac) currentModel).setNeuralEngine(value);
                        }
                        break;
                    case "Battery":
                        if (currentModel instanceof Mac) {
                            ((Mac) currentModel).setBattery(value);
                        }
                        break;
                    case "Brightness":
                        if (currentModel instanceof Mac) {
                            ((Mac) currentModel).setBrightness(value);
                        }
                        break;
                }
            }
            fileSc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    public static void showIphoneList() {
        System.out.println("\n========== iPhone List ==========");
        for (Model m : list) {
            if (m instanceof Iphone) {
                System.out.println(m.toString());
            }
        }
        System.out.println();
    }

    public static void showMacList() {
        System.out.println("\n========== Mac List ==========");
        for (Model m : list) {
            if (m instanceof Mac) {
                System.out.println(m.toString());
            }
        }
        System.out.println();
    }

    public static void shop() {
        System.out.println("\n========== All Products ==========");
        for (Model m : list) {
            System.out.println(m.toString());
        }
        System.out.println();
    }

    public static void findProductByName() {
        System.out.print("Enter search (name / type / chipset / OS): ");
        String query = sc.nextLine().trim();
        boolean found = false;
        for (Model m : list) {
            if (m.matchesQuery(query)) {
                m.showFullSpecs();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No product found for: \"" + query + "\"\n");
        }
    }

    public static void applyDiscountByName() {
        System.out.print("Enter product name to discount: ");
        String name = sc.nextLine().trim();

        boolean found = false;
        for (Model m : list) {
            if (m.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter discount percentage (e.g. 10 for 10%): ");
                double pct = Double.parseDouble(sc.nextLine().trim());
                m.discountPrice(pct);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Product not found!\n");
        }
    }

    public static void applyDiscountToAll() {
        System.out.print("Enter discount % to apply to ALL products: ");
        double pct = Double.parseDouble(sc.nextLine().trim());
        System.out.println();
        for (Model m : list) {
            m.discountPrice(pct);
        }
    }

    public static String inputString(String message) {
        System.out.print(message);
        return sc.nextLine().trim();
    }

    public static void addIphone() {
        String type = "iphone";
        String name = inputString("Name: ");
        String id = inputString("ID: ");
        String screenSize = inputString("Screen Size: ");
        String displayTech = inputString("Display Technology: ");
        String resolution = inputString("Resolution: ");
        int refreshRate = Integer.parseInt(inputString("Refresh Rate (number only, e.g. 120): "));
        String displayType = inputString("Display Type: ");
        String rearCamera = inputString("Rear Camera: ");
        String frontCamera = inputString("Front Camera: ");
        String chipset = inputString("Chipset: ");
        String gpu = inputString("GPU: ");
        int ram = Integer.parseInt(inputString("RAM (GB, number only, e.g. 8): "));
        String storage = inputString("Internal Storage: ");
        String os = inputString("Operating System: ");
        String dimensions = inputString("Dimensions: ");
        String weight = inputString("Weight: ");
        String charging = inputString("Charging: ");
        String port = inputString("Port: ");
        String waterResistance = inputString("Water Resistance: ");
        String connectivity = inputString("Connectivity: ");
        String launchDate = inputString("Launch Date: ");
        double price = Double.parseDouble(inputString("Price (numbers only, e.g. 34190000): "));

        list.add(new Iphone(rearCamera, frontCamera, charging, port, waterResistance,
                dimensions, displayType, type, id, name, screenSize, displayTech,
                resolution, refreshRate, chipset, gpu, ram, storage, os,
                connectivity, weight, launchDate, price));
        System.out.println("iPhone added successfully!\n");
    }

    public static void addMac() {
        String type = "mac";
        String name = inputString("Name: ");
        String id = inputString("ID: ");
        String cpu = inputString("CPU: ");
        String gpu = inputString("GPU: ");
        String neuralEngine = inputString("Neural Engine: ");
        int ram = Integer.parseInt(inputString("RAM (GB, number only, e.g. 16): "));
        String storage = inputString("Storage: ");
        String display = inputString("Display: ");
        String resolution = inputString("Resolution: ");
        String brightness = inputString("Brightness: ");
        int refreshRate = Integer.parseInt(inputString("Refresh Rate (number only, e.g. 120): "));
        String weight = inputString("Weight: ");
        String battery = inputString("Battery: ");
        String connectivity = inputString("Connectivity: ");
        String os = inputString("OS: ");
        double price = Double.parseDouble(inputString("Price (numbers only, e.g. 25290000): "));

        list.add(new Mac(battery, brightness, display, neuralEngine, type, id, name,
                display, display, resolution, refreshRate, cpu, gpu, ram, storage,
                os, connectivity, weight, null, price));
        System.out.println("Mac added successfully!\n");
    }
}
