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
public class Iphone extends Product{
    private int batteryCapacity;
    private double screenSize;

    public Iphone(int batteryCapacity, double screenSize, String id, String name, String chip, double price, int quantity, String description, String categoryId) {
        super(id, name, chip, price, quantity, description, categoryId);
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Battery:     " + this.batteryCapacity);
        System.out.println("Screen Size: " + this.screenSize + "\n====================");
    }    
    
}
