import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by java on 03.07.2018.
 */
public class BoxCoach implements Coach {

    @Autowired
    public String doTrain() {
        System.out.println("I ama boxer coach");
        return "I am a box coach";
    }
}
