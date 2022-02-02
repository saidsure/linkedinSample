# linkedinSample

Project: LinkedIn Login
Description: Automated the processes of login to Linked In site and verify login success for given username and password. Verify logout functionality and validate the logout functionality. Verify that user is not able to login with dashboard url

Technologies and frameworks used : JAVA, selenium, testng and maven

Project structure:

-> you will find 5 classes total in src/test/java folder

--> TestScenarioClass has the test defined in it, this is the starting point of our execution. There is a second method closeBrowser() which closes browser after each test has been executed. You can add more test cases to this class

--> SetUp class is where the browser is launched and closed. all the classes inherit this classs in order to use the driver(browser element)

--> Login class has elements and methods related to login page
--> Logout class has elements and methods related to lougout page
--> Dashboard class has elements and methods related to dashboard page

--> To get started you need an account with linkedin. create an account manually and add the credentails to testng.xml. In parameter tag/element provide username and password in password parameter.


To run project 
--> right click on testng.xml, click "Run As" --> "testng suite"


NOTE: Forgot to add screenshot code when failure happens, I will update that part by end of the day today a i need laptop again, My apologies for missing that part.

