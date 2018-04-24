
public class Runner {

    public static void main(String[] args) {

        User user = new User("Vasya", 44, true);
        System.out.println(user);
        User user1 = new User.UserBuilder().age(53).build();
        System.out.println(user1);




    }
}
