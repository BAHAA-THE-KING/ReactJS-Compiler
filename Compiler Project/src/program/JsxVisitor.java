package program;

import js.SymbolTable.Scope;
import js.SymbolTable.Symbol;
import js.SymbolTable.Symbolable;
import js.expressions.ArrayLiteral.ArrayElement;
import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.Function.AnonymousFunction;
import js.expressions.Function.ArrowFunction;
import js.expressions.IdentifierExpression;
import js.expressions.Literals.ObjectLiteral;
import js.expressions.Properties.ComputedProperty;
import js.expressions.Properties.EllipsisProperty;
import js.expressions.Properties.FunctionProperty;
import js.expressions.Properties.NormalProperty;
import js.statements.Block.BlockModel;
import js.statements.ClassDeclaration.ClassDeclaration;
import js.statements.ClassDeclaration.ClassFieldDefinition;
import js.statements.ClassDeclaration.ClassMethodDefinition;
import js.statements.ClassDeclaration.PropertyName.PropertyByExpression;
import js.statements.ClassDeclaration.PropertyName.PropertyByName;
import js.statements.ClassDeclaration.PropertyName.PropertyByString;
import js.statements.ConditionalStatement.ConditionalStatement;
import js.statements.Function.FunctionDeclaration;
import js.statements.Loops.*;
import js.statements.TryStatement.CatchProduction;
import js.statements.TryStatement.FinallyProduction;
import js.statements.TryStatement.TryStatement;
import js.statements.VariableDeclarationStatement.VariableDeclaration;
import js.statements.VariableDeclarationStatement.VariableDeclarationStatement;
import js.visitors.models.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class JsxVisitor {
    public static List<Symbolable> visit(Statement model) {
        System.out.println(model);
        if (model instanceof BlockModel) {
            return visit((BlockModel) model);
        }
        if (model instanceof VariableDeclarationStatement) {
            return visit((VariableDeclarationStatement) model);
        }
        if (model instanceof TryStatement) {
            return visit((TryStatement) model);
        }
        if (model instanceof CatchProduction) {
            return visit((CatchProduction) model);
        }
        if (model instanceof FinallyProduction) {
            return visit((FinallyProduction) model);
        }
        if (model instanceof ConditionalStatement) {
            return visit((ConditionalStatement) model);
        }
        if (model instanceof ClassDeclaration) {
            return visit((ClassDeclaration) model);
        }
        if (model instanceof ForLoop) {
            return visit((ForLoop) model);
        }
        if (model instanceof ForInLoop) {
            return visit((ForInLoop) model);
        }
        if (model instanceof ForOfLoop) {
            return visit((ForOfLoop) model);
        }
        if (model instanceof WhileLoop) {
            return visit((WhileLoop) model);
        }
        if (model instanceof DoWhileLoop) {
            return visit((DoWhileLoop) model);
        }
        if (model instanceof FunctionDeclaration) {
            return visit((FunctionDeclaration) model);
        }
        if (model instanceof AnonymousFunction) {
            return visit((AnonymousFunction) model);
        }
        if (model instanceof ArrowFunction) {
            return visit((ArrowFunction) model);
        }
        if (model instanceof Property) {
            return visit((Property) model);
        }
        if (model instanceof ArrayLiteral) {
            return visit((ArrayLiteral) model);
        }
        // If the statement type is not recognized, return an empty list
        return new ArrayList<>();
    }


    public static Symbolable visit(JsProgram prog) {

        List<Symbolable> symbolables = new ArrayList<>();
        for (Statement st : prog.statements) {
            if (st != null) {
                symbolables.addAll(visit(st));
            }
        }
        return new Scope(prog.getClass().getSimpleName(), "Main", symbolables);
    }


    public static List<Symbolable> visit(BlockModel model) {
        List<Symbolable> symbolables = new ArrayList<>();
        for (Statement child : model.statements) {
            List<Symbolable> s = visit(child);
            if (s != null) {
                symbolables.addAll(s);
            }
        }
        return listify(new Scope(model.getClass().getSimpleName(), "", symbolables));
    }

    public static List<Symbolable> visit(VariableDeclarationStatement model) {
        List<Symbolable> syms = new ArrayList<>();
        for (VariableDeclaration var : model.vars) {
            if (var.name instanceof ArrayLiteral)
                syms.addAll(Symbol.make(Symbol.VAR, var.name, var.value));
            else
                syms.add(Symbol.make(Symbol.VAR, var.name.toString(), var.value));
        }
        return syms;
    }

    public static List<Symbolable> visit(TryStatement ts) {

        List<Symbolable> symbArray = new ArrayList<>();

        Scope block = (Scope) visit(ts.block).get(0);
        block.type = "tryBlock";
        symbArray.add(block);

        Scope catchBlock;
        if (ts.catchProduction != null) {
            catchBlock = (Scope) visit(ts.catchProduction).get(0);
            symbArray.add(catchBlock);
        }
        Scope finBlock;
        if (ts.finallyProduction != null) {
            finBlock = (Scope) visit(ts.finallyProduction).get(0);
            symbArray.add(finBlock);
        }
        return symbArray;
    }

    public static List<Symbolable> visit(CatchProduction cp) {

        Scope block = (Scope) visit(cp.block).get(0);
        block.type = "catchBlock";
        block.symbolables.add(cp.exception);
        return listify(block);
    }

    public static List<Symbolable> visit(FinallyProduction fp) {

        Scope block = (Scope) visit(fp.block).get(0);
        block.type = "finallyBlock";
        return listify(block);
    }

    public static List<Symbolable> listify(Symbolable s) {
        ArrayList symbArray = new ArrayList<>();
        symbArray.add(s);
        return symbArray;
    }

    public static List<Symbolable> visit(ConditionalStatement ConditionalStatement) {
        List<Symbolable> f = visit(ConditionalStatement.statement);
        Scope ifBlock = new Scope("if", "", f);

        List<Symbolable> e = visit(ConditionalStatement.elseStatement);
        Scope elseBlock = new Scope("else", "", e);
        List<Symbolable> condition = new ArrayList<>();
        condition.add(ifBlock);
        condition.add(elseBlock);
        Scope ConditionalBlock = new Scope("ConditionalStatement", "", condition);
        return listify(ConditionalBlock);
    }

    public static List<Symbolable> visit(ClassDeclaration classDeclaration) {
        ArrayList<Symbolable> symbArray = new ArrayList();
        Scope classBlock;
        for (ClassElement element : classDeclaration.elements) {
            symbArray.addAll(visit(element));
        }
        classBlock = new Scope("class", classDeclaration.id, symbArray);
        return listify(classBlock);
    }

    public static List<Symbolable> visit(ClassElement classElement) {
        if (classElement instanceof ClassFieldDefinition) {
            return visit((ClassFieldDefinition) classElement);
        } else if (classElement instanceof ClassMethodDefinition) {
            return visit((ClassMethodDefinition) classElement);
        } else {
            System.out.println("found null in symbol table visitor , ClassElement");
            return new ArrayList<>();
        }
    }

    public static List<Symbolable> visit(ClassFieldDefinition classFieldDefinition) {
        Symbolable field = Symbol.make(Symbol.ATRIB,
                classFieldDefinition.propertyName.toString(),
                classFieldDefinition.propertyValue != null ? classFieldDefinition.propertyValue : null
        );
        return listify(field);
    }

    public static List<Symbolable> visit(ObjectLiteral ol) {
        System.out.println("xghhjh");
        List<Symbolable> symbArray = new ArrayList<>();
        for (Property p : ol.objectProperties) {
            symbArray.addAll(visit(p));
        }
        return symbArray;
    }

    public static List<Symbolable> visit(Property p) {

        if (p instanceof NormalProperty)
            return visit((NormalProperty) p);

        if (p instanceof ComputedProperty)
            return visit((ComputedProperty) p);

        if (p instanceof FunctionProperty)
            return visit((FunctionProperty) p);

        return visit((EllipsisProperty) p);
    }

    public static List<Symbolable> visit(NormalProperty np) {
        Symbolable symb;
        PropertyName prop = np.key;
        if (prop instanceof PropertyByName) {
            symb = Symbol.make(Symbol.VAR, ((PropertyByName) prop).id, np.value);
        } else if (prop instanceof PropertyByExpression) {
            symb = Symbol.make(Symbol.VAR, ((PropertyByExpression) prop).value.toString(), np.value);
        } else//propertyByString
        {
            symb = Symbol.make(Symbol.VAR,
                    "\"" + ((PropertyByString) prop).value + "\"",
                    np.value);
        }

        return listify(symb);
    }

    public static List<Symbolable> visit(ComputedProperty np) {
        Symbolable symb = Symbol.make(Symbol.VAR, np.key.toString(), np.value);
        return listify(symb);
    }

    public static List<Symbolable> visit(FunctionProperty functionProperty) {
        List<Symbolable> symbolables = new ArrayList<>();
        //add parameters
        for (Assignable name : functionProperty.parameters.keySet()) {
            Expression value = functionProperty.parameters.get(name);
            symbolables.add(Symbol.make(Symbol.PARAM, name.toString(), value));
        }
        //spread parameter
        symbolables.add(Symbol.make("Spread Param", "", functionProperty.spreadParameter));
        //visit the body
        for (Statement s : functionProperty.bodyStatements) {
            symbolables.addAll(visit(s));
        }
        return listify(new Scope("Function", "", symbolables));
    }

    public static List<Symbolable> visit(EllipsisProperty ellipsisProperty) {
        if (ellipsisProperty.value instanceof ObjectLiteral) {
            return visit((ObjectLiteral) ellipsisProperty.value);
        } else if (ellipsisProperty.value instanceof IdentifierExpression) {
            Symbolable symbolable = Symbol.make("EllipsisProperty", ((IdentifierExpression) ellipsisProperty.value).name, "Calculated in runtime");
            return listify(symbolable);
        } else {
            System.out.println("In EllipsisProperty visit, found unknown type");
            return new ArrayList<>();
        }
    }

    public static List<Symbolable> visit(ClassMethodDefinition classMethodDefinition) {
        List<Symbolable> symbolables = new ArrayList<>();
        for (Pair<Assignable, Expression> parameter : classMethodDefinition.parameters.values) {
            symbolables.add(Symbol.make(Symbol.PARAM, parameter.a.toString(), parameter.b != null ? parameter.b : null));
        }
        for (Statement statement : classMethodDefinition.body) {
            symbolables.addAll(visit(statement));
        }
        Scope methodScope = new Scope(Scope.MTHD, classMethodDefinition.propertyName.toString(), symbolables);
        return listify(methodScope);
    }

    public static List<Symbolable> visit(ForLoop loop) {
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(loop.firstPart));
        symbolables.addAll(visit(loop.statement));
        return listify(new Scope("ForLoop", "", symbolables));
    }

    public static List<Symbolable> visit(ForInLoop forInLoop) {
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.firstPart));
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("ForInLoop", "", symbolables));
    }

    public static List<Symbolable> visit(ForOfLoop forInLoop) {
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.firstPart));
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("ForOfLoop", "", symbolables));
    }

    public static List<Symbolable> visit(WhileLoop forInLoop) {
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("WhileLoop", "", symbolables));
    }

    public static List<Symbolable> visit(DoWhileLoop forInLoop) {
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("DoWhileLoop", "", symbolables));
    }

    public static List<Symbolable> visit(FunctionDeclaration functionDeclaration) {
        List<Symbolable> symbolables = new ArrayList<>();
        for (Pair<Assignable, Expression> parameter : functionDeclaration.parameters.values) {
            symbolables.add(Symbol.make(Symbol.PARAM, parameter.a.toString(), parameter.b != null ? parameter.b : null));
        }
        Expression spreadParameter = functionDeclaration.parameters.spreadParameter;
        if (spreadParameter != null) {
            symbolables.add(Symbol.make(Symbol.PARAM, "spreadParameter", spreadParameter));
        }


        for (Statement statement : functionDeclaration.body) {
            symbolables.addAll(visit(statement));
        }
        Scope funcScope = new Scope(Scope.MTHD, functionDeclaration.Identifier, symbolables);

        return listify(funcScope);

    }

    public static List<Symbolable> visit(AnonymousFunction functionDeclaration) {
        List<Symbolable> symbolables = new ArrayList<>();
        for (Pair<Assignable, Expression> parameter : functionDeclaration.parameters.values) {
            symbolables.add(Symbol.make(Symbol.PARAM, parameter.a.toString(), parameter.b != null ? parameter.b : null));
        }
        Expression spreadParameter = functionDeclaration.parameters.spreadParameter;
        if (spreadParameter != null) {
            symbolables.add(Symbol.make(Symbol.PARAM, "spreadParameter", spreadParameter));
        }

        for (Statement statement : functionDeclaration.body) {
            symbolables.addAll(visit(statement));
        }
        Scope funcScope = new Scope(Scope.MTHD, "", symbolables);

        return listify(funcScope);

    }

    public static List<Symbolable> visit(ArrowFunction functionDeclaration) {
        List<Symbolable> symbolables = new ArrayList<>();
        for (Pair<Assignable, Expression> parameter : functionDeclaration.parameters.values) {
            symbolables.add(Symbol.make(Symbol.PARAM, parameter.a.toString(), parameter.b != null ? parameter.b : null));
        }
        Expression spreadParameter = functionDeclaration.parameters.spreadParameter;
        if (spreadParameter != null) {
            symbolables.add(Symbol.make(Symbol.PARAM, "spreadParameter", spreadParameter));
        }

        for (Statement statement : functionDeclaration.body) {
            symbolables.addAll(visit(statement));
        }
        Scope funcScope = new Scope(Scope.MTHD, "", symbolables);

        return listify(funcScope);

    }

    public static List<Symbolable> visit(ArrayLiteral ar) {
        List<Symbolable> symbArray = new ArrayList<>();
        for (ArrayElement ae : ar.elements) {
            symbArray.add(Symbol.make("ArrayElement", "", ae));
        }
        return symbArray;
    }

    public static List<Symbolable> visit(Expression e) {
        return visit((VariableDeclarationStatement) e);
    }
}
