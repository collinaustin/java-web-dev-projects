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

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
