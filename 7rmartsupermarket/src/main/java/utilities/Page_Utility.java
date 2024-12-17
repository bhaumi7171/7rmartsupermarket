package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Page_Utility {
	public WebDriver driver;

	public void selectbytext(WebElement dropdown, String text) {
		Select drop = new Select(dropdown);
		drop.selectByVisibleText("Staff");
	}

	public void selectbyindex(WebElement dropdown, Integer text) {
		Select drop = new Select(dropdown);
		drop.selectByIndex(2);
	}

	public void dropDownInCategory(WebElement selectgroup, WebElement selectgroupdrop) {
		Actions actions = new Actions(driver);
		actions.moveToElement(selectgroup);
		actions.doubleClick(selectgroup).perform();
		actions.dragAndDrop(selectgroup, selectgroupdrop).build().perform();
	}

	public void selectDetails() throws AWTException {
		Robot robo = new Robot();
		robo.delay(2);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_X);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}

	public void Selection(WebElement details) {
		Actions action = new Actions(driver);
		// action.doubleClick(details);
		action.doubleClick().clickAndHold(details);
	}
}
