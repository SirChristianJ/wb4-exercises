package com.pluralsight;

public class NameFactory {
    private NameFactory(){}

   /* public static String getFirstName(String firstName){
        return firstName;
    }

    public static String getLastName(String lastName){
        return lastName;
    }

    public static String getMiddleName(String middleName){
        return middleName;
    }

    public static String getPrefix(String prefix){
        return prefix;
    }

    public static String getSuffix(String suffix){
        return suffix;
    }*/

    public static String format(String firstName, String lastName){
        return String.format("%s %s",firstName,lastName);
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix ){
        return String.format("%s %s %s %s, %s",prefix,firstName,middleName,lastName,suffix);
    }



    public static String format(String fullName){
        String[] splitFullName = fullName.split(" ");
        String output = "";

        switch (splitFullName.length){
            case 2:
                output = format(splitFullName[0],splitFullName[1]);
                break;
            case 3:
                output = String.format("%s %s %s",splitFullName[0],splitFullName[1],splitFullName[2]);
                break;
            case 4:
                output = String.format("%s %s %s %s",splitFullName[0],splitFullName[1],splitFullName[2],splitFullName[3]);
                break;
            case 5:
                output = format(splitFullName[0],splitFullName[1],splitFullName[2],splitFullName[3],splitFullName[4]);
                break;
        }

        return output;
    }
}
