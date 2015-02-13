
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Feb 12 23:11:24 COT 2015
//----------------------------------------------------

package clases;

import java_cup.runtime.*;
import javax.swing.JOptionPane;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Feb 12 23:11:24 COT 2015
  */
public class ParserSintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserSintactico() {super();}

  /** Constructor which sets the default scanner. */
  public ParserSintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\002\004\000\002\002\005\000\002\003" +
    "\003\000\002\003\003\000\002\004\005\000\002\005\005" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\004\010\004\001\002\000\006\005\007\006" +
    "\011\001\002\000\004\002\006\001\002\000\004\002\001" +
    "\001\002\000\004\007\017\001\002\000\004\004\ufffe\001" +
    "\002\000\004\007\015\001\002\000\004\004\014\001\002" +
    "\000\004\004\uffff\001\002\000\004\002\000\001\002\000" +
    "\004\011\016\001\002\000\004\004\ufffc\001\002\000\004" +
    "\011\020\001\002\000\004\004\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\004\002\004\001\001\000\010\003\011\004" +
    "\012\005\007\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserSintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserSintactico$actions(this);
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
    return action_obj.CUP$ParserSintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




   

   @Override
    public void syntax_error(Symbol sy){
        Token t=(Token)sy.value;
    

        done_parsing();
        report_error("Error sintáctico cerca de \""+ t.getCadena()+"\" : ["+t.getRow()+" : "+t.getCol()+"]",null+" falta el simbolo "+t.toString());
        
        
	}

       public void report_error(String message, Object info) {
     
         StringBuilder m = new StringBuilder("Error");
         
            System.out.println(info.toString());
        if("#7".equals(info.toString())){
                message=("Error falta un =");
            }
        if("#3".equals(info.toString())){
                message=("Falta el comando Udrazma");
            }
        if("#4".equals(info.toString())){
                message=("Falta el comando Udrazma");
            }
        if("#5".equals(info.toString())){
                message=("Falta  un operador de idioma Dothraki/Valyrio");
            }

        
        m.append(" : "+message);
        System.err.println(m);
         JOptionPane.showMessageDialog(null, message);
         
     }
        
        

    
}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserSintactico$actions {
  private final ParserSintactico parser;

  /** Constructor */
  CUP$ParserSintactico$actions(ParserSintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserSintactico$do_action(
    int                        CUP$ParserSintactico$act_num,
    java_cup.runtime.lr_parser CUP$ParserSintactico$parser,
    java.util.Stack            CUP$ParserSintactico$stack,
    int                        CUP$ParserSintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserSintactico$result;

      /* select the action based on the action number */
      switch (CUP$ParserSintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // valyrio ::= OperadorValyrio Asigna Traduccion 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$ParserSintactico$stack.peek()).value;
		
                     RESULT= new Orden("Valyrio", e.getCadena());
                     
                       
                
              CUP$ParserSintactico$result = parser.getSymbolFactory().newSymbol("valyrio",3, ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.elementAt(CUP$ParserSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()), RESULT);
            }
          return CUP$ParserSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // dothraki ::= OperadorDothraki Asigna Traduccion 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$ParserSintactico$stack.peek()).value;
		
                     RESULT= new Orden("Dothraki", e.getCadena());
                   
                
              CUP$ParserSintactico$result = parser.getSymbolFactory().newSymbol("dothraki",2, ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.elementAt(CUP$ParserSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()), RESULT);
            }
          return CUP$ParserSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // linea ::= valyrio 
            {
              Object RESULT =null;

              CUP$ParserSintactico$result = parser.getSymbolFactory().newSymbol("linea",1, ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()), RESULT);
            }
          return CUP$ParserSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // linea ::= dothraki 
            {
              Object RESULT =null;

              CUP$ParserSintactico$result = parser.getSymbolFactory().newSymbol("linea",1, ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()), RESULT);
            }
          return CUP$ParserSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // estructura ::= Ejecutar linea FinSentencia 
            {
              Object RESULT =null;

              CUP$ParserSintactico$result = parser.getSymbolFactory().newSymbol("estructura",0, ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.elementAt(CUP$ParserSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()), RESULT);
            }
          return CUP$ParserSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= estructura EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.elementAt(CUP$ParserSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.elementAt(CUP$ParserSintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserSintactico$stack.elementAt(CUP$ParserSintactico$top-1)).value;
		RESULT = start_val;
              CUP$ParserSintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.elementAt(CUP$ParserSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserSintactico$parser.done_parsing();
          return CUP$ParserSintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
