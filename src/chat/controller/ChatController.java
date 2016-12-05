package chat.controller;

import chat.model.Chatbot; 
import chat.view.ChatbotViewer;
import chat.view.ChatFrame;

public class ChatController
{
	private Chatbot stupidBot;
	private ChatbotViewer display;
	private ChatFrame appFrame;
	
	public void start()
		{
			
		}
	
		
	public ChatController()
		{
			stupidBot = new Chatbot("your mom");
			display = new ChatbotViewer();
			appFrame = new ChatFrame(this);
		}
	


	public String useChatbotCheckers(String input)

	{
		String checkedInput = "";
		if(!stupidBot.quitChecker(input))
		{
		if(stupidBot.memeChecker(input))
		{
			checkedInput += "\nYou like memes!\n";
		}
		if(stupidBot.contentChecker(input))
		{
			checkedInput += "\nYou know my secret topic!\n";
		}
		
		if(stupidBot.lengthChecker(checkedInput))
		{
			checkedInput = "Watchu talking bout Wallace?";
		}
		
		}
	else
	{
		display.displayMessage("Thanks for talking to me!  Come back soon!!1!1!");
		System.exit(0);
	}
	return checkedInput;
}
}