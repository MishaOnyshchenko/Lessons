public class MoneyUtils {

    //private ATM atm;

    public static void newThradForGetMoney(double sum, ATM my){
        Thread thread = new Thread(){
            @Override
            public void run() {
                my.getMoney(sum);
            }
        };

        thread.start();
    }
}
