package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Copy_String_Using_Windows_Clipboard 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		//launch Notepad at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
				
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);

		
		String text="The Selenium Server is needed in order to run Remote Selenium WebDriver";
		//Select String
		StringSelection Stext=new StringSelection(text);
		//Get system default tool kit.
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Copied content set into system clipboard
		clipboard.setContents(Stext, Stext);
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Control down key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}

}
