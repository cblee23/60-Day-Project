package main.JSON;
import java.util.ArrayList;

/**
 * Created by chrile on 9/15/14.
 */
public class Order {

    ArrayList<Product> items = new ArrayList<Product>();

    public ArrayList<Product> getItems() {
        return items;
    }

    public void setItems(ArrayList<Product> items) {
        this.items = items;
    }
}
