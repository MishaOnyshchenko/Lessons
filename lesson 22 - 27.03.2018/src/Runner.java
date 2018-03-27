import java.io.File;

public class Runner {
    public static void main(String[] args) {
        File file1 = new File("D:\\Misha3\\work");
        file1.mkdirs();
        File file2 = new File("D:\\Misha3\\done");
        file2.mkdirs();
        File file3 = new File("D:\\Misha3\\error");
        file3.mkdirs();
        System.out.println("Run");


    }
}
