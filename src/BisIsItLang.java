import java.awt.BorderLayout;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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
    	String filename = "test\\sample.txt";
    	
    	
    	BisLexer lexer2 = new BisLexer ( new ANTLRFileStream(filename));
    	BisParser parser2 = new BisParser(new CommonTokenStream(lexer2));
    	    parser2.start();
    	
    	
    	
    	
    	//BisIsItCustomListener parseListener = new BisIsItCustomListener();
    	BisLexer lexer = new BisLexer(new ANTLRFileStream(filename));
        //lexer.removeErrorListeners();
        //lexer.addErrorListener(new BisLexerErrorListener(parseListener));
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	
        BisParser parser = new BisParser(tokens);
        parser.setBuildParseTree(true);
        //parser.setErrorHandler(new BisErrorStrategy());
        //parser.removeErrorListeners();
        //parser.addErrorListener(new BisParserErrorListener(parseListener));
        //parser.addParseListener(parseListener);
        ParseTree tree = parser.start();
        
        
        BisBaseVisitorImplementer visitorImplementer = new BisBaseVisitorImplementer();
        
        //TYPE CHECKING
        visitorImplementer.visit(tree);
        
        if(!visitorImplementer.getHasError()){
        	//execute code
        }else{
        	//do something
        }
        
        
        //show AST in console
        //System.out.println(tree.toStringTree(parser));

        //show AST in GUI
        JFrame frame = new JFrame("I think I shall never see");
        //frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewer.setScale(1.5);//scale a little
        panel.add(viewer);
        
        JSlider scaleSlider = new JSlider(JSlider.HORIZONTAL, 5, 40, 15);
        scaleSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider)e.getSource();
				if (!source.getValueIsAdjusting()) {
		            int scale = (int)source.getValue();
		            panel.removeAll();
		            viewer.setScale(scale/10.0);
		            panel.add(viewer);
		            frame.revalidate();
		        }
			}
        });
        
        //frame.add(scaleSlider, BorderLayout.NORTH);
        frame.add(panel);
        frame.add(new JScrollPane(panel), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,700);
        frame.setVisible(true);
    }
    
}
