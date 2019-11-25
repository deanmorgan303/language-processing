
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package fnplot.syntax;

import java_cup.runtime.*;
import java.io.*;
import java.util.*;
import fnplot.sys.SyntaxFnPlotException;
import fnplot.values.FnPlotValue;
import fnplot.values.FnPlotReal;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class FnPlotParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public FnPlotParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public FnPlotParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public FnPlotParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\042\000\002\002\003\000\002\002\004\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\004" +
    "\000\002\017\003\000\002\017\005\000\002\017\003\000" +
    "\002\006\006\000\002\014\005\000\002\014\003\000\002" +
    "\015\003\000\002\015\003\000\002\007\010\000\002\016" +
    "\005\000\002\012\004\000\002\012\003\000\002\013\005" +
    "\000\002\013\003\000\002\005\006\000\002\020\005\000" +
    "\002\020\005\000\002\020\003\000\002\021\005\000\002" +
    "\021\005\000\002\021\005\000\002\021\003\000\002\023" +
    "\003\000\002\023\003\000\002\022\003\000\002\022\003" +
    "\000\002\022\005\000\002\024\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\063\000\016\004\023\016\021\020\004\033\005\034" +
    "\016\035\014\001\002\000\016\004\023\016\021\020\004" +
    "\033\005\034\016\035\014\001\002\000\024\005\uffe5\010" +
    "\uffe5\011\uffe5\012\uffe5\013\uffe5\014\uffe5\017\uffe5\022\uffe5" +
    "\030\uffe5\001\002\000\022\002\ufffd\004\ufffd\016\ufffd\020" +
    "\ufffd\021\ufffd\033\ufffd\034\ufffd\035\ufffd\001\002\000\022" +
    "\002\ufffe\004\ufffe\016\ufffe\020\ufffe\021\ufffe\033\ufffe\034" +
    "\ufffe\035\ufffe\001\002\000\024\005\uffea\010\uffea\011\uffea" +
    "\012\033\013\034\014\032\017\uffea\022\uffea\030\uffea\001" +
    "\002\000\024\005\uffe3\010\uffe3\011\uffe3\012\uffe3\013\uffe3" +
    "\014\uffe3\017\uffe3\022\uffe3\030\uffe3\001\002\000\004\002" +
    "\063\001\002\000\012\005\ufffb\017\ufffb\022\ufffb\030\ufffb" +
    "\001\002\000\020\010\uffe2\011\uffe2\012\uffe2\013\uffe2\014" +
    "\uffe2\015\060\030\uffe2\001\002\000\020\002\001\004\023" +
    "\016\021\020\004\033\005\034\016\035\014\001\002\000" +
    "\024\005\uffe4\010\uffe4\011\uffe4\012\uffe4\013\uffe4\014\uffe4" +
    "\017\uffe4\022\uffe4\030\uffe4\001\002\000\004\030\056\001" +
    "\002\000\024\005\uffe6\010\uffe6\011\uffe6\012\uffe6\013\uffe6" +
    "\014\uffe6\017\uffe6\022\uffe6\030\uffe6\001\002\000\006\017" +
    "\uffe0\035\044\001\002\000\016\005\ufff9\010\027\011\030" +
    "\017\ufff9\022\ufff9\030\ufff9\001\002\000\016\004\023\016" +
    "\021\020\004\033\005\034\016\035\024\001\002\000\024" +
    "\005\uffe2\010\uffe2\011\uffe2\012\uffe2\013\uffe2\014\uffe2\017" +
    "\uffe2\022\uffe2\030\uffe2\001\002\000\004\005\026\001\002" +
    "\000\024\005\uffe1\010\uffe1\011\uffe1\012\uffe1\013\uffe1\014" +
    "\uffe1\017\uffe1\022\uffe1\030\uffe1\001\002\000\012\004\023" +
    "\033\005\034\016\035\024\001\002\000\012\004\023\033" +
    "\005\034\016\035\024\001\002\000\024\005\uffeb\010\uffeb" +
    "\011\uffeb\012\033\013\034\014\032\017\uffeb\022\uffeb\030" +
    "\uffeb\001\002\000\012\004\023\033\005\034\016\035\024" +
    "\001\002\000\012\004\023\033\005\034\016\035\024\001" +
    "\002\000\012\004\023\033\005\034\016\035\024\001\002" +
    "\000\024\005\uffe8\010\uffe8\011\uffe8\012\uffe8\013\uffe8\014" +
    "\uffe8\017\uffe8\022\uffe8\030\uffe8\001\002\000\024\005\uffe9" +
    "\010\uffe9\011\uffe9\012\uffe9\013\uffe9\014\uffe9\017\uffe9\022" +
    "\uffe9\030\uffe9\001\002\000\024\005\uffe7\010\uffe7\011\uffe7" +
    "\012\uffe7\013\uffe7\014\uffe7\017\uffe7\022\uffe7\030\uffe7\001" +
    "\002\000\024\005\uffec\010\uffec\011\uffec\012\033\013\034" +
    "\014\032\017\uffec\022\uffec\030\uffec\001\002\000\004\017" +
    "\ufff0\001\002\000\006\017\uffe0\022\051\001\002\000\004" +
    "\017\047\001\002\000\004\015\045\001\002\000\016\004" +
    "\023\016\021\020\004\033\005\034\016\035\024\001\002" +
    "\000\006\017\ufff2\022\ufff2\001\002\000\016\004\023\016" +
    "\021\020\004\033\005\034\016\035\024\001\002\000\012" +
    "\005\ufff8\017\ufff8\022\ufff8\030\ufff8\001\002\000\004\035" +
    "\044\001\002\000\004\017\uffee\001\002\000\004\017\ufff1" +
    "\001\002\000\006\017\uffe0\022\051\001\002\000\004\017" +
    "\uffef\001\002\000\022\002\ufffc\004\ufffc\016\ufffc\020\ufffc" +
    "\021\ufffc\033\ufffc\034\ufffc\035\ufffc\001\002\000\022\002" +
    "\uffff\004\uffff\016\uffff\020\uffff\021\uffff\033\uffff\034\uffff" +
    "\035\uffff\001\002\000\016\004\023\016\021\020\004\033" +
    "\005\034\016\035\024\001\002\000\004\030\062\001\002" +
    "\000\022\002\uffed\004\uffed\016\uffed\020\uffed\021\uffed\033" +
    "\uffed\034\uffed\035\uffed\001\002\000\004\002\000\001\002" +
    "\000\020\004\023\016\021\020\004\021\065\033\005\034" +
    "\016\035\014\001\002\000\012\005\ufffa\017\ufffa\022\ufffa" +
    "\030\ufffa\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\063\000\026\002\011\003\014\004\006\005\005\006" +
    "\012\017\016\020\021\021\007\022\017\023\010\001\001" +
    "\000\024\003\063\004\006\005\005\006\012\017\016\020" +
    "\021\021\007\022\017\023\010\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\022\004\056\005\005\006\012\017\016\020" +
    "\021\021\007\022\017\023\010\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\012\042\016" +
    "\041\024\040\001\001\000\002\001\001\000\016\006\012" +
    "\017\024\020\021\021\007\022\017\023\010\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\021\037\022\017\023\010\001\001\000\010\021\030\022" +
    "\017\023\010\001\001\000\002\001\001\000\006\022\036" +
    "\023\010\001\001\000\006\022\035\023\010\001\001\000" +
    "\006\022\034\023\010\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\013\052\024\051\001\001\000\002\001\001" +
    "\000\002\001\001\000\016\006\012\017\045\020\021\021" +
    "\007\022\017\023\010\001\001\000\002\001\001\000\016" +
    "\006\012\017\047\020\021\021\007\022\017\023\010\001" +
    "\001\000\002\001\001\000\004\016\053\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\013\054\024\051\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\016\006\012\017\060\020\021\021\007\022\017\023" +
    "\010\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\022\004\056\005\005\006\012\017\016\020" +
    "\021\021\007\022\017\023\010\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$FnPlotParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$FnPlotParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$FnPlotParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

	  
    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {

		try {
		    return lexer.next_token();
		} catch (java.io.IOException ioe) {
                    String msg = "Line " + lexer.getLine() + ", pos " +
				       lexer.getColumn() +
				       ": Unrecognised token <" +
				       lexer.getText() + ">";
		    throw new SyntaxFnPlotException(msg, ioe);
		}
	  
    }


		FnPlotLexer lexer;

		public FnPlotParser(FnPlotLexer l) {
		    // As of CUP v0.11, need to pass Lexer to superclass
		    super(l);
		    lexer = l;
		}

		public void report_error(String message, Object info) {
		    System.err.println(message);
		}

		public void syntax_error(Symbol cur_token) {
		    System.err.print("Line " + lexer.getLine() +
				     " near char " + lexer.getChar() + ": ");
		    report_error("Syntax error", cur_token);
		    System.err.println ("Last token read is " +
					 lexer.getText());
		}
	    

/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$FnPlotParser$actions {
  private final FnPlotParser parser;

  /** Constructor */
  CUP$FnPlotParser$actions(FnPlotParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$FnPlotParser$do_action_part00000000(
    int                        CUP$FnPlotParser$act_num,
    java_cup.runtime.lr_parser CUP$FnPlotParser$parser,
    java.util.Stack            CUP$FnPlotParser$stack,
    int                        CUP$FnPlotParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$FnPlotParser$result;

      /* select the action based on the action number */
      switch (CUP$FnPlotParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= stmtList 
            {
              ArithProgram RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		StmtSequence s = (StmtSequence)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT = new ArithProgram(s); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).right;
		ArithProgram start_val = (ArithProgram)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).value;
		RESULT = start_val;
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$FnPlotParser$parser.done_parsing();
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // stmtList ::= stmtList stmt 
            {
              StmtSequence RESULT =null;
		int lstleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).left;
		int lstright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).right;
		StmtSequence lst = (StmtSequence)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Statement s = (Statement)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		
		lst.add(s); 
		RESULT = lst;
		
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("stmtList",1, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stmtList ::= stmt 
            {
              StmtSequence RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Statement s = (Statement)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		
		RESULT = new StmtSequence(s);
		
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("stmtList",1, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stmt ::= definition 
            {
              Statement RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		StmtDefinition d = (StmtDefinition)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT = d; 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stmt ::= expression SEMI 
            {
              Statement RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).value;
		 RESULT = e; 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expression ::= letExp 
            {
              Exp RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		StmtLet l = (StmtLet)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT = l; 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("expression",13, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expression ::= LBRACE stmtList RBRACE 
            {
              Exp RESULT =null;
		int bodyleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).left;
		int bodyright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).right;
		StmtSequence body = (StmtSequence)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).value;
		 RESULT = body; 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("expression",13, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expression ::= arithExp 
            {
              Exp RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Exp a = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT = a; 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("expression",13, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // letExp ::= LET bindings IN expression 
            {
              StmtLet RESULT =null;
		int bsleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).left;
		int bsright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).right;
		ArrayList<Binding> bs = (ArrayList<Binding>)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).value;
		int bodyleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int bodyright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Exp body = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		
			RESULT = new StmtLet(bs, body);
           
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("letExp",4, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-3)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // paramlist ::= paramlist COMMA VARIABLE 
            {
              ArrayList<String> RESULT =null;
		int plleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).left;
		int plright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).right;
		ArrayList<String> pl = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 pl.add(v); RESULT=pl; 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("paramlist",10, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // paramlist ::= VARIABLE 
            {
              ArrayList<String> RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 pl.add(v); RESULT=pl; 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("paramlist",10, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // paramlistE ::= paramlist 
            {
              ArrayList<String> RESULT =null;
		int plleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int plright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		ArrayList<String> pl = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT=pl; 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("paramlistE",11, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // paramlistE ::= empty 
            {
              ArrayList<String> RESULT =null;
		 RESULT= new ArrayList<> (); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("paramlistE",11, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // fundef ::= FUN LPAREN paramlistE RPAREN MAPSTO stmtList 
            {
              ExpFuction RESULT =null;
		int plleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-3)).left;
		int plright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-3)).right;
		ArrayList<String> pl = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-3)).value;
		int bodyleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int bodyright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		StmtSequence body = (StmtSequence)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT = new ExpFuction(pl,body); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("fundef",5, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-5)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // binding ::= VARIABLE ASSIGN expression 
            {
              Binding RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		
		RESULT = new Binding(v, e);
	    
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("binding",12, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // bindings ::= binding bindingsAux 
            {
              ArrayList<Binding> RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).right;
		Binding b = (Binding)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).value;
		int blleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int blright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		ArrayList<Binding> bl = (ArrayList<Binding>)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		
		bl.add(0,b);
		RESULT = bl;
	     
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("bindings",8, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // bindings ::= empty 
            {
              ArrayList<Binding> RESULT =null;
		 RESULT = new ArrayList(); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("bindings",8, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // bindingsAux ::= COMMA binding bindingsAux 
            {
              ArrayList<Binding> RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).right;
		Binding b = (Binding)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).value;
		int blleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int blright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		ArrayList<Binding> bl = (ArrayList<Binding>)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		
		  bl.add(0,b);
		  RESULT = bl;
		
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("bindingsAux",9, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // bindingsAux ::= empty 
            {
              ArrayList<Binding> RESULT =null;
		 RESULT = new ArrayList(); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("bindingsAux",9, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // definition ::= VARIABLE ASSIGN expression SEMI 
            {
              StmtDefinition RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-3)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-3)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).value;
		
		   RESULT = new StmtDefinition(v, e);
		
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("definition",3, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-3)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // arithExp ::= arithExp PLUS term 
            {
              Exp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Exp t = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		
			RESULT = new ExpAdd(e, t); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("arithExp",14, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // arithExp ::= arithExp MINUS term 
            {
              Exp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Exp t = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		
			RESULT = new ExpSub(e, t); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("arithExp",14, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // arithExp ::= term 
            {
              Exp RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Exp t = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT = t; 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("arithExp",14, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // term ::= term MUL factor 
            {
              Exp RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).right;
		Exp t = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Exp f = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		
		RESULT = new ExpMul(t, f); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("term",15, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // term ::= term DIV factor 
            {
              Exp RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).right;
		Exp t = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Exp f = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		
		RESULT = new ExpDiv(t, f); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("term",15, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // term ::= term MOD factor 
            {
              Exp RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).right;
		Exp t = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Exp f = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		
		RESULT = new ExpMod(t, f); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("term",15, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // term ::= factor 
            {
              Exp RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Exp f = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT = f; 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("term",15, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // number ::= INTEGER 
            {
              FnPlotValue< ? > RESULT =null;
		int ilitleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int ilitright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Integer ilit = (Integer)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT = FnPlotValue.make(ilit); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("number",17, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // number ::= DOUBLE 
            {
              FnPlotValue< ? > RESULT =null;
		int ilitleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int ilitright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		Double ilit = (Double)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT = FnPlotReal.make(ilit); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("number",17, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // factor ::= number 
            {
              Exp RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		FnPlotValue< ? > n = (FnPlotValue< ? >)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT = new ExpLit(n); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("factor",16, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // factor ::= VARIABLE 
            {
              Exp RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).left;
		int varright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()).right;
		String var = (String)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.peek()).value;
		 RESULT = new ExpVar(var); 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("factor",16, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // factor ::= LPAREN expression RPAREN 
            {
              Exp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-1)).value;
		 RESULT = e; 
              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("factor",16, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.elementAt(CUP$FnPlotParser$top-2)), ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // empty ::= 
            {
              Object RESULT =null;

              CUP$FnPlotParser$result = parser.getSymbolFactory().newSymbol("empty",18, ((java_cup.runtime.Symbol)CUP$FnPlotParser$stack.peek()), RESULT);
            }
          return CUP$FnPlotParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$FnPlotParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$FnPlotParser$do_action(
    int                        CUP$FnPlotParser$act_num,
    java_cup.runtime.lr_parser CUP$FnPlotParser$parser,
    java.util.Stack            CUP$FnPlotParser$stack,
    int                        CUP$FnPlotParser$top)
    throws java.lang.Exception
    {
              return CUP$FnPlotParser$do_action_part00000000(
                               CUP$FnPlotParser$act_num,
                               CUP$FnPlotParser$parser,
                               CUP$FnPlotParser$stack,
                               CUP$FnPlotParser$top);
    }
}

}
