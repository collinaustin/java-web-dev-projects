package org.launchcode;
import java.util.*;

public class Menu {

    private ArrayList<MenuItem> items;
    private Date dateUpdated;

    public Menu(ArrayList<MenuItem> items, Date dateUpdated) {
        this.items = items;
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
