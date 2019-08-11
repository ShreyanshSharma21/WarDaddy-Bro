import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;


public class ReadFile extends JFrame {
	
	private JTextField addressBar ;
	private JEditorPane display;
	
	
	public ReadFile()
	{
		super("WarDaddy Bro");
		addressBar = new JTextField("Enter the URL asshole");
		addressBar.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent event) {
						
						loadWebsite(event.getActionCommand());
					}
				});
		
		add(addressBar, BorderLayout.NORTH);
		display = new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(

				new HyperlinkListener() 
				{
					
					public void hyperlinkUpdate (HyperlinkEvent event)
					{
						if (event.getEventType()==  HyperlinkEvent.EventType.ACTIVATED) 
						{
							loadWebsite(event.getURL().toString());
							
						}
					}
			
				});
		
		add(new  JScrollPane(display), BorderLayout.CENTER);
		setSize(500,300);
		setVisible(true);
	}
	
	
	
	
	private void loadWebsite(String userTxt)
	{
		
		try
		{
			display.setPage(userTxt);
			addressBar.setText(userTxt); 
			
			
		}
		catch(Exception e)
		{
			System.out.println("Type the correct url asshole");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
