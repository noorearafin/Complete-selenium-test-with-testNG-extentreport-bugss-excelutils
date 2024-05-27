<h1>Automated Website Testing with Selenium, Java, TestNG, and Extent Report</h1>

<h1>Overview</h1>
This project demonstrates how to automate website testing using Selenium WebDriver with Java, TestNG, and Extent Report. It includes sample test cases for a website, along with setup instructions and usage guidelines.

<h1>Table of Contents</h1>
<ul>
<li>Prerequisites</li>
  <li>Setup</li>
  <li>Usage</li>
  <li>Project Structure</li>
  <li>Contributing</li>
  <li>License</li>
</ul>

<h1>Before running the tests, make sure you have the following installed:</h1>
<ul>
<li>Java Development Kit (JDK)</li>
  <li>Apache Maven</li>
  <li>Selenium WebDriver</li>
  <li>TestNG</li>
  <li>Extent Report</li>
  <li>Compatible web browser driver (e.g., ChromeDriver for Google Chrome)</li>
  
</ul>
<h1>Setup</h1>
<ol>
<li>Clone this repository to your local machine:</li>
git clone (https://github.com/noorearafin/Complete-selenium-test-with-testNG-extentreport-bugss-excelutils)
<li>Navigate to the project directory:</li>
cd your_project
<li>Update the pom.xml file with the necessary dependencies.</li>
<li>Download the compatible web browser driver and configure it in your system's PATH.</li>
<li>Update the test scripts according to your website's requirements.</li>
<li>Customize the Extent Report configuration if needed.</li>
</ol>
Usage
Compile the project using Maven:
bash
Copy code
mvn clean compile
Run the test suite:
bash
Copy code
mvn test
After the test execution completes, find the Extent Report generated in the specified directory.
Project Structure
src/test/java: Contains the Java test classes.
src/main/java: Contains any additional Java code required for setup or utilities.
src/test/resources: Contains any test data or configuration files.
testng.xml: TestNG configuration file specifying the test suite details.
pom.xml: Maven project configuration file specifying dependencies and build settings.
extent-config.xml: Extent Report configuration file.
Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

License
This project is licensed under the MIT License.
