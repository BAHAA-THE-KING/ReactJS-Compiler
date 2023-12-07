package js.expressions.Literals;

import js.visitors.models.Literal;

import java.math.BigDecimal;

public class DecimalLiteral implements Literal {
    public double value;
    public String decimalType;

    public DecimalLiteral(String value) {
        this.value = Double.parseDouble(value);
        this.decimalType= (Math.floor(this.value) == this.value)?"Integer":"float";
    }
}
