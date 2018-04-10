
public class RunAtm {
    public static void main(String[] args) {

//        ATM my = new ATM(400);
//
//        Thread thread = new Thread(){
//            @Override
//            public void run(){
//                my.getMoney(300);
//            }
//        };
//        thread.start();
//
//        Thread thread2 = new Thread(){
//            @Override
//            public void run(){
//                my.getMoney(300);
//            }
//        };
//        thread2.start();
//
//        Thread thread3 = new Thread(){
//            @Override
//            public void run(){
//                my.getMoney(700);
//            }
//        };
//        thread3.start();

        ATM my = new ATM();

        MoneyUtils.newThradForGetMoney(700,my);
        MoneyUtils.newThradForGetMoney(350,my);
        MoneyUtils.newThradForGetMoney(800,my);
    }
}
