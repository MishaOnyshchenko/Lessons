package animals;

public class Animals {

    private String headForm;

    private String breath(){
        return "I can breath";
    }

    protected void sayMyHeadFormAndWhatICan(){
        System.out.println("my head form is " + this.headForm + " , "+ breath());
    }

    public Animals() {

    }

    public String getHeadForm() {
        return headForm;
    }

    public void setHeadForm(String headForm) {
        this.headForm = headForm;
    }
}
