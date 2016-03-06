import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
 
public class midterm
{
  public static void main(String[] args) throws Exception
  {
    ExpCalculatorLexer lexer = new ExpCalculatorLexer(new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ExpCalculatorParser p = new ExpCalculatorParser(tokens);
    p.setBuildParseTree(true);
    p.addParseListener(new ExpCalculatorBaseListener());
    ParserRuleContext t = p.start();
  }
}