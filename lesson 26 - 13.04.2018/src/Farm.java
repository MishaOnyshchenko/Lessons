public class Farm {

    private int product= 0;

    public synchronized void get(){
        while(product < 1){
            try{
                wait();
            }
            catch (InterruptedException exc){
                System.out.println(exc.getMessage());
            }
        }
        product--;
        System.out.println("Dealer bought 1 product");
        System.out.println("We have " + product + " product(s) on the farm");
        notify();
    }

    public synchronized void put(){
        while (product >= 4){
            try{
                wait();
            }
            catch (InterruptedException exc){
                System.out.println(exc.getMessage());
            }
        }
        product++;
        System.out.println("Farmer added 1 product");
        System.out.println("We have " + product + " product(s) on the farm");
        notify();
    }
}
