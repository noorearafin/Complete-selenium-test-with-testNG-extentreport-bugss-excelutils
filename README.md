<h1 align="center">🧪 Complete Selenium Test with TestNG, ExtentReport & Excel Utils</h1>

<p align="center">
  <strong>A comprehensive automated testing framework built with Selenium WebDriver, Java, TestNG, and ExtentReport</strong>
</p>

<p align="center">
  <a href="#features">Features</a> •
  <a href="#prerequisites">Prerequisites</a> •
  <a href="#setup">Setup</a> •
  <a href="#usage">Usage</a> •
  <a href="#project-structure">Project Structure</a> •
  <a href="#contributing">Contributing</a> •
  <a href="#license">License</a>
</p>

---

## 📋 Table of Contents
- [Features](#features) ✨
- [Prerequisites](#prerequisites) 🛠️
- [Setup](#setup) ⚙️
- [Usage](#usage) 🚀
- [Project Structure](#project-structure) 📁
- [Configuration](#configuration) ⚡
- [Running Tests](#running-tests) 🎯
- [Reports](#reports) 📊
- [Troubleshooting](#troubleshooting) 🔧
- [Contributing](#contributing) 🤝
- [License](#license) 📝

---

## ✨ Features

- **Selenium WebDriver Integration**: Powerful browser automation capabilities
- **TestNG Framework**: Advanced testing framework with robust assertions and reporting
- **ExtentReport**: Beautiful, interactive HTML test reports with detailed insights
- **Excel Utilities**: Read and write test data from/to Excel files for data-driven testing
- **Cross-browser Testing**: Support for Chrome, Firefox, Edge, and Safari
- **Page Object Model**: Well-organized code structure for maintainability
- **Data-Driven Tests**: Parameterized testing using Excel spreadsheets
- **Logging**: Comprehensive test execution logging
- **Screenshot Capture**: Automatic screenshot capture on test failures
- **Bug Tracking Integration**: Ready for integration with bug tracking systems

---

## 🛠️ Prerequisites

Before running the tests, ensure you have the following installed:

- **Java Development Kit (JDK)** 11 or higher
  - Download from: https://www.oracle.com/java/technologies/downloads/
  
- **Apache Maven** 3.6 or higher
  - Download from: https://maven.apache.org/download.cgi
  
- **Git** (for cloning the repository)
  - Download from: https://git-scm.com/
  
- **Web Browser Drivers**:
  - ChromeDriver (for Google Chrome): https://chromedriver.chromium.org/
  - GeckoDriver (for Firefox): https://github.com/mozilla/geckodriver/releases
  - EdgeDriver (for Microsoft Edge): https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
  
- **Compatible Web Browsers**:
  - Google Chrome
  - Mozilla Firefox
  - Microsoft Edge
  - Safari (optional)

---

## ⚙️ Setup

### 1. Clone the Repository

```bash
git clone https://github.com/noorearafin/Complete-selenium-test-with-testNG-extentreport-bugss-excelutils.git
cd Complete-selenium-test-with-testNG-extentreport-bugss-excelutils
```

### 2. Install Dependencies

```bash
mvn clean install
```

This will download all required dependencies from Maven Central Repository.

### 3. Download WebDriver

Choose your browser and download the corresponding driver:

```bash
# For Chrome (place in project root or add to PATH)
wget https://chromedriver.chromium.org/downloads

# For Firefox
wget https://github.com/mozilla/geckodriver/releases/download/v0.33.0/geckodriver-v0.33.0-linux64.tar.gz
```

### 4. Configure WebDriver Path

Update the driver path in your test configuration or in the `src/main/java/utils/BrowserFactory.java` file:

```java
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
```

### 5. Update Test Data

Configure your test data in Excel files located in `src/test/resources/` directory.

---

## 🚀 Usage

### Compile the Project

```bash
mvn clean compile
```

### Run All Tests

```bash
mvn test
```

### Run Specific Test Suite

```bash
mvn test -Dsuite=testng.xml
```

### Run Tests with Specific Tags

```bash
mvn test -Dgroups=smoke
```

### Skip Tests During Build

```bash
mvn clean install -DskipTests
```

---

## 📁 Project Structure

```
Complete-selenium-test-with-testNG-extentreport-bugss-excelutils/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── utils/
│   │       │   ├── BrowserFactory.java       # WebDriver initialization
│   │       │   ├── ExcelUtils.java           # Excel file handling
│   │       │   ├── PropertyReader.java       # Properties file reader
│   │       │   ��── ScreenshotUtils.java      # Screenshot capture
│   │       └── pages/
│   │           ├── BasePage.java             # Base page object
│   │           └── [PageObjects].java        # Page-specific elements & methods
│   │
│   └── test/
│       ├── java/
│       │   ├── testcases/
│       │   │   └── [TestClasses].java        # Test classes
│       │   └── base/
│       │       └── BaseTest.java             # Base test setup
│       │
│       └── resources/
│           ├── testng.xml                    # TestNG configuration
│           ├── config.properties             # Configuration file
│           ├── extent-config.xml             # ExtentReport configuration
│           └── testdata/
│               └── [ExcelFiles].xlsx         # Test data
│
├── reports/
│   └── ExtentReports/                        # Generated HTML reports
│
├── pom.xml                                   # Maven configuration
├── README.md                                 # This file
└── .gitignore                               # Git ignore rules
```

---

## ⚡ Configuration

### Maven Dependencies (pom.xml)

Key dependencies included:
- **Selenium**: 4.x
- **TestNG**: 7.x
- **ExtentReport**: 5.x
- **Apache POI**: 5.x (for Excel handling)
- **Log4j**: 2.x (for logging)

### Properties Configuration

Create `config.properties` in `src/test/resources/`:

```properties
browser=chrome
base.url=https://www.example.com
implicit.wait=10
explicit.wait=15
screenshot.path=./screenshots/
report.path=./reports/
```

### ExtentReport Configuration

Customize `extent-config.xml` to adjust report styling and behavior.

---

## 🎯 Running Tests

### Using Maven Command Line

```bash
# Run all tests
mvn clean test

# Run with specific TestNG suite
mvn test -Dsuite=testng.xml

# Run specific test class
mvn test -Dtest=LoginTest

# Run specific test method
mvn test -Dtest=LoginTest#testValidLogin
```

### Using IDE (IntelliJ/Eclipse)

1. Right-click on `testng.xml` → Run 'testng.xml'
2. Or right-click on a test class → Run

---

## 📊 Reports

### Accessing ExtentReport

After test execution, open the generated HTML report:

```
./reports/ExtentReports/index.html
```

**Report Features:**
- Test execution summary
- Pass/Fail statistics
- Detailed test logs
- Screenshots on failure
- Categorized test results
- Execution timeline

### Report Contents

- **Dashboard**: Overview of test execution
- **Tests**: Detailed test case results
- **Timeline**: Chronological view of test execution
- **Categories**: Test categorization and filtering
- **Screenshots**: Visual evidence of failures

---

## 🔧 Troubleshooting

### Issue: WebDriver Not Found

**Solution**: Ensure the WebDriver path is correctly configured or add it to system PATH:

```bash
# Linux/Mac
export PATH=$PATH:/path/to/driver

# Windows
set PATH=%PATH%;C:\path\to\driver
```

### Issue: Tests Cannot Find Excel Files

**Solution**: Verify the Excel file path in your code matches the actual location in `src/test/resources/`

### Issue: ElementNotFound Exception

**Solution**: 
- Increase wait times in configuration
- Verify element selectors are correct
- Check if page has loaded completely

### Issue: ExtentReport Not Generated

**Solution**:
- Check write permissions in report directory
- Verify `extent-config.xml` is properly configured
- Ensure report path exists in your file system

### Issue: Maven Build Fails

**Solution**:
```bash
# Clear Maven cache and rebuild
mvn clean install -U
```

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/YourFeature`)
3. **Commit** your changes (`git commit -m 'Add YourFeature'`)
4. **Push** to the branch (`git push origin feature/YourFeature`)
5. **Open** a Pull Request

### Contribution Guidelines

- Follow the existing code structure and naming conventions
- Add meaningful test cases
- Update documentation for new features
- Ensure all tests pass before submitting PR
- Write clear commit messages

### Reporting Issues

Found a bug? Please open an issue with:
- Detailed description
- Steps to reproduce
- Expected vs. actual behavior
- Screenshots/logs if applicable
- Your environment details

---

## 📝 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## 📧 Contact & Support

For questions or support, feel free to reach out via:
- GitHub Issues: [Project Issues](https://github.com/noorearafin/Complete-selenium-test-with-testNG-extentreport-bugss-excelutils/issues)
- Email: noorearafin@example.com

---

## 🙏 Acknowledgments

- Selenium WebDriver Documentation
- TestNG Framework
- ExtentReport Library
- Apache POI for Excel support

---

<p align="center">
  <strong>⭐ If you found this project helpful, please consider giving it a star!</strong>
</p>

<p align="center">
  Made with ❤️ by <a href="https://github.com/noorearafin">noorearafin</a>
</p>
