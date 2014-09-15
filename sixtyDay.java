package main;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by chrile on 9/10/14.
 */
public class sixtyDay {
    public static void main(String args[]){

        JSONObject obj = new JSONObject();

        JSONArray arr = obj.getJSONArray("items");

        for (int i = 0; i<arr.length(); i++){

        String name = arr.getJSONObject(i).getString("name");
        String itemType = arr.getJSONObject(i).getString("itemType");
        int SKU = arr.getJSONObject(i).getInt("SKU");

        String[] items = new String[arr.length()];
        items[i] = itemType;

        System.out.println("Name: " + name);
        System.out.println("Item Type: " + itemType);
        System.out.println("SKU: " + SKU)
        System.out.println();
    }
}
