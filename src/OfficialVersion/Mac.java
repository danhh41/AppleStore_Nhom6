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
public class Mac extends Model {
    
    private String battery;
    private String brightness;
    private String display;
    private String neuralEngine;

    public Mac() {
    }

    public Mac(String battery, String brightness, String display, String neuralEngine, String id, String name, String screenSize, String displayTechnology, String resolution, String refreshRate, String cpu, String gpu, String ram, String storage, String os, String connectivity, String weight, String launchDate, String price) {
        super(id, name, screenSize, displayTechnology, resolution, refreshRate, cpu, gpu, ram, storage, os, connectivity, weight, launchDate, price);
        this.battery = battery;
        this.brightness = brightness;
        this.display = display;
        this.neuralEngine = neuralEngine;
    }

    


    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getNeuralEngine() {
        return neuralEngine;
    }

    public void setNeuralEngine(String neuralEngine) {
        this.neuralEngine = neuralEngine;
    }

    @Override
    public String toString() {
        
        return "Mac{" + super.toString() +"battery=" + battery + ", brightness=" + brightness + ", display=" + display + ", neuralEngine=" + neuralEngine + '}';
    }
    
    @Override
    public void showBasicInfo() {
        System.out.println("========== " + getName() + " ==========\n");
        System.out.println("CPU: "+ getCpu());
        System.out.println("GPU: " + getGpu());
        System.out.println("Neural Engine: " + getNeuralEngine()+ "\n");
        System.out.println("RAM: " + getRam());
        System.out.println("Storage: " + getStorage() + "\n");
        System.out.println("Display: " + getDisplayTechnology());
        System.out.println("Resolution: " + getResolution());
        System.out.println("Brightness: " + getBrightness());
        System.out.println("Refresh Rate: " + getRefreshRate() + "\n");
        System.out.println("Weight: " + getWeight());
        System.out.println("Battery: " + getBattery());
        System.out.println("Connectivity: " + getConnectivity());
        System.out.println("OS: " + getOs() + "\n");
        System.out.println("Price: " + getPrice() + "\n\n");
    }
}
