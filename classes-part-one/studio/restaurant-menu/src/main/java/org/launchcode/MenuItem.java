package org.launchcode;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    boolean isNew;

    public MenuItem(String category, String description, double price, boolean isNew) {
        this.category = category;
        this.description = description;
        this.price = price;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
