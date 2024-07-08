package org.example;

import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private AutoItX autoIt;

    @Before
    public void setUp() {
        // Load Jacob DLL
        String jacobDllVersionToUse = "jacob-1.20-x64.dll";
        System.setProperty(LibraryLoader.JACOB_DLL_PATH, new File("lib", jacobDllVersionToUse).getAbsolutePath());
        autoIt = new AutoItX();
    }

    @Test
    public void testCalculator() throws IOException {
        // Run AutoIt script
        Runtime.getRuntime().exec("Calculator.exe");

        // Wait for the calculator window to appear
        autoIt.winWaitActive("Calculator");

        // Perform a simple addition using AutoIt
        autoIt.controlClick("Calculator", "", "133"); // Button 1
        autoIt.controlClick("Calculator", "", "93");  // Button +
        autoIt.controlClick("Calculator", "", "133"); // Button 1
        autoIt.controlClick("Calculator", "", "121"); // Button =

        // Get the result from the calculator
        String result = autoIt.controlGetText("Calculator", "", "150");

        // Assert the result is as expected
        assertEquals("2", result);

        // Close the calculator
        autoIt.winClose("Calculator");
    }

    @After
    public void tearDown() {
        if (autoIt != null) {
//            autoIt.release();
        }
    }
}