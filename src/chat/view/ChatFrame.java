package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;
import java.awt.Dimension;

public class ChatFrame extends JFrame
{
	private ChatController baseController;
	private ChatPanel appPanel;
	
	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new ChatPanel(baseController);
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("The BEST CHAT BOT EVER!!!!!");
		this.setVisible(true);
		this.setSize(new Dimension(500,500));
	}
}
