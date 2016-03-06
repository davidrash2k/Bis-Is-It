import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

public class ExpErrorStrategy extends DefaultErrorStrategy {
	
	public void recover(Parser recognizer, RecognitionException e) {
        
        super.recover(recognizer, e);

        CommonTokenStream tokenStream = (CommonTokenStream)recognizer.getInputStream();

        
        if (tokenStream.LA(1) == ExpCalculatorParser.RULE_statement)
        {
            // Get the next possible tokens
            IntervalSet intervalSet = getErrorRecoverySet(recognizer);

            // Move to the next token
            tokenStream.consume();

            // Move to the next possible token
            // If the errant element is the last in the set, this will move to the 'END' token in 'END MODULE'.
            // If there are subsequent elements in the set, this will move to the 'BEGIN' token in 'BEGIN module_element'.
            consumeUntil(recognizer, intervalSet);
        }
    }

}
