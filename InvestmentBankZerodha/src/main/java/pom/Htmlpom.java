package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Htmlpom {
@FindBy (xpath="(//table[@id='customers']//tr//td[1])")
private List<WebElement> AllCellValue;


public Htmlpom(WebDriver driver)
{
	  PageFactory.initElements( driver, this);
	 
	 
}

public String cellvalues() {

	String value=AllCellValue.get(1).getText();
	return value;
	
}

}
