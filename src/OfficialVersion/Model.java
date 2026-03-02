/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfficialVersion;

public abstract class Model {

    private String id;
    private String name;

    private String screenSize;
    private String displayTechnology;
    private String resolution;
    private String refreshRate;

    private String cpu;
    private String gpu;
    private String ram;

    private String storage;
    private String os;

    private String connectivity;
    private String weight;
    private String launchDate;
    private String price;

    public Model() {
    }

    public Model(String id, String name, String screenSize, String displayTechnology, String resolution, String refreshRate, String cpu, String gpu, String ram, String storage, String os, String connectivity, String weight, String launchDate, String price) {
        this.id = id;
        this.name = name;
        this.screenSize = screenSize;
        this.displayTechnology = displayTechnology;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.connectivity = connectivity;
        this.weight = weight;
        this.launchDate = launchDate;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getDisplayTechnology() {
        return displayTechnology;
    }

    public void setDisplayTechnology(String displayTechnology) {
        this.displayTechnology = displayTechnology;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(String refreshRate) {
        this.refreshRate = refreshRate;
    }
    
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", screenSize=" + screenSize + ", displayTechnology=" + displayTechnology + ", resolution=" + resolution + ", refreshRate=" + refreshRate + ", cpu=" + cpu + ", gpu=" + gpu + ", ram=" + ram + ", storage=" + storage + ", os=" + os + ", connectivity=" + connectivity + ", weight=" + weight + ", launchDate=" + launchDate + ", price=" + price;
    }
    
    public abstract void showBasicInfo();
}
