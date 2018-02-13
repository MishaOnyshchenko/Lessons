/**
 * Created by java on 16.01.2018.
 */
public class Main {
    public static void main(String[] args) {


        int [] intMass = new int [5];
        for(int intMas : intMass){
            System.out.print(intMas+" ");
        }

        System.out.println("");

        String [] strMass = new String [5];
        for (String strMas : strMass){
            System.out.print(strMas+"");
        }
        System.out.println("");

        Student student = new Student();
        student.setName("Vasia");

        Student [] studMass = new Student[5];
        studMass[0] = student;

        for (Student strMas : studMass){
            System.out.print(strMas.getName()+" ");
        }



    }
}
