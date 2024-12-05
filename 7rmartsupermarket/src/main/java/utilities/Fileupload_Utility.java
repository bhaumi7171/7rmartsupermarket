package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fileupload_Utility {
	public WebDriver driver;

	public void sendKeysProfileUpload(WebElement element, String path) {
		element.sendKeys(path);
	}

	public void robotForFileUpload(WebElement element, String path) throws AWTException {
		StringSelection fileselect = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileselect, null);
		Robot robot = new Robot();
		robot.delay(2);// delay(120) means 120 second delay, time is in second if not upload the delay
						// will work, if working or uploaded delay will not working
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void selectDetails() throws AWTException
	{
		Robot robo=new Robot();
		;
		robo.delay(2);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_X);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}
}
