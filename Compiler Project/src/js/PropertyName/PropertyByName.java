package js.PropertyName;

public class PropertyByName implements PropertyName {
    public String id;

    public PropertyByName(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PropertyByName{" + "id='" + id + '\'' + '}';
    }
}
