/**
 * Created by Alexander_Petrovskiy on 5/17/2016.
 */
public class SimpleClass {
    boolean bField;
    String sField;
    public SimpleClass(boolean boolData) {
        bField = boolData;
    }
    public SimpleClass(String stringData) {
        sField = stringData;
    }

    public boolean getBooleanData() {
        return bField;
    }

    public String getStringData() {
        return sField;
    }
}
