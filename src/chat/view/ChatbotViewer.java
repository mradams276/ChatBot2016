package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class ChatbotViewer
{
	private String windowMessage;
	private ImageIcon chatIcon;
	
	public ChatbotViewer()
	{
		windowMessage = "This message brought to you by me, Chatbot!";
		chatIcon = new ImageIcon(getClass().getResource("images/chatbot.jpg"));
		
	}
	
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question, windowMessage, JOptionPane.INFORMATION_MESSAGE, chatIcon, null, "Type here plesase")+"";
		
		return response;
	}
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null,  message);
	}

	public int collectUserOption(String question)
	{
		int response = 0;
		
		response = JOptionPane.showConfirmDialog(null, question, windowMessage,  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, chatIcon);
		
		return response;
	}
}
