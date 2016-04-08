import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import java.awt.Panel;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenu;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;

import java.awt.ScrollPane;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;




public class BisIsItGUI extends JFrame {
 
	private BisIsItExecute exe;
	public JTextArea ta_symbolTable;
	public JTextArea ta_functionStack;
	public BisIsItGUI() {
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		exe = new BisIsItExecute(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuBar.setVisible(true);
		
		this.setSize(1203, 644);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Run Program");
		
		btnNewButton.setBounds(667, 540, 178, 33);
		getContentPane().add(btnNewButton);
		
		//------------
		
		ta_symbolTable = new JTextArea();
		ta_symbolTable.setEditable(false);
		ta_symbolTable.setBounds(855, 26, 322, 246);
		
		JScrollPane scroll1 = new JScrollPane (ta_symbolTable, 
				   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll1.setBounds(855, 26, 322, 246); 
		
		getContentPane().add(scroll1);
		
		ta_functionStack = new JTextArea();
		ta_functionStack.setEditable(false);
		ta_functionStack.setBounds(855, 302, 322, 227);
		
		JScrollPane scroll2 = new JScrollPane (ta_functionStack, 
				   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll2.setBounds(855, 302, 322, 227); 
		
		getContentPane().add(scroll2);
		
		JTextArea editorText = new JTextArea();
		editorText.setWrapStyleWord(true);
		editorText.setLineWrap(true);
		editorText.setColumns(10);
		editorText.setBounds(10, 26, 835, 246);
		
		
		JScrollPane scroll3 = new JScrollPane (editorText, 
				   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll3.setBounds(10, 26, 835, 246); 

		
		getContentPane().add(scroll3);
		
		JTextArea ta_console = new JTextArea();
		ta_console.setEditable(false);
		ta_console.setBounds(10, 302, 835, 227);
		getContentPane().add(ta_console);
		
		JScrollPane scroll4 = new JScrollPane (ta_console, 
				   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll4.setBounds(10, 302, 835, 227); 

		
		getContentPane().add(scroll4);
		
		
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(10, 288, 76, 14);
		getContentPane().add(lblConsole);
		
		JLabel lblEditor = new JLabel("Editor:");
		lblEditor.setBounds(10, 11, 46, 14);
		getContentPane().add(lblEditor);
		
		JLabel lblSymbolTable = new JLabel("Symbol Table:");
		lblSymbolTable.setBounds(855, 11, 92, 14);
		getContentPane().add(lblSymbolTable);
		
		JLabel lblFunctionStack = new JLabel("Function Stack:");
		lblFunctionStack.setBounds(855, 283, 92, 14);
		getContentPane().add(lblFunctionStack);

		
		JRadioButton continueExe = new JRadioButton("Continuous execution");
		continueExe.setBounds(287, 540, 186, 33);
		getContentPane().add(continueExe);
		 	
		JRadioButton lineByLine = new JRadioButton("Line by line execution");
		lineByLine.setBounds(475, 540, 186, 33);
		getContentPane().add(lineByLine);
		
		ButtonGroup group = new ButtonGroup();
		group.add(continueExe);
		group.add(lineByLine);
		
		JButton clearBtn = new JButton("Clear Contents");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorText.setText("");
				
			
				ta_symbolTable.setText("");
				
				

				ta_functionStack.setText("");
			}
		});
		clearBtn.setBounds(1057, 540, 120, 33);
		getContentPane().add(clearBtn);


		//RUN PROGRAM
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PrintWriter writer;
				try {
					writer = new PrintWriter(BisIsItLang.filename, "UTF-8");
					writer.write(editorText.getText());
					writer.close();
			
					
					
					//System.out.println("PASSED HERE");
					//CHECK EXECUTION MODE
					if(continueExe.isSelected()){
						BisBaseVisitorImplementer.executionMode = "continuous";
						//System.out.println("CONTINUE MODE");
					}else if(lineByLine.isSelected()){
						BisBaseVisitorImplementer.executionMode = "lineByLine";
						//System.out.println("LINE BY LINE MODE");
					}
					exe.executeProgram();
					
					//OUTPUT SYMBOL TABLE HERE
					ta_symbolTable.setText("");
					
					//OUTPUT FUNCTION STACK HERE
					ta_functionStack.setText("");
					
					
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		
		PrintStream printStream = new PrintStream(new CustomOutputStream(ta_console));

		System.setOut(printStream);
		System.setErr(printStream);
		
		
		this.setVisible(true);

		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	

}
