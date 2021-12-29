package com.tcs.com;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
		public static WebDriver driver;

		// browser launch
		public static WebDriver browserlaunch(String browser) {

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						" C:\\Users\\tagit\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
				ChromeOptions ch = new ChromeOptions();
				ch.addArguments("incognito");
				driver = new ChromeDriver(ch);
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "path");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("safari")) {
				System.setProperty("webdriver.chrome.driver", "path");
				driver = new SafariDriver();
			}
			return driver;
		}

		public static void urllaunch(String url) {
			driver.get(url);
		}

		// close the page
		public static void closethepage() {
			driver.close();
		}

		// quit the browser
		public static void quitthebrowser() {
			driver.quit();
		}

		// navigate methods
		public static void navito(String navi) {
			driver.navigate().to(navi);
		}

		public static void naviback() {
			driver.navigate().back();
		}

		public static void naviforward() {
			driver.navigate().forward();
		}

		public static void navirefresh() {
			driver.navigate().refresh();
		}

		public static void title() {
			driver.getTitle();
		}

		public static void currenturl() {
			driver.getCurrentUrl();
		}

		public static void maxwindow() {
			driver.manage().window().maximize();
		}

		// web element methods
		public static void inputvalues(WebElement we, String s) {
			we.sendKeys(s);
		}

		public static void clickOnElement(WebElement we) {
			we.click();
		}

		public static void getTheText(WebElement ele) {
			String text = ele.getText();
			System.out.println(text);
		}

		public static void getTheAttribute(WebElement ele) {
			System.out.println(ele.getAttribute("type"));
		}

		public static void display(WebElement ele) {
			System.out.println("is displayed :" + ele.isDisplayed());
		}

		public static void enabled(WebElement ele) {
			System.out.println("is enabled :" + ele.isEnabled());
		}

		public static void select(WebElement ele) {
			System.out.println("is selected :" + ele.isSelected());
		}

		public static void erase(WebElement we) {
			we.clear();
		}

		// checkbox and radio button
		public static void filter(WebElement ele) {
			ele.click();
		}

		// take screenshot
		public static void sc(String s) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(s);
			FileUtils.copyFile(source, destination);
		}

		// dropdown
		public static void dropdown(WebElement ele, String s1, String s2) {
			Select sel = new Select(ele);
			if (s1.equalsIgnoreCase("value")) {
				sel.selectByValue(s2);
			} else if (s1.equalsIgnoreCase("text")) {
				sel.selectByVisibleText(s2);
			} else if (s1.equalsIgnoreCase("index")) {
				sel.selectByIndex(Integer.parseInt(s2));
			} else if (s1.equalsIgnoreCase("dvalue")) {
				sel.deselectByValue(s2);
			} else if (s1.equalsIgnoreCase("dtext")) {
				sel.deselectByVisibleText(s2);
			} else if (s1.equalsIgnoreCase("dindex")) {
				sel.selectByIndex(Integer.parseInt(s2));
			}
		}

		public static void dropdown1(WebElement ele, String s1) {
			Select sel = new Select(ele);
			if (s1.equalsIgnoreCase("multi")) {
				boolean multiple = sel.isMultiple();
				System.out.println("is multiple :" + multiple);
			} else if (s1.equalsIgnoreCase("first selected")) {
				WebElement fso = sel.getFirstSelectedOption();
				String fsotext = fso.getText();
				System.out.println(fsotext);
			} else if (s1.equalsIgnoreCase("dselectall")) {
				sel.deselectAll();
			} else if (s1.equalsIgnoreCase("opt")) {
				List<WebElement> options = sel.getOptions();
				for (WebElement op : options) {
					String s3 = op.getText();
					System.out.println(s3);
				}
			} else if (s1.equalsIgnoreCase("allopt")) {
				List<WebElement> all_sel_opt = sel.getAllSelectedOptions();
				for (WebElement aso : all_sel_opt) {
					String alltext = aso.getText();
					System.out.println(alltext);
				}
			}

		}

		// alert methods
		public static void popup(String s, String s1) {
			Alert alert = driver.switchTo().alert();
			if (s.equalsIgnoreCase("accept")) {
				alert.accept();
			} else if (s.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			} else if (s.equalsIgnoreCase("sendkeys")) {
				alert.sendKeys(s1);
			} else if (s.equalsIgnoreCase("gettext")) {
				String text = alert.getText();
				System.out.println(text);
			}
		}

		// wait methods
		public static void implicit(long d) {
			driver.manage().timeouts().implicitlyWait(d, TimeUnit.SECONDS);
		}

		public static void explicit(long d, WebElement ele) {
			WebDriverWait w1 = new WebDriverWait(driver, d);
			w1.until(ExpectedConditions.visibilityOf(ele));
		}

		public static void fluent(long d) {
			Wait<WebDriver> w2 = new FluentWait<WebDriver>(driver).withTimeout(d, TimeUnit.SECONDS)
					.pollingEvery(d, TimeUnit.SECONDS).ignoring(Exception.class);
		}

		public static void sleep(long d) throws InterruptedException {
			Thread.sleep(d);
		}

		// frames
		public static void frame1(String s, String i) {

			if (s.equalsIgnoreCase("index")) {
				driver.switchTo().frame(Integer.parseInt(i));
			} else if (s.equalsIgnoreCase("id")) {
				driver.switchTo().frame(i);
			}
		}

		public static void frame2(String s) {
			if (s.equalsIgnoreCase("parent")) {
				driver.switchTo().parentFrame();
			} else if (s.equalsIgnoreCase("default")) {
				driver.switchTo().defaultContent();
			}

		}

		public static void frame(WebElement ele) {
			driver.switchTo().frame(ele);

		}

		// actions
		public static void mouse(String s, WebElement ele) {
			Actions ac = new Actions(driver);
			if (s.equalsIgnoreCase("move")) {
				ac.moveToElement(ele).build().perform();
			} else if (s.equalsIgnoreCase("click")) {
				ac.click(ele).build().perform();
			} else if (s.equalsIgnoreCase("rightclick")) {
				ac.contextClick(ele).build().perform();
			} else if (s.equalsIgnoreCase("doubleclick")) {
				ac.doubleClick(ele).build().perform();
			} else if (s.equalsIgnoreCase("dd")) {
				ac.dragAndDrop(ele, ele).build().perform();
			}
		}

		// action robot

		public static void down() throws AWTException {
			Robot q = new Robot();

			q.keyPress(KeyEvent.VK_DOWN);
			q.keyRelease(KeyEvent.VK_DOWN);
		}

		public static void enter() throws AWTException {
			Robot q = new Robot();

			q.keyPress(KeyEvent.VK_ENTER);
			q.keyRelease(KeyEvent.VK_ENTER);

		}

		// scroll up and down
		public static void scrollinto(WebElement ele) {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].scrollIntoView();", ele);
		}

		public static void scroll(String s) {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript(s);
		}

	
	}


