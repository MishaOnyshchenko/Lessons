package Robotics;


public class Transformer extends Robot {

    private String name;
    protected String transformerField;

    private boolean sword;

    public void fight(){
        if (sword == true){
            System.out.println(super.getName()+" I can fight, my serial number is "+ super.getSerialNumber());
        }
    }

    public boolean isSword() {
        return sword;
    }

    public void setSword(boolean sword) {
        this.sword = sword;
    }

    //@Override
    public String getName() {
        System.out.println("It is trans get name");
        return name;
    }

    //@Override
    public void setName(String name) {
        System.out.println("It is trans set name");
        this.name = name;
    }

    @Override
    public void thinking() {
        //super.thinking();
        System.out.println("But I'm transformer,I'm very smart");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transformer that = (Transformer) o;

        if (sword != that.sword) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return !(transformerField != null ? !transformerField.equals(that.transformerField) : that.transformerField != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (transformerField != null ? transformerField.hashCode() : 0);
        result = 31 * result + (sword ? 1 : 0);
        return result;
    }
}

