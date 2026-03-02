/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfficialVersion;


/**
 *
 * @author FOTZS41
 */
public class Iphone extends Model{
    
    // camera
    private String rearCamera;
    private String frontCamera;
    private String charging;
    private String port;
    private String waterResistance;
    private String dimensions;
    private String displayType;

    public Iphone() {
    }

    public Iphone(String rearCamera, String frontCamera, String charging, String port, String waterResistance, String dimensions, String displayType, String id, String name, String screenSize, String displayTechnology, String resolution, String refreshRate, String cpu, String gpu, String ram, String storage, String os, String connectivity, String weight, String launchDate, String price) {
        super(id, name, screenSize, displayTechnology, resolution, refreshRate, cpu, gpu, ram, storage, os, connectivity, weight, launchDate, price);
        this.rearCamera = rearCamera;
        this.frontCamera = frontCamera;
        this.charging = charging;
        this.port = port;
        this.waterResistance = waterResistance;
        this.dimensions = dimensions;
        this.displayType = displayType;
    }
    

    public String getRearCamera() {
        return rearCamera;
    }

    public void setRearCamera(String rearCamera) {
        this.rearCamera = rearCamera;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getCharging() {
        return charging;
    }

    public void setCharging(String charging) {
        this.charging = charging;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(String waterResistance) {
        this.waterResistance = waterResistance;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }
    
    
    @Override
    public String toString() {
        
        return "Iphone{" + super.toString() + "rearCamera=" + rearCamera + ", frontCamera=" + frontCamera + ", charging=" + charging + ", port=" + port + ", waterResistance=" + waterResistance + ", dimensions=" + dimensions + ", displayType=" + displayType + '}';
    }
    
    @Override
    public void showBasicInfo() {
        System.out.println("========== " + getName() + " ==========\n");
        System.out.println("Screen Size: " + getScreenSize());
        System.out.println("Display Technology: " + getDisplayTechnology());
        System.out.println("Resolution: " + getResolution());
        System.out.println("Refresh Rate: " + getRefreshRate());
        System.out.println("Display Type: " + getDisplayType() + "\n");
        System.out.println("Rear Camera: " + getRearCamera());
        System.out.println("Front Camera: " + getFrontCamera() + "\n");
        System.out.println("Chipset: "+ getCpu());
        System.out.println("GPU: " + getGpu());
        System.out.println("Internal Storage: " + getStorage());
        System.out.println("Operating System: " + getOs() + "\n");
        System.out.println("Dimensions: " + getDimensions());
        System.out.println("Weight: " + getWeight() + "\n");
        System.out.println("Charging: " + getCharging());
        System.out.println("Port: " + getPort());
        System.out.println("Water Resistance: " + getWaterResistance());
        System.out.println("Connectivity: " + getConnectivity() + "\n");
        System.out.println("Launch Date: " + getLaunchDate() + "\n");
        System.out.println("Price: " + getPrice() + "\n\n");
    }
}
