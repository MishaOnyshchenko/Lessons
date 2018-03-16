
public class Pair <T> {

    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
    public void check (){
        if(first instanceof String){
            System.out.println("I'm a String ->" + first +" " + second );
        }else if (first instanceof Integer){
            System.out.println((Integer)first + (Integer)second);
        }

    }
}
