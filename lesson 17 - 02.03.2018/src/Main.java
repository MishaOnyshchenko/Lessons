
public class Main {

    public static void main(String[] args) {

        Cat muric = new Cat("muric", 2);
        Cat matilda = new Cat("matilda", 1);

        Dog dog = new Dog("gav",3);
        Dog dogic = new Dog("nayda",1);

        Dog [] dogMass = {dog, dogic};
        System.out.println(dogMass.length);
        dogMass[1] = null;
        for (Dog dogMas : dogMass){
            System.out.println(dogMas);
        }

    }
}
