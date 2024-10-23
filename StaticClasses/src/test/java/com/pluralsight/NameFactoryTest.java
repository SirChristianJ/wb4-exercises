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
        String expected = String.format("%s %s %s %s, %s",prefix,fName,mName,lName,suffix);
        assertEquals(expected,NameFactory.format(prefix,fName,mName,lName,suffix));
    }

    @Test
    public void format_shouldFormat_withFullName(){
        String prefix = "Dr.";
        String fName = "Mel";
        String mName = "B";
        String lName = "Johnson";
        String suffix = "PhD";
        String expected = String.format("%s %s %s %s, %s",prefix,fName,mName,lName,suffix);
        assertEquals(expected,NameFactory.format(String.format("%s %s %s %s %s",prefix,fName,mName,lName,suffix)));
    }



    @Test
    public void format_shouldFormat_allOptionalFields2(){
        String prefix = "Dr.";
        String fName = "Mel";
        String mName = "B";
        String lName = "Johnson";
        String suffix = "PhD";
        String expectedValue = "Dr. Mel B Johnson, PhD";
        assertEquals(expectedValue,NameFactory.format(prefix,fName,mName,lName,suffix));
    }

    @Test
    public void format_shouldFormat_withFullName2(){
        String fullName = "Matt Christenson";
        String expectedValue = "Matt Christenson";

        assertEquals(expectedValue,NameFactory.format(fullName));
    }

    @Test
    public void format_shouldFormat_withPrefix(){
        String prefix = "Dr.";
        String fName = "Mel";
        String lName = "Johnson";
        String expected = String.format("%s %s %s",prefix,fName,lName);
        assertEquals(expected,NameFactory.format(String.format("%s %s %s",prefix,fName,lName)));
    }

    @Test
    public void format_shouldFormat_withSuffix(){
        String suffix = "PhD.";
        String fName = "Mel";
        String lName = "Johnson";
        String expected = String.format("%s %s, %s",fName,lName, suffix);
        assertEquals(expected,NameFactory.format(String.format("%s %s, %s",fName,lName,suffix)));
    }

    @Test
    public void format_shouldFormat_withMiddleName(){
        String mName = "B";
        String fName = "Mel";
        String lName = "Johnson";
        String expected = String.format("%s %s, %s",fName, mName, lName);
        assertEquals(expected,NameFactory.format(String.format("%s %s, %s",fName,mName, lName)));
    }
}