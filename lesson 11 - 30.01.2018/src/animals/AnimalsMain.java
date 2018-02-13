package animals;


import com.sun.org.apache.xpath.internal.SourceTree;

public class AnimalsMain {

    public static void main(String[] args) {
        Cat cat = new Cat("Vasiliy", "Oval");
//        Cat cat1 = new Cat ("Murzik", "Triangle");
//        Cat cat2 = new Cat ("Murzik", "Triangle");
//        Cat cat3 = cat;

//
//        Dog dog = new Dog("Vasiliy", "Oval");
//
//        System.out.println(cat == cat1);
//        System.out.println(cat.equals(cat1));
//
//        System.out.println("--------");
//
//        System.out.println(cat == cat3);
//        System.out.println(cat.equals(cat3));

        System.out.println(cat.hashCode());

        cat.sayMyHeadFormAndWhatICan();
        System.out.println((cat.hashCode()));

        cat.setName("Lolik");
        System.out.println(cat.hashCode());

        cat.setName("Fox");
        System.out.println(cat.hashCode());
        Cat cat3 = new Cat ("Vasiliy", "Oval");
        Dog dog3 = new Dog ("Vasiliy", "Oval");

        Dog [] dogMass = new Dog[3];
        dogMass[0] = dog3;
        //dogMass[1] = cat3;

        Animals cat5 = new Cat ("Vasiliy", "Oval");
        Animals dog5 = new Dog ("Vasiliy", "Oval");


        Animals [] aniMass = new Animals[2];






    }
}
