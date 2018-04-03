
public class MarketNews extends Thread {

    public MarketNews(String threadName) {
        super(threadName); // name your thread
    }

    public void run() {
        try{
            for(int i = 0; i <10; i++){
                sleep(700);
            }
        }
        catch(InterruptedException e){System.out.println(
                "The stock market is improving!");}

    }
}