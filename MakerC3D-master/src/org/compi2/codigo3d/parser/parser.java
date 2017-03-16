
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Mar 15 21:54:28 CST 2017
//----------------------------------------------------

package org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Mar 15 21:54:28 CST 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\004\002\000\002\002" +
    "\004\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\005\000\002\003\004\000" +
    "\002\003\005\000\002\003\005\000\002\003\005\000\002" +
    "\003\005\000\002\003\005\000\002\003\005\000\002\003" +
    "\005\000\002\005\002\000\002\003\006\000\002\006\002" +
    "\000\002\003\006\000\002\003\004\000\002\003\003\000" +
    "\002\003\003\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\016\004\000\005\000\006\000\010\000\014" +
    "\000\024\000\001\002\000\016\004\007\005\014\006\013" +
    "\010\011\014\012\024\010\001\002\000\004\002\006\001" +
    "\002\000\004\002\001\001\002\000\040\002\uffec\007\uffec" +
    "\010\uffec\011\uffec\012\uffec\013\uffec\015\uffec\016\uffec\017" +
    "\uffec\020\uffec\021\uffec\022\uffec\023\uffec\025\uffec\026\uffec" +
    "\001\002\000\016\004\007\005\014\006\013\010\011\014" +
    "\012\024\010\001\002\000\016\004\007\005\014\006\013" +
    "\010\011\014\012\024\010\001\002\000\016\004\007\005" +
    "\014\006\013\010\011\014\012\024\010\001\002\000\040" +
    "\002\uffea\007\uffea\010\uffea\011\uffea\012\uffea\013\uffea\015" +
    "\uffea\016\uffea\017\uffea\020\uffea\021\uffea\022\uffea\023\uffea" +
    "\025\uffea\026\uffea\001\002\000\040\002\uffeb\007\uffeb\010" +
    "\uffeb\011\uffeb\012\uffeb\013\uffeb\015\uffeb\016\uffeb\017\uffeb" +
    "\020\uffeb\021\uffeb\022\uffeb\023\uffeb\025\uffeb\026\uffeb\001" +
    "\002\000\036\002\uffff\007\025\010\017\011\024\012\026" +
    "\013\021\016\022\017\030\020\020\021\027\022\032\023" +
    "\023\025\031\026\016\001\002\000\016\004\uffef\005\uffef" +
    "\006\uffef\010\uffef\014\uffef\024\uffef\001\002\000\016\004" +
    "\007\005\014\006\013\010\011\014\012\024\010\001\002" +
    "\000\016\004\007\005\014\006\013\010\011\014\012\024" +
    "\010\001\002\000\016\004\007\005\014\006\013\010\011" +
    "\014\012\024\010\001\002\000\016\004\007\005\014\006" +
    "\013\010\011\014\012\024\010\001\002\000\016\004\007" +
    "\005\014\006\013\010\011\014\012\024\010\001\002\000" +
    "\016\004\007\005\014\006\013\010\011\014\012\024\010" +
    "\001\002\000\016\004\007\005\014\006\013\010\011\014" +
    "\012\024\010\001\002\000\016\004\007\005\014\006\013" +
    "\010\011\014\012\024\010\001\002\000\016\004\007\005" +
    "\014\006\013\010\011\014\012\024\010\001\002\000\016" +
    "\004\007\005\014\006\013\010\011\014\012\024\010\001" +
    "\002\000\016\004\ufff1\005\ufff1\006\ufff1\010\ufff1\014\ufff1" +
    "\024\ufff1\001\002\000\016\004\007\005\014\006\013\010" +
    "\011\014\012\024\010\001\002\000\040\002\ufff3\007\025" +
    "\010\017\011\024\012\026\013\021\015\ufff3\016\ufff3\017" +
    "\ufff3\020\ufff3\021\ufff3\022\ufff3\023\ufff3\025\ufff3\026\ufff3" +
    "\001\002\000\016\004\007\005\014\006\013\010\011\014" +
    "\012\024\010\001\002\000\040\002\ufff0\007\025\010\017" +
    "\011\024\012\026\013\021\015\ufff0\016\022\017\030\020" +
    "\020\021\027\022\032\023\023\025\ufff0\026\016\001\002" +
    "\000\040\002\ufff6\007\025\010\017\011\024\012\026\013" +
    "\021\015\ufff6\016\ufff6\017\ufff6\020\ufff6\021\ufff6\022\ufff6" +
    "\023\ufff6\025\ufff6\026\ufff6\001\002\000\040\002\ufff4\007" +
    "\025\010\017\011\024\012\026\013\021\015\ufff4\016\ufff4" +
    "\017\ufff4\020\ufff4\021\ufff4\022\ufff4\023\ufff4\025\ufff4\026" +
    "\ufff4\001\002\000\040\002\ufffb\007\ufffb\010\ufffb\011\ufffb" +
    "\012\ufffb\013\021\015\ufffb\016\ufffb\017\ufffb\020\ufffb\021" +
    "\ufffb\022\ufffb\023\ufffb\025\ufffb\026\ufffb\001\002\000\040" +
    "\002\ufffe\007\ufffe\010\ufffe\011\024\012\026\013\021\015" +
    "\ufffe\016\ufffe\017\ufffe\020\ufffe\021\ufffe\022\ufffe\023\ufffe" +
    "\025\ufffe\026\ufffe\001\002\000\040\002\ufffc\007\ufffc\010" +
    "\ufffc\011\ufffc\012\ufffc\013\021\015\ufffc\016\ufffc\017\ufffc" +
    "\020\ufffc\021\ufffc\022\ufffc\023\ufffc\025\ufffc\026\ufffc\001" +
    "\002\000\040\002\ufff2\007\025\010\017\011\024\012\026" +
    "\013\021\015\ufff2\016\ufff2\017\ufff2\020\ufff2\021\ufff2\022" +
    "\ufff2\023\ufff2\025\ufff2\026\ufff2\001\002\000\040\002\ufff7" +
    "\007\025\010\017\011\024\012\026\013\021\015\ufff7\016" +
    "\ufff7\017\ufff7\020\ufff7\021\ufff7\022\ufff7\023\ufff7\025\ufff7" +
    "\026\ufff7\001\002\000\040\002\ufffa\007\ufffa\010\ufffa\011" +
    "\ufffa\012\ufffa\013\021\015\ufffa\016\ufffa\017\ufffa\020\ufffa" +
    "\021\ufffa\022\ufffa\023\ufffa\025\ufffa\026\ufffa\001\002\000" +
    "\040\002\ufff5\007\025\010\017\011\024\012\026\013\021" +
    "\015\ufff5\016\ufff5\017\ufff5\020\ufff5\021\ufff5\022\ufff5\023" +
    "\ufff5\025\ufff5\026\ufff5\001\002\000\040\002\ufffd\007\ufffd" +
    "\010\ufffd\011\024\012\026\013\021\015\ufffd\016\ufffd\017" +
    "\ufffd\020\ufffd\021\ufffd\022\ufffd\023\ufffd\025\ufffd\026\ufffd" +
    "\001\002\000\016\004\007\005\014\006\013\010\011\014" +
    "\012\024\010\001\002\000\040\002\uffee\007\025\010\017" +
    "\011\024\012\026\013\021\015\uffee\016\022\017\030\020" +
    "\020\021\027\022\032\023\023\025\uffee\026\uffee\001\002" +
    "\000\036\007\025\010\017\011\024\012\026\013\021\015" +
    "\053\016\022\017\030\020\020\021\027\022\032\023\023" +
    "\025\031\026\016\001\002\000\040\002\ufff8\007\ufff8\010" +
    "\ufff8\011\ufff8\012\ufff8\013\ufff8\015\ufff8\016\ufff8\017\ufff8" +
    "\020\ufff8\021\ufff8\022\ufff8\023\ufff8\025\ufff8\026\ufff8\001" +
    "\002\000\040\002\ufff9\007\ufff9\010\ufff9\011\024\012\026" +
    "\013\021\015\ufff9\016\ufff9\017\ufff9\020\ufff9\021\ufff9\022" +
    "\ufff9\023\ufff9\025\ufff9\026\ufff9\001\002\000\040\002\uffed" +
    "\007\025\010\017\011\024\012\026\013\021\015\uffed\016" +
    "\022\017\030\020\020\021\027\022\032\023\023\025\uffed" +
    "\026\uffed\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\006\002\004\004\003\001\001\000\004\003" +
    "\014\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\003\054\001\001\000\004\003\053\001" +
    "\001\000\004\003\051\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\006\047\001\001\000" +
    "\004\003\046\001\001\000\004\003\045\001\001\000\004" +
    "\003\044\001\001\000\004\003\043\001\001\000\004\003" +
    "\042\001\001\000\004\003\041\001\001\000\004\003\040" +
    "\001\001\000\004\003\037\001\001\000\004\003\036\001" +
    "\001\000\004\003\035\001\001\000\004\005\033\001\001" +
    "\000\004\003\032\001\001\000\002\001\001\000\004\003" +
    "\034\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\003\050\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


//Codigo visible

    public void syntax_error(Symbol s){
        System.err.println(s);
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.err.println("T.T");
        System.err.println(s);
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

//Codigo de acciones
      

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion ::= DECIMAL 
            {
              NodoC3D RESULT =null;
		int decimalleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int decimalright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String decimal = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  
                        RESULT = new NodoC3D(); 
                        RESULT.cad = decimal;
                        RESULT.v ="";
                        RESULT.f= "";
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion ::= ENTERO 
            {
              NodoC3D RESULT =null;
		int enteroleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int enteroright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String entero = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        RESULT = new NodoC3D(); 
                        RESULT.cad = entero;
                        RESULT.v ="";
                        RESULT.f ="";
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion ::= ID 
            {
              NodoC3D RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        RESULT = new NodoC3D(); 
                        RESULT.cad = id;
                        RESULT.v ="";
                        RESULT.f ="";
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion ::= NOT expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                       // String temp = ControlC3D.generaTemp();
                        //String c3d = ex+ " = ! " + exp.getCad() + ";\n";
                       // ControlC3D.agregarC3D(exp.getCad()); 
                        RESULT = new NodoC3D();
                        RESULT.v = exp.f ;
                        RESULT.f = exp.v;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion ::= expresion AND NT$2 expresion 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        //String c3d = izq.getCad() + izq.v +":\n"+  der.getCad();
                       //ControlC3D.agregarC3D(c3d);
                       // String temp = ControlC3D.generaTemp();
                        RESULT = new NodoC3D();
                        RESULT.v = der.v;
                        RESULT.f = izq.f + ","+ der.f ;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // NT$2 ::= 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 ControlC3D.agregarC3D(izq.v+":\n"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion ::= expresion OR NT$1 expresion 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                       // String c3d = izq.getCad() + izq.f +":\n"+ der.getCad();
                        //String c3d = izq.getCad() + izq.f +":\n"+ der.getCad();
                        //ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D();
                        RESULT.v = izq.v + "," + der.v;
                        RESULT.f = der.f;
                       
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // NT$1 ::= 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 ControlC3D.agregarC3D(izq.f+":\n"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion ::= expresion MAYOR_IGUAL expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        String l1 =ControlC3D.generaL();
                        String l2 =ControlC3D.generaL();
                        RESULT = new NodoC3D();     
                        RESULT.cad = "if " + izq.getCad() + ">=" + der.getCad() + " then go to " + l1 + "\n go to " + l2+";\n";
                        ControlC3D.agregarC3D(RESULT.cad);
                        RESULT.v =l1;
                        RESULT.f =l2;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion ::= expresion MENOR_IGUAL expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        String l1 =ControlC3D.generaL();
                        String l2 =ControlC3D.generaL();
                        RESULT = new NodoC3D();     
                        RESULT.cad = "if " + izq.getCad() + "<=" + der.getCad() + " then go to " + l1 + "\n go to " + l2+";\n";
                        ControlC3D.agregarC3D(RESULT.cad);
                        RESULT.v =l1;
                        RESULT.f =l2;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expresion ::= expresion MAYOR expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        String l1 =ControlC3D.generaL();
                        String l2 =ControlC3D.generaL();
                        RESULT = new NodoC3D();     
                        RESULT.cad = "if " + izq.getCad() + ">" + der.getCad() + " then go to " + l1 + "\n go to " + l2+";\n";
                        ControlC3D.agregarC3D(RESULT.cad);
                        RESULT.v =l1;
                        RESULT.f =l2;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expresion ::= expresion MENOR expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        String l1 =ControlC3D.generaL();
                        String l2 =ControlC3D.generaL();
                        RESULT = new NodoC3D();     
                        RESULT.cad ="if " + izq.getCad() + "<" + der.getCad() + " then go to " + l1 + "\n go to " + l2+";\n";
                        ControlC3D.agregarC3D(RESULT.cad);
                        RESULT.v =l1;
                        RESULT.f =l2;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expresion ::= expresion DIFERENTE expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        String l1 =ControlC3D.generaL();
                        String l2 =ControlC3D.generaL();
                        RESULT = new NodoC3D();     
                        RESULT.cad ="if " + izq.getCad() + "!=" + der.getCad() + " then go to " + l1 + "\n go to " + l2+";\n";
                        ControlC3D.agregarC3D(RESULT.cad);
                        RESULT.v =l1;
                        RESULT.f =l2;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expresion ::= expresion IGUAL_IGUAL expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        String l1 =ControlC3D.generaL();
                        String l2 =ControlC3D.generaL();
                        RESULT = new NodoC3D();     
                        RESULT.cad ="if " + izq.getCad() + "==" + der.getCad() + " then go to " + l1 + "\n go to " + l2+";\n";
                        ControlC3D.agregarC3D(RESULT.cad);
                        RESULT.v =l1;
                        RESULT.f =l2;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expresion ::= PAR_IZQ expresion PAR_DER 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 
                        RESULT = new NodoC3D();
                        RESULT.cad = exp.cad;
                        RESULT.v = exp.v;
                        RESULT.f = exp.f;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expresion ::= MENOS expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = - " + exp.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(); 
                        RESULT.cad = temp; 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expresion ::= expresion POT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " ^ " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(); 
                        RESULT.cad = temp;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expresion ::= expresion DIV expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " / " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(); 
                        RESULT.cad = temp;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expresion ::= expresion MULT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " * " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(); 
                        RESULT.cad = temp;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expresion ::= expresion MENOS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " - " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(); 
                        RESULT.cad = temp;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expresion ::= expresion MAS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " + " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(); 
                        RESULT.cad = temp;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicial ::= NT$0 expresion 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        RESULT = exp;
                     // ControlC3D.agregarC3D(exp.getCad());
                        
                        ControlC3D.agregarC3D("\n\n V: "+exp.v + "\n F: "+  exp.f);
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicial",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              NodoC3D RESULT =null;
 ControlC3D.reiniciar(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D start_val = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

