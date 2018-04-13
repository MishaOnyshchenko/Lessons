public class Farmer implements Runnable {

    private Farm farm;

    public Farmer(Farm farm){
        this.farm = farm;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++){
            farm.put();
        }
    }
}
