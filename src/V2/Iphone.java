/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2;

/**
 *
 * @author FOTZS41
 */
public class Iphone extends Product{
    private int batteryCapacity;
    private double screenSize;

    public Iphone(int batteryCapacity, double screenSize, String id, String name, String chip, double price, int quantity, String description, String categoryId) {
        super(id, name, chip, price, quantity, description, categoryId);
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    
    @Override
    public String getInfo() {
        return "ID: " + getId() + ", Name: " + getName() + ", Chip: " + getChip() + ", Battery Capacity: "+ this.batteryCapacity + ", Screen Size: " + this.screenSize + ", Price: " + getPrice();
    }
}
