/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2;

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

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return this.storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String getInfo() {
        return "ID: " + getId() + ", Name: " + getName() + ", Chip: " + getChip() + ", Ram: "+ this.ram + ", Storage: " + this.storage + ", Price: " + getPrice();
    }
}
