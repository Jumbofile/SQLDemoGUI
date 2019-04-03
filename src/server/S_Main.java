package server;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.mindrot.jbcrypt.BCrypt;
import Sqldemo.SQLDemo;

public class S_Main {
	
	public static JTextArea consoleWin = new JTextArea();
	public static boolean sqlOn = false;
	
	public static void main(String[] args) {
		//Initialize the server
		//S_Database db = new S_Database();
		    
		//Start server gui
		JFrame frame = new JFrame("Belres Server");
		//JTextField consoleBox = new JTextField();
		JTextArea sqlTextBox = new JTextArea();
		JPanel panel = new JPanel();

		JScrollPane scroll = new JScrollPane (consoleWin);
		JScrollPane scroll2 = new JScrollPane (sqlTextBox);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 574);
		frame.setResizable(false);

		consoleWin.setEditable(false);
		consoleWin.setFont(new Font("Consolas", Font.PLAIN, 12));  // make a new font object);
		scroll.setBounds(10,10,775,420);
		consoleWin.setLineWrap(true);
		sqlTextBox.setFont(new Font("Consolas", Font.PLAIN, 12));
		//consoleBox.setBackground(Color.BLUE);
		sqlTextBox.setLineWrap(true);
		//sqlTextBox.setBounds(10,432,775,104);
		scroll2.setBounds(10,432,775,104);
		frame.getContentPane().add(scroll);
		frame.getContentPane().add(scroll2);

		
		//is enter hit
        Action action = new AbstractAction()
        {
            /**
			 * eclipse made me do this
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void actionPerformed(ActionEvent e)
            {
                /*consoleWin.append(consoleBox.getText() + "\n");
                
              
                
                //Help command "/help"
                if(consoleBox.getText().toLowerCase().startsWith("/help")) {
                	consoleWin.append("Use SQLite");
                }

                //sql commands: /sql getdb:dbname
                if(consoleBox.getText().toLowerCase().startsWith("/sql")) {
                	//while(!consoleBox.getText().equals("quit")){
                		//SQLDemo demo = new SQLDemo();
					String statement = consoleBox.getText().substring(consoleBox.getText().indexOf(' '));
						try {
							Sqldemo.SQLDemo.accessDemo(statement);
						}catch(Exception e1){
							consoleWin.append("Invalid statement \n");
						}
                }
                consoleBox.setText("");
                */
            }
        };
        
        //jframe stuff
        //consoleBox.addActionListener( action );
		//frame.getContentPane().add(sqlTextBox);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		
    }
	
	
}

