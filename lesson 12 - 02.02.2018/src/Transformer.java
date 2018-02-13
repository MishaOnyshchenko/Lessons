import components.Body;
import components.Hand;
import components.Head;
import components.Leg;

/**
 * Created by java on 02.02.2018.
 */
public class Transformer extends Robot {

    private String TransformerParam;

    public Transformer(Head head, Body body, Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg, String transformerParam) {
        super(head, body, leftHand, rightHand, leftLeg, rightLeg);
        TransformerParam = transformerParam;
    }

    public String getTransformerParam() {
        return TransformerParam;
    }

    public void setTransformerParam(String transformerParam) {
        TransformerParam = transformerParam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Transformer that = (Transformer) o;

        return !(TransformerParam != null ? !TransformerParam.equals(that.TransformerParam) : that.TransformerParam != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (TransformerParam != null ? TransformerParam.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Transformer{" +
                "TransformerParam='" + TransformerParam + '\'' +
                "} " + super.toString();
    }
}
