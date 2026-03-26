# Selenium UI Automation Project

## Overview
This project demonstrates automated UI testing using Selenium WebDriver with Java.  
It covers login functionality with both positive and negative test scenarios.

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven

## Test Scenarios
### ✅ Valid Login Test
- Enters correct username and password
- Verifies successful login message

### ❌ Invalid Login Test
- Enters incorrect credentials
- Verifies error message is displayed

## Project Structure
- `BaseTest` – WebDriver setup and teardown
- `LoginPage` – Page Object Model implementation
- `LoginTest` – test cases

## Key Features
- Page Object Model (POM)
- Explicit waits (WebDriverWait)
- Clean test structure with TestNG
- Separation of test logic and page logic

## How to Run
1. Clone the repository
2. Open in IntelliJ IDEA
3. Run `LoginTest.java`

## Author
Ali Ahmed