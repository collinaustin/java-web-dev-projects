package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class MenuLC {
    private Date lastUpdated;
    private ArrayList<MenuItemLC> items;

    public MenuLC(Date d, ArrayList<MenuItemLC> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItemLC> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItemLC> getItems() {
        return items;
    }
}
