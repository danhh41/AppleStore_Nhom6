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
public class Mac extends Product {

    private int ram;
    private int storage;

    public Mac(int ram, int storage, String id, String name, String chip, double price, int quantity, String description, String categoryId) {
        super(id, name, chip, price, quantity, description, categoryId);
        this.ram = ram;
        this.storage = storage;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Ram:         " + this.ram);
        System.out.println("Storage:     " + this.storage + "\n====================");
    }

}
