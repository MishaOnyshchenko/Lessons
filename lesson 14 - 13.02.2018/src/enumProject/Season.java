package enumProject;

public enum Season {

    WINTER ("Cold season"),
    SPRING ("Cool season"),
    SUMMER ("Hot season"),
    FALL ("Cool season");

    private  String description;

    private Season(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

}
