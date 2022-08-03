package com.niit.jdp;

//Create a new Java class named SellingPrice in src > main > java > com.niit.jdp.
public class SellingPrice {
        //Create a main method in SellingPrice class.
        public static void main(String[] args) {
//Inside the main() method, declare and initialize the variables and values provided in the table.//
                String itemName = "Rounded Kaisa Bowl";
                double sellingPrice = 10.99;
//Calculate the revised selling price for the given item, store it in a variable, and then display it. //

                double revisedSellingPrice = (sellingPrice*0.05 + sellingPrice );
                System.out.println("Revised Selling Price for Rounded Kaisa Bowl is " + "$" + revisedSellingPrice);

}

}