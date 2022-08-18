package art_gallery;

public class Customers {

    private String name;
    private float wallet;

    public Customers(String name, float wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public float getWallet() {
        return wallet;
    }

    public String getName(){
        return name;
    }
//    public void acceptPayment(Double payment) {
//        wallet -= payment ;
//    }
//
//    public void setNewWallet(float wallet) {
//        this.wallet = wallet;
//    }

    public float getNewWallet(){
        return wallet - 350;
    }







}

