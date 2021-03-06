package main.JSON;

/**
 * Created by chrile on 9/15/14.
 */
public class OrderDisplay {

    public Product[] orderContents;
    public int orderNumber = 0;


    public static Product[] displayOrder() {
        Product orderItems[];
        orderItems = productMaker.createOrder();
        int orderSize = orderItems.length;
        int itemCount = 1;
        int i = 0;
        int accessory = 0;
        int beauty = 0;
        int clothes = 0;
        int bag = 0;
        int shoes = 0;
        int houseware = 0;

        String[] order = new String[orderSize];
        for (Product item : orderItems) {
            if (item.itemType.equalsIgnoreCase("Accessory")) {
                order[i] = (itemCount + ". SKU: " + item.sku + "\n" +
                        "\tItem Name: " + item.name + "\n" +
                        "\tType: " + item.itemType + " | Size " + item.productSize +
                        "\n");
                itemCount++;
                i++;
                accessory++;

            }
            if (item.itemType.equalsIgnoreCase("Beauty")) {
                order[i] = (itemCount + ". SKU: " + item.sku + "\n" +
                        "\tItem Name: " + item.name + "\n" +
                        "\tType: " + item.itemType + " | Size " + item.productSize +
                        "\n");
                itemCount++;
                i++;
                beauty++;

            }
            if (item.itemType.equalsIgnoreCase("Clothes")) {
                order[i] = (itemCount + ". SKU: " + item.sku + "\n" +
                        "\tItem Name: " + item.name + "\n" +
                        "\tType: " + item.itemType + " | Size " + item.productSize +
                        "\n");
                itemCount++;
                i++;
                clothes++;
            }
            if (item.itemType.equalsIgnoreCase("Bags")) {
                order[i] = (itemCount + ". SKU: " + item.sku + "\n" +
                        "\tItem Name: " + item.name + "\n" +
                        "\tType: " + item.itemType + " | Size " + item.productSize +
                        "\n");
                itemCount++;
                i++;
                bag++;
            }
            if (item.itemType.equalsIgnoreCase("Shoes")) {
                order[i] = (itemCount + ". SKU: " + item.sku + "\n" +
                        "\tItem Name: " + item.name + "\n" +
                        "\tType: " + item.itemType + " | Size " + item.productSize +
                        "\n");
                itemCount++;
                i++;
                shoes++;
            }
            if (item.itemType.equalsIgnoreCase("Housewares")) {
                order[i] = (itemCount + ". SKU: " + item.sku + "\n" +
                        "\tItem Name: " + item.name + "\n" +
                        "\tType: " + item.itemType + " | Size " + item.productSize +
                        "\n");
                itemCount++;
                i++;
                houseware++;
            }

        }

        System.out.println("Order contains:");
        System.out.println("Accessory: " + accessory);
        System.out.println("Beauty: " + beauty);
        System.out.println("Clothes: " + clothes);
        System.out.println("Bag: " + bag);
        System.out.println("Shoes " + shoes);
        System.out.println("Houseware: " + houseware);
        System.out.println();
        System.out.println("Order List:");
        for (String view : order) {
            System.out.println(view);
        }
        return orderItems;

    }

}
