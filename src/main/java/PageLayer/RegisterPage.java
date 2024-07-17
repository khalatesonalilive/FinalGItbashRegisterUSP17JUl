package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class RegisterPage extends BaseClass {

	@FindBy(name = "givenName")
	private WebElement fsname;

	@FindBy(name = "sn")
	private WebElement lsname;

	@FindBy(name = "gender")
	private WebElement ggender;

	@FindBy(name = "mail")
	private WebElement eemaild;

	@FindBy(name = "password1")
	private WebElement passsword;

	@FindBy(name = "password2")
	private WebElement ccpassword;

    @FindBy(name="o")
    private WebElement  cccompanyname;

    @FindBy(name="title")
    private WebElement jjobtitle;

    @FindBy(name="postalAddress")
    private WebElement streetaddress;
    
    @FindBy(name="l")
    private WebElement cityname;
    
    @FindBy(name="st")
    private WebElement stateinfo;
    
    @FindBy(name="ct")
    private WebElement ccountry;
    
	@FindBy(name="postalCode")
	private WebElement zipcode;
	
	
	@FindBy(name="regularPhone")
	private WebElement phonenumber;
	
    @FindBy(name="rl")
    private WebElement jrole;
    
	@FindBy(name="industry")
	private WebElement industryname;
	
	@FindBy(name="optoutCheckbox")
	private WebElement agreecheckbox;
	
	public RegisterPage()
	{
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void personalInfoFunctionality(String fname, String lname, String gender, String emailid, String password,
			String cpassword)
	{
		
		Wait.sendKeys(fsname, fname);
		Wait.sendKeys(lsname, lname);
		HandleDropDown.selectByVisibleText(ggender, gender);
		Wait.sendKeys(eemaild, emailid);
		Wait.sendKeys(passsword, cpassword);
		Wait.sendKeys(ccpassword, cpassword);
		
	}
  public void companyAndOrgInfo(String companyname, String Jobtitle)
  {
	  Wait.sendKeys(cccompanyname, companyname);
	  Wait.sendKeys(jjobtitle, Jobtitle);
	  
	  
  }
	
  public void addressFunctionality(String streetadd , String City ,String State , String Country , String Zcode)
  {
	 Wait.sendKeys(streetaddress, streetadd);
	 Wait.sendKeys(cityname, City);
	 Wait.sendKeys(stateinfo, State);
	 HandleDropDown.selectByVisibleText(ccountry, Country);
	 Wait.sendKeys(zipcode, Zcode);
	  
  }
	
	public void contactInfo(String mobilenn)
	{
		
		Wait.sendKeys(phonenumber, mobilenn);
	}
	
	public void roleFunctionality(String role)
	{
		
		HandleDropDown.selectByVisibleText(jrole, role);
	}
	
    public void industryFunction(String indusstry)
    {
    	
    	HandleDropDown.selectByVisibleText(industryname, indusstry);
    }
    
    public void agreeCheckbox()
    {
    	Wait.click(agreecheckbox);
    	
    }
    
}
