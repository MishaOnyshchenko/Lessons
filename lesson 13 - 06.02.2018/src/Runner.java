
public class Runner {

    public static void main(String[] args) {

        Bird eagle = new Eagle();
        Bird duck = new Duck();
        Bird rubberDuck = new RubberDuck();


        Bird [] birds = new Bird[3];
        birds[0] = eagle;
        birds[1] = duck;
        birds[3] = rubberDuck;

        for (Bird bird : birds) {
            //bird.sound();
        }

        CreateEggs penguin = new Penguin();
        CreateEggs ducks = new Duck();

        CreateEggs [] mass = new CreateEggs[2];
        mass[0] = penguin;
        mass[1] = ducks;

        for(CreateEggs mas : mass){
            mas.createEggs();
        }
    }
}
