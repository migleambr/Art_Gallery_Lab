import art_gallery.Customers;
import art_gallery.Artwork;
import art_gallery.Gallery;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Customers customer1 = new Customers("John", 400);
        Artwork artwork1 = new Artwork();
        Gallery gallery = new Gallery();

        System.out.println("Hello, " + customer1.getName() + ", you have " + customer1.getWallet() + " pounds!");
        //  artwork1.getArtworkDetails();
        System.out.println("would you like to buy artwork 1?");
        Scanner artDecision = new Scanner(System.in);
        String artChoice = artDecision.nextLine();

        if (artChoice.equals("yes") || artChoice.equals("Yes")) {
            System.out.println("Thank you for your purchase " + customer1.getName() + ", you have been charged " + gallery.getPrice() + " pounds, now you have " + customer1.getNewWallet() + " pounds!");
            System.out.println("money in till = " + gallery.takePay());
        } else if (artChoice.equals("no") || artChoice.equals("No")) {
            System.out.println("We have nothing for you have a nice day");
        }

// Attempt to retrieve artwork price - not working
        // Double artworkPrice = gallery.getArtworkPrice();
        // customer1.acceptPayment(artworkPrice);
        // customer1.setNewWallet(customer1.getWallet());
        // System.out.println("Hello, " + customer1.getName() + ", you have been charged 350 pounds, now you have " + customer1.getWallet() + " pounds!");

        //gallery.takePayment(artworkPrice);
        //System.out.println("Money on the till: " + gallery.getTill());

// Manually inputting artwork price
//      customer1.acceptPayment(350.0);
//      customer1.setNewWallet(customer1.getWallet());
//      System.out.println("Hello, " + customer1.getName() + ", you have been charged 350 pounds, now you have " + customer1.getWallet() + " pounds!");
//
        //gallery.takePayment(350.0);
        //System.out.println("Money on the till: " + gallery.getTill());


        //System.out.println("Hello, " + customer1.getName() + ", you have been charged " + gallery.getPrice() + " pounds, now you have " + customer1.getNewWallet() + " pounds!");
    }
}