package classesJava;

public class Outer3 {
 void outerMethod(){

     System.out.println("Outer ");
 }

        class Inner{
            public void show(){

                System.out.println("Ineer method inside outer");
            }
        }

        public static void main(String[] args) {
            Outer.Inner innerCl = new Outer().new Inner();

            Outer out = new Outer();
        }
}