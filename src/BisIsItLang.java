import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
 
public class BisIsItLang
{

    /**
     * @param args the command line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException
    {
    	ExpCalculatorBaseListener parseListener = new ExpCalculatorBaseListener();
    	ExpCalculatorLexer lexer = new ExpCalculatorLexer(new ANTLRFileStream(args[0]));
        /*lexer.removeErrorListeners();
        lexer.addErrorListener(new ExpLexerErrorListener(parseListener));*/
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	
        ExpCalculatorParser parser = new ExpCalculatorParser(tokens);
        parser.setBuildParseTree(true);
        //parser.setErrorHandler(new ExpErrorStrategy());
        /*parser.removeErrorListeners();
        parser.addErrorListener(new ExpParserErrorListener(parseListener));*/
        parser.addParseListener(parseListener);
        ParserRuleContext t = parser.start();
    }
    
}
