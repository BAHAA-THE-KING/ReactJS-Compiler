package js.expressions.Literals;

import js.visitors.models.Literal;

import java.math.BigDecimal;

public class DecimalLiteral implements Literal {
    private final String className = this.getClass().getSimpleName();
    public double value;
    public String decimalType;

    public DecimalLiteral(String value) {
        this.value = Double.parseDouble(value);
        this.decimalType= (Math.floor(this.value) == this.value)?"Integer":"float";
    }

    @Override
    public String toString() {
        return "DecimalLiteral{" +
                ", value=" + value +
                ", decimalType='" + decimalType + '\'' +
                '}';
    }
}
