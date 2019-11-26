package fnplot.syntax;

import fnplot.semantics.Visitor;
import fnplot.sys.FnPlotException;

/**
 * Class for exponents
 
 */
public class ExpExpo extends Exp {

    Exp exp1;
    Exp exp2;

    public ExpExpo(Exp e1, Exp e2) {
        exp1 = e1;
        exp2 = e2;
    }

    public Exp getExpL() {
        return exp1;
    }

    public Exp getExpR() {
        return exp2;
    }

    @Override
    public <S, T> T visit(Visitor<S, T> v, S arg) throws FnPlotException {
        return v.visitExpExpo(this, arg);
    }

    @Override
    public String toString() {
        return exp1.toString() + " ^ " + exp2.toString();
    }
}