import java.io.*;

public class Runner {
    public static void main(String [] args){
        File file1 = new File("D://demo//a//test1.txt");
        File file2 = new File("D://demo//b//test2.txt");


        try(InputStream is = new FileInputStream(file1);
            OutputStream os = new FileOutputStream(file2);){


        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}
