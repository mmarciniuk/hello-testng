# hello-testng
This repository is short introduction to TestNG framework.

# [TestNG](https://testng.org/doc/)
![TestNG](images/TestNG-Logo.png)

***TestNG*** - is a testing framework develop in lines of JUnit and NUnit. 
However, this framework also introduce new features, which cover additional 
categories of testing: unit, functional, end-to-end, integration, regression
and much more.

### Prerequisites/Requirements
* At least some basic knowledge of Java programming language
* At least some basic knowledge of [Maven](https://maven.apache.org/) 
* Installed JDK (1.5 or above)
* Installed some IDE (for eg. IntelliJ IDEA)
* Knowledge fo software testing

### Features of TestNG
* Flexible run time configuration
* Support for multi threading testing
* Annotations
* Test groups

### Annotations
|TestNG Annotation      |Description|
|-----------------------|-----------|
|***@BeforeSuite***	    |The annotated method will be run before all tests in this suite have run.|
|***@AfterSuite***	    |The annotated method will be run after all tests in this suite have run.|
|***@BeforeTest***	    |The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.|
|***@AfterTest***	    |The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.|
|***@BeforeClass***	    |The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.|
|***@AfterClass***	    |The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.|
|***@BeforeMethod***	|The annotated method will be run before the first test method in the current class is invoked.|
|***@AfterMethod***	    |The annotated method will be run after all the test methods in the current class have been run.|
|***@BeforeGroups***	|The annotated method will be run before each test method.|
|***@AfterGroups***	    |The annotated method will be run after each test method.|
|***@DataProvider***    |Marks a method as supplying data for a test method. The annotated method must return an Object[][] where each Object[] can be assigned the parameter list of the test method. The @Test method that wants to receive data from this DataProvider needs to use a dataProvider name equals to the name of this annotation.|
|***@Factory***         |Marks a method as a factory that returns objects that will be used by TestNG as Test classes. The method must return Object[].|
|***@Listeners***       |Defines listeners on a test class.|
|***@Parameters***      |Describes how to pass parameters to a @Test method.|
|***@Test***            |Marks a class or a method as part of the test.|

Hierarchy of test annotations
1. @BeforeSuite
2. @BeforeTest
3. @BeforeClass
4. @BeforeMethod
5. @Test
6. @AfterMethod
7. @AfterClass
8. @AfterTest
9. @AfterSuite














