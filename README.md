# Windows application Automation with AutoIt and Java

This project demonstrates how to use AutoIt and Java to automate the testing of the Windows Calculator application. It includes a simple Maven project setup, an AutoIt script, and a Java test using the Jacob library to bridge AutoIt and Java.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven 3.6.0 or higher
- AutoIt v3.3 or higher
- Jacob library

## Project Structure
calculator-autoit
│
├── pom.xml
├── src
│ ├── main
│ │ └── java
│ └── test
│ └── java
│ └── calculator
│ └── CalculatorTest.java
└── Calculator.au3
### Maven Dependencies

Add the necessary dependencies to your `pom.xml`:

```xml
<dependencies>
    <!-- Test dependencies -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
    
    <!-- Jacob dependency for AutoIt integration -->
    <dependency>
        <groupId>net.sf.jacob-project</groupId>
        <artifactId>jacob</artifactId>
        <version>1.20</version>
    </dependency>
</dependencies>
