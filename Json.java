package main.JSON;

import main.JSON.productMaker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


/**
 * Created by chrile on 9/10/14.
 */
public class Json {

    public String getJSON(Order order) {
        JSONObject json = new JSONObject(order);
        return json.toString();

    }

    public Order newOrder(String list) {
        JSONObject obj = new JSONObject(list);
        JSONArray arr = obj.getJSONArray("items");
        Order o = new Order();
        for (int x = 0; x < arr.length(); x++) {
            Product p = new Product();
            p.setName(arr.getJSONObject(x).getString("name"));
            p.setItemType(arr.getJSONObject(x).getString("itemType"));
            p.setSku(arr.getJSONObject(x).getInt("sku"));

            o.getItems().add(p);
        }
        return o;
    }

}