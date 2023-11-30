package js.PropertyName;

public class PropertyByString implements PropertyName {
    public String value;

    public PropertyByString(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PropertyByString{" + "value='" + value + '\'' + '}';
    }
}
