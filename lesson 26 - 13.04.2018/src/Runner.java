public class Runner {
    public static void main(String[] args) {

        Farm farm = new Farm();
        Farmer farmer = new Farmer(farm);
        Dealer dealer = new Dealer(farm);
        new Thread(farmer).start();
        new Thread(dealer).start();
    }
}
