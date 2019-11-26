package fnplot.syntax;

import fnplot.semantics.Visitor;
import fnplot.sys.FnPlotException;
import java.util.ArrayList;

/**
 *Function call
 */
public class ExpFuncall  extends Exp {
    String name;
    ArrayList<Exp> argList;
    public ExpFuncall(String name,ArrayList<Exp> argList){
       this.name=name;
       this.argList=argList;
    } 
    
    public String getName(){
        return name;
    }  
    
    public ArrayList<Exp> getArguments() {
        return argList;
    }  

    @Override
    public <S, T> T visit(Visitor<S, T> v, S arg) throws FnPlotException {
        return v.visitExpFuncall(this, arg);
    }
   @Override 
   public String toString() {
       StringBuilder argStr=new StringBuilder("");
       int n = argList.size(); 

       if (n>0) {
           argStr.append(argList.get(0));
           for (int i= 1; i < n; i++){
               argStr.append(",");
               argStr.append(argList.get(i));
           }
        }
        return String.format("%s(%s)",name,argStr);
   }
}
