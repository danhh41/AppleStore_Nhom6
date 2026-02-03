/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2;

/**
 *
 * @author FOTZS41
 */
public class Product {

    private String id;
    private String name;
    private String chip;
    private double price;
    private int quantity;
    private String description;
    private String categoryId;

    public Product(String id, String name, String chip, double price, int quantity, String description, String categoryId) {
        this.id = id;
        this.name = name;
        this.chip = chip;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.categoryId = categoryId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public double calculateDiscountedPrice(double percentage) {
        return this.price * (1 - percentage / 100);
    }

    public boolean isStockAvailable() {
        return this.quantity > 5;
    }

    public String getChip() {
        return this.chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getInfo() {
        return "ID: " + this.id + "Name: " + this.name + "Price: " + this.price;
    }
}
