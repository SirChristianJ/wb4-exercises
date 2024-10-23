package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {
    @Test
    public void format_shouldFormat_RequiredFields(){
        String fName = "Christian";
        String lName = "Jimenez";
        String expected = fName + " " + lName;
        assertEquals(expected,NameFactory.format(fName,lName));
    }

    @Test
    public void format_shouldFormat_allOptionalFields(){
        String prefix = "Dr.";
        String fName = "Mel";
        String mName = "B";
        String lName = "Johnson";
        String suffix = "PhD";
        String expectedValue = "Dr. Mel B Johnson, PhD";
        assertEquals(expectedValue,NameFactory.format(prefix,fName,mName,lName,suffix));
    }

    @Test
    public void format_shouldFormat_withFullName(){
        String fullName = "Matt Christenson";
        String expectedValue = "Matt Christenson";

        assertEquals(expectedValue,NameFactory.format(fullName));
    }

    @Test
    public void format_shouldFormat_withPrefix(){
        String fullName = "Dr. Mel B Johnson";
        String expected = "Dr. Mel B Johnson";
        assertEquals(expected,NameFactory.format(fullName));
    }

    @Test
    public void format_shouldFormat_withSuffix(){
        String fullName = "Mel B Johnson, PhD.";
        String expected = "Mel B Johnson, PhD.";
        assertEquals(expected,NameFactory.format(fullName));
    }

    @Test
    public void format_shouldFormat_withMiddleName(){
        String fullName = "Mel B Johnson";
        String expected = "Mel B Johnson";
        assertEquals(expected,NameFactory.format(fullName));
    }
}