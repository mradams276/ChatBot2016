package chat.controller;

import chat.model.Chatbot; 
import chat.view.ChatbotViewer;
import chat.view.ChatFrame;

public class ChatController
{
	private Chatbot stupidBot;
	private ChatbotViewer display;
	
		
	public ChatController()
		{
			stupidBot = new Chatbot("your mom");
			display = new ChatbotViewer();
		}
	
	private ChatFrame appFrame;
		
	public void start()
		{
			String response = display.collectResponse("Lets talk boiiiiiiii");
			
			while(stupidBot.lengthChecker(response))
			{
				display.displayMessage(useChatbotCheckers(response));
				response = display.collectResponse("So you have " + response + " on your mind?  Coolio lets talk");
				
			}
			
		}

	public String useChatbotCheckers(String input)

	{
		String checkedInput = "";
		
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
		return checkedInput;
	}
}
