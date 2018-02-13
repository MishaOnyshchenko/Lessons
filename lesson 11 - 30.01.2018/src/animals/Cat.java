package animals;


public class Cat extends Animals {

    private String name;
    private String age;
    private String cost;

    public Cat(String name,String headForm) {
        this.name = name;
        super.setHeadForm(headForm);
    }

    @Override
    protected void sayMyHeadFormAndWhatICan() {
        super.sayMyHeadFormAndWhatICan();
        System.out.println(murlyk() + " So I cat and my name is " + getName());
    }

    public String murlyk(){
        return "mur";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return !(name != null ? !name.equals(cat.name) : cat.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
