package chat.view;

import javax.swing.JOptionPane;

public class ChatbotViewer
{
	
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
	public void displayMessae(String message)
	{
		JOptionPane.showMessageDialog(null,  message);
	}

	publicnt collectUserOption(String question)
	{
		int response = 0;
		
		response = JOptionPane.showConfirmDialog(null, question);
		
		return response;
	}
}
