# KrishnaFramework
# Intorduction
Created simple framework for the people one who wants to use for their Projects. It has integration with POM,TestNG and Allure Reports. For the Logging Log4j also integrated. 

# Installation
By default it has configured with Chrome browser with Mac Platform. 
Download the chromedriver for your platform from [ChromeDriver](http://chromedriver.chromium.org/downloads). 

Replace your chromedriver in the **/driver** directory.

# Custom Function

Refer the LoginPage.Java. Once you inherit the BaseClass, you can use our custom function. 

**click(element):**
To click on the element
	Parameter- WebElement
	
	
**typeText(element,value in string):**
Type the text in the element
	Paramenter- WebElement,String value
	
.
.
.
# Reports
Once the Successfull run , If you wants to get the Allure reports . There is one more things to do 

**Run this command
KrishnaFramework > ./scripts/createAllureScripts.sh**
Wait for sometime to load the reports with your browser. 

Sample Reports here

![sample report](https://user-images.githubusercontent.com/13097320/43676665-0e8794cc-9813-11e8-867e-adfc2851f73f.png)
