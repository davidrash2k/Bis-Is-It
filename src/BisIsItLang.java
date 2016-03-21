import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import bis.is.it.BisLexer;
import bis.is.it.BisParser;
 
public class BisIsItLang
{

    /**
     * @param args the command line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException
    {
    	BisIsItCustomListener parseListener = new BisIsItCustomListener();
    	BisLexer lexer = new BisLexer(new ANTLRFileStream(args[0]));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BisLexerErrorListener(parseListener));
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	
        BisParser parser = new BisParser(tokens);
        parser.setBuildParseTree(true);
        //parser.setErrorHandler(new BisErrorStrategy());
        parser.removeErrorListeners();
        parser.addErrorListener(new BisParserErrorListener(parseListener));
        parser.addParseListener(parseListener);
        ParserRuleContext t = parser.start();
    }
    
}
