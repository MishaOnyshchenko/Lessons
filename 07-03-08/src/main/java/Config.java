/**
 * Created by java on 03.07.2018.
 */
public class Config {

    public FortuneService fortuneServiceImp(){
        return  new FortuneSrviceImpl();
    }


    @Bean
    public  BoxCoach boxCoach(){
        return new BoxCoach(fortuneServiceImp());
    }
}
