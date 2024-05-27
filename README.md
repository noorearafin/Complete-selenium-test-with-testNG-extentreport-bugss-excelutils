<h1 align="center">Automated Website Testing with Selenium, Java, TestNG, and Extent Report</h1>

<p align="center">This project demonstrates how to automate website testing using Selenium WebDriver with Java, TestNG, and Extent Report. It includes sample test cases for a website, along with setup instructions and usage guidelines.</p>

## Table of Contents
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

<h2 id="prerequisites">Prerequisites</h2>
<p>Before running the tests, make sure you have the following installed:</p>
<ul>
    <li>Java Development Kit (JDK)</li>
    <li>Apache Maven</li>
    <li>Selenium WebDriver</li>
    <li>TestNG</li>
    <li>Extent Report</li>
    <li>Compatible web browser driver (e.g., ChromeDriver for Google Chrome)</li>
</ul>

<h2 id="setup">Setup</h2>
<ol>
    <li>Clone this repository to your local machine:</li>
    <pre><code>git clone [https://github.com/your_username/your_project.git](https://github.com/noorearafin/Complete-selenium-test-with-testNG-extentreport-bugss-excelutils)</code></pre>
    <li>Navigate to the project directory:</li>
    <pre><code>cd your_project</code></pre>
    <li>Update the <code>pom.xml</code> file with the necessary dependencies.</li>
    <li>Download the compatible web browser driver and configure it in your system's PATH.</li>
    <li>Update the test scripts according to your website's requirements.</li>
    <li>Customize the Extent Report configuration if needed.</li>
</ol>

<h2 id="usage">Usage</h2>
<ol>
    <li>Compile the project using Maven:</li>
    <pre><code>mvn clean compile</code></pre>
    <li>Run the test suite:</li>
    <pre><code>mvn test</code></pre>
    <li>After the test execution completes, find the Extent Report generated in the specified directory.</li>
</ol>

<h2 id="project-structure">Project Structure</h2>
<ul>
    <li><code>src/test/java</code>: Contains the Java test classes.</li>
    <li><code>src/main/java</code>: Contains any additional Java code required for setup or utilities.</li>
    <li><code>src/test/resources</code>: Contains any test data or configuration files.</li>
    <li><code>testng.xml</code>: TestNG configuration file specifying the test suite details.</li>
    <li><code>pom.xml</code>: Maven project configuration file specifying dependencies and build settings.</li>
    <li><code>extent-config.xml</code>: Extent Report configuration file.</li>
</ul>

<h2 id="contributing">Contributing</h2>
<p>Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.</p>

<h2 id="license">License</h2>
<p>This project is licensed under the <a href="LICENSE">MIT License</a>.</p>
