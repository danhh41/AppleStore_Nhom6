/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfficialVersion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FOTZS41
 */
public class FileManager {

    static List<Model> list = new ArrayList<>();

    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            Model currentModel = null;

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if(line.trim().isEmpty()){
                continue;
                }
                String[] keyValue = line.split("=");
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                //String[] parts = line.split(";");

                //for (String part : parts) {
                //    String[] keyValue = part.split(":", 2);

                //    if (keyValue.length < 2) {
                //        continue;
                //    }

                //    String key = keyValue[0].trim();
                //    String value = keyValue[1].trim();

                    if (value.toLowerCase().contains("iphone")) {
                        currentModel = new Iphone();
                        list.add(currentModel);
                        currentModel.setName(value);
                    } else if (value.toLowerCase().contains("macbook")) {
                        currentModel = new Mac();
                        list.add(currentModel);
                        currentModel.setName(value);
                    } else if (currentModel != null) {
                        switch (key) {
                            case "ID":
                                currentModel.setId(value);
                                break;
                            case "Screen Size":
                                currentModel.setScreenSize(value);
                                break;
                            case "Display Technology":
                                currentModel.setDisplayTechnology(value);
                                break;
                            case "Display":
                                currentModel.setDisplayTechnology(value);
                                break;
                            case "Resolution":
                                currentModel.setResolution(value);
                                break;
                            case "Refresh Rate":
                                currentModel.setRefreshRate(value);
                                break;
                            case "Display Type":
                                if (currentModel instanceof Iphone) {
                                    Iphone ip = (Iphone) currentModel;
                                    ip.setDisplayType(value);
                                }
                                break;
                            case "Rear Camera":
                                if (currentModel instanceof Iphone) {
                                    Iphone ip = (Iphone) currentModel;
                                    ip.setRearCamera(value);
                                }
                                break;

                            case "Front Camera":
                                if (currentModel instanceof Iphone) {
                                    Iphone ip = (Iphone) currentModel;
                                    ip.setFrontCamera(value);
                                }
                                break;
                            case "CPU":
                                currentModel.setCpu(value);
                                break;
                            case "GPU":
                                currentModel.setGpu(value);
                                break;
                            case "Chipset":
                                if (currentModel instanceof Iphone) {
                                    Iphone ip = (Iphone) currentModel;
                                    ip.setCpu(value);
                                }
                                break;
                            case "RAM":
                                currentModel.setRam(value);
                                break;
                            case "Storage":
                                currentModel.setStorage(value);
                                break;
                            case "Neural Engine":
                                if (currentModel instanceof Mac) {
                                    Mac mac = (Mac) currentModel;
                                    mac.setNeuralEngine(value);
                                }
                                break;
                            case "Battery":
                                if (currentModel instanceof Mac) {
                                    Mac mac = (Mac) currentModel;
                                    mac.setBattery(value);
                                }
                                break;
                            case "Internal Storage":
                                currentModel.setStorage(value);
                                break;
                            case "Operating System":
                                currentModel.setOs(value);
                                break;
                            case "OS":
                                currentModel.setOs(value);
                                break;
                            case "Dimensions":
                                if (currentModel instanceof Iphone) {
                                    Iphone ip = (Iphone) currentModel;
                                    ip.setDimensions(value);
                                }
                                break;
                            case "Weight":
                                currentModel.setWeight(value);
                                break;
                            case "Charging":
                                if (currentModel instanceof Iphone) {
                                    Iphone ip = (Iphone) currentModel;
                                    ip.setCharging(value);
                                }
                                break;
                            case "Port":
                                if (currentModel instanceof Iphone) {
                                    Iphone ip = (Iphone) currentModel;
                                    ip.setPort(value);
                                }
                                break;
                            case "Water Resistance":
                                if (currentModel instanceof Iphone) {
                                    Iphone ip = (Iphone) currentModel;
                                    ip.setWaterResistance(value);
                                }
                                break;
                            case "Connectivity":
                                currentModel.setConnectivity(value);
                                break;
                            case "Launch Date":
                                if (currentModel instanceof Iphone) {
                                    Iphone ip = (Iphone) currentModel;
                                    ip.setLaunchDate(value);
                                }
                                break;
                            case "Brightness":
                                if (currentModel instanceof Mac) {
                                    Mac mac = (Mac) currentModel;
                                    mac.setBrightness(value);
                                }
                                break;
                            case "Price":
                                currentModel.setPrice(value);
                                break;
                        }
                    }
                }

            //}

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    public void createiPhone() {

    }

    public void createMac() {

    }
}
