package main.JSON;

import java.util.Random;

/**
 * Created by chrile on 9/15/14.
 import java.util.Random;
*/


 //Creates a product
 //Product Type 1 == Accessory / size 1
 //Product Type 2 == Beauty / size 2
 //Product Type 3 == Clothes / size 2
 //Product Type 4 == Bags / size 3
 //Product Type 5 == Shoes / size 3
 //Product Type 6 == Housewares / size 5
 public class productMaker
 {

     //creates products to be loaded into Json file.
 public static Product generateProduct()
 {
 Random r = new Random();
 Product p = new Product();
 String [] itemName  = {"Cool Hat" , "Cool Watch" , "Cool Necklace", "Black Lipstick" , "Red LipStick" ,
 "Black Eyeliner" , "Blue Shirt" , "Blue Jeans" , "Black Dress" , "Red Bag" ,
 "White Bag" , "Yellow Bag" , "Cool Flip Flops", "Cool Shoes" , "Cool Heels" ,
 "Cool Blender" , "Cool Mixer" , "Cool Juicer" };
 p.productID = 1 + r.nextInt(6);

 if( p.productID == 1){
 p.setProductName(itemName[r.nextInt(3)]);
 p.setProductType("Accessory");
 p.setProductSize(1);
 }
 if( p.productID == 2) {
 p.setProductName(itemName[3 + r.nextInt(3)]);
 p.setProductType("Beauty");
 p.setProductSize(2);
 }
 if( p.productID == 3) {
 p.setProductName(itemName[6 + r.nextInt(3)]);
 p.setProductType("Clothes");
 p.setProductSize(2);
 }
 if( p.productID == 4){
 p.setProductName(itemName[9 + r.nextInt(3)]);
 p.setProductType("Bags");
 p.setProductSize(3);
 }
 if( p.productID == 5){
 p.setProductName(itemName[12 + r.nextInt(3)]);
 p.setProductType("Shoes");
 p.setProductSize(3);
 }
 if( p.productID == 6) {
 p.setProductName(itemName[15 + r.nextInt(3)]);
 p.setProductType("Housewares");
 p.setProductSize(5);
 }

 p.setProductSku(1000000 + r.nextInt(9999999));



 return p;
 }

 //Loop to generate an order of products, imports from generateProduct, may export this generated order to a json file.
 public static Product[] createOrder()
 {
 Order order = new Order();
 Random r = new Random();
 int x;
 order.orderNumber++;
 int itemCount = 1 + r.nextInt(50);
 order.orderContents = new Product[itemCount];
 for (x = 0 ; x < itemCount; x++){
 Product item  = productMaker.generateProduct();
 order.orderContents[x] = item;
 }

 return order.orderContents;

 }

 }