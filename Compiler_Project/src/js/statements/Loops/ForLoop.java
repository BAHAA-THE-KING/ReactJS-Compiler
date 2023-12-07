package js.statements.Loops;

import js.visitors.models.IterationStatement;
import js.visitors.models.Statement;

public class ForLoop implements IterationStatement {
    Statement firstPart;
    Statement secondPart;
    Statement thirdPart;
    Statement statement;

    public ForLoop(Statement firstPart, Statement secondPart, Statement thirdPart, Statement statement) {
        this.firstPart = firstPart;
        this.secondPart = secondPart;
        this.thirdPart = thirdPart;
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "ForLoop{" + "firstPart=" + firstPart + ", secondPart=" + secondPart + ", thirdPart=" + thirdPart + ", statements=" + statement + '}';
    }
}
