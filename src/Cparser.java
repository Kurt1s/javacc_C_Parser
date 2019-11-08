/* Generated By:JavaCC: Do not edit this line. Cparser.java */
public class Cparser implements CparserConstants {
  public static void main(String args []) throws ParseException
  {
    Cparser parser = new Cparser(System.in);
    System.out.print("Enter an expression like :\u005cn"
//    + "return_type function_name( parameter list ) {" 
//    + "\n\tbody of the function" 
//    + "\n }\n\nOR\n\n" 
    + "int *ip = 5000;"
    + "\u005cn\u005cnOR\u005cn\u005cn"
    + "struct Books { "
    + "\u005cn\u005ctchar title[50];"
    + "\u005cn\u005ctchar author[50];"
    + "\u005cn\u005ctchar subject[100];"
    + "\u005cn\u005ctint bookID;"
    + "\u005cn\u005ctvoid (*print)(int,int);"
    + "\u005cn};"
    + "\u005cn\u005cnOR\u005cn\u005cn"
    + "void (*functionPtr)(int,int);");
    while (true)
    {
      System.out.println("\u005cnReading from standard input...");
      try
      {
        switch (Cparser.one_line())
        {
          case 0 :
          System.out.println("OK.");
          break;
          case 1 :
          System.out.println("Goodbye.");
          break;
          default :
          break;
        }
      }
      catch (Exception e)
      {
        System.out.println("NOK.");
        System.out.println(e.getMessage());
        Cparser.ReInit(System.in);
      }
      catch (Error e)
      {
        System.out.println("Oops.");
        System.out.println(e.getMessage());
        break;
      }
    }
  }

  static final public int one_line() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRUCT:
    case DATATYPE:
    case RETURNTYPE:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case RETURNTYPE:
        functionPointer();
        break;
      case STRUCT:
        structDef();
        break;
      case DATATYPE:
        pointerDef();
        break;
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    {if (true) return 0;}
      break;
    default:
      jj_la1[1] = jj_gen;
    {if (true) return 1;}
    }
    throw new Error("Missing return statement in function");
  }

  static final public void pointerDef() throws ParseException {
    jj_consume_token(DATATYPE);
    jj_consume_token(ASTERISK);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(15);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CONSTANT:
      jj_consume_token(CONSTANT);
      break;
    case IDENTIFIER:
      jj_consume_token(IDENTIFIER);
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(16);
  }

  static final public void parameterList() throws ParseException {
    jj_consume_token(DATATYPE);
    jj_consume_token(IDENTIFIER);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 17:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_1;
      }
      jj_consume_token(17);
      jj_consume_token(DATATYPE);
      jj_consume_token(IDENTIFIER);
    }
  }

  static final public void body() throws ParseException {
    expr();
  }

  static final public void expr() throws ParseException {
    jj_consume_token(DATATYPE);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(15);
    jj_consume_token(NUMBER);
    jj_consume_token(16);
  }

  static final public void structDef() throws ParseException {
    jj_consume_token(STRUCT);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(18);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DATATYPE:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_2;
      }
      structPropDef();
      jj_consume_token(16);
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case RETURNTYPE:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_3;
      }
      functionPointer();
    }
    jj_consume_token(19);
    jj_consume_token(16);
  }

  static final public void structPropDef() throws ParseException {
    jj_consume_token(DATATYPE);
    jj_consume_token(IDENTIFIER);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 20:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_4;
      }
      jj_consume_token(20);
      jj_consume_token(CONSTANT);
      jj_consume_token(21);
    }
  }

  static final public void functionPrefix() throws ParseException {
    jj_consume_token(RETURNTYPE);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case RETURNTYPE:
      functionPointer();
      break;
    case IDENTIFIER:
      functionDef();
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(16);
  }

  static final public void functionPointer() throws ParseException {
    jj_consume_token(RETURNTYPE);
    jj_consume_token(OPAREN);
    jj_consume_token(ASTERISK);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(CPAREN);
    jj_consume_token(OPAREN);
    jj_consume_token(DATATYPE);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 17:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_5;
      }
      jj_consume_token(17);
      jj_consume_token(DATATYPE);
    }
    jj_consume_token(CPAREN);
    jj_consume_token(16);
  }

  static final public void functionDef() throws ParseException {
    jj_consume_token(IDENTIFIER);
    jj_consume_token(OPAREN);
    parameterList();
    jj_consume_token(CPAREN);
    jj_consume_token(18);
    body();
    jj_consume_token(19);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CparserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[9];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x700,0x700,0x4800,0x20000,0x200,0x400,0x100000,0xc00,0x20000,};
   }

  /** Constructor with InputStream. */
  public Cparser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Cparser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CparserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Cparser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CparserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Cparser(CparserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CparserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[22];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 9; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 22; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
