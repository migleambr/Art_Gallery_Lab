package art_gallery;

import java.util.ArrayList;
import java.util.HashMap;

public class Artwork {

    //  public static void main(String[] args) {

//	    HashMap<String, Double> artwork = new HashMap<>();
//
//        artwork.put("Artist: Fred Smith, Artwork: The Weeping Widow, nft: qqwweerrttyy price: ", 350.0);
//        System.out.println(artwork);
//
//        Double artworkPrice = artwork.get("Artist: Fred Smith, Artwork: The Weeping Widow, nft: qqwweerrttyy price: ");
//        System.out.println(artworkPrice);


    // price is at index 3
    //System.out.println(artwork.indexOf(350));
    //Object[] artwork = {"Artist = Fred Smith", "Title = The Weeping Widow", "nft = qqwweerrttyy", 350};
    //   System.out.println(artwork[3]);



    private String title;
    private String artist;
    private float price;
    private String nft;

    public Artwork() {
        this.artist = "Fred Smith";
        this.title = "The Weeping Widow";
        this.nft = "qqwweerrttyy";
        this.price = 350;
    }

}


//
//    public void getArtworkDetails() {
//        System.out.println("Artist: Fred Smith Artwork: The Weeping Widow nft: qqwweerrttyy price: 350");

// }
