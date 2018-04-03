import java.io.*;
import java.net.*;
import java.nio.*;
import java.util.*;

public class Runner {

    public static void main(String[] args)throws IOException {
//        InputStream in =new URL("https://www.google.com.ua").openStream();
//        String s = "";
//        try {
//            InputStreamReader inR = new InputStreamReader(in);
//            BufferedReader buf = new BufferedReader(inR);
//            String line;
//            while ((line = buf.readLine()) != null) {
//                s += line;
//                System.out.println(line);
//            }
//        } finally {
//            in.close();
//        }
//        System.out.println(s);

        Thread th = new Thread();
        th.start();

        MarketNews mn = new MarketNews("Market News");
        mn.start();

        Portfolio p = new Portfolio("Portfolio data");
        p.start();

        System.out.println("TestThreads is finished");

    }
}
