# SauceDemo Automation Framework 🚀

A professional **Hybrid Test Automation Framework** built to automate the end-to-end purchasing flow on the [SauceDemo](https://www.saucedemo.com/) website.

## 🛠 Tech Stack Used
* **Language:** Java
* **Automation Tool:** Selenium WebDriver (v4.x)
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM) with PageFactory

## 🏗 Framework Architecture
The framework follows a modular structure for high maintainability and reusability:
* **BaseClass:** Handles driver initialization, browser setup, and teardown.
* **Page Objects:** Separate classes for Login, Home, Checkout, and Overview pages to keep locators and actions isolated.
* **Test Classes:** Contains TestNG annotations and Assertions for validating business logic.
* **testng.xml:** Suite file to manage and execute multiple test cases.

## 🧪 Scenarios Automated
1. **Login:** Secure login using standard credentials.
2. **Product Selection:** Adding items to the cart and verifying cart badges.
3. **Checkout Flow:** - Navigating to the cart.
   - Entering user information (First Name, Last Name, Zip Code).
   - Verifying the checkout overview.
4. **Order Completion:** Clicking the 'Finish' button and validating the "Thank you for your order!" success message.

## 🚀 How to Run the Project
1. **Clone the repository:**
   ```bash
   git clone https://github.com/jatinrana331gm/SauceDemoAutomationFramework.git
   ```
2. **Import Project:** Open Eclipse or IntelliJ and import it as an **Existing Maven Project**.
3. **Execute Tests:** Right-click on `testng.xml` and select **Run As > TestNG Suite**.

## 📊 Key Features
* **PageFactory:** For efficient and clean element initialization.
* **Assertions:** Robust validation at every critical step to ensure test accuracy.
* **Synchronization:** Implemented Implicit/Explicit waits to handle dynamic web elements.
