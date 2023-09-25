/*
Class: CMSC203 CRN 21575 Program: Assignment 2 
Instructor: Grigoriy A. Grinberg 

Summary of Description: Write a class named Patient that has fields for the following data: • First name, middle name, and last name • Street Address, city, state, and ZIP code • Phone number (example 301-123-4567) • Name and phone number of emergency contact 

Due Date: 09/18/2023 
Integrity Pledge: I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. Matthew Mucha

 */


import java.util.Scanner;

class Patient 
{
    private String firstName, middleName, lastName;
    private String streetAddress;
    private String phoneNumber;
    private String emergencyContactName, emergencyContactPhone;

    // Constructors
    public Patient() {}

    public Patient(String firstName, String middleName, String lastName)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Patient(String firstName, String middleName, String lastName, String streetAddress, String phoneNumber,
                   String emergencyContactName, String emergencyContactPhone) 
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Accessors
    public String getFirstName() 
    {
        return firstName;
    }

    public String getMiddleName() 
    {
        return middleName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public String getStreetAddress() 
    {
        return streetAddress;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getEmergencyContactName() 
    {
        return emergencyContactName;
    }

    public String getEmergencyContactPhone() 
    {
        return emergencyContactPhone;
    }

    // Mutators
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) 
    {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) 
    {
        this.streetAddress = streetAddress;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public void setEmergencyContactName(String emergencyContactName) 
    {
        this.emergencyContactName = emergencyContactName;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) 
    {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Methods
    public String buildFullName() 
    {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() 
    {
        return streetAddress;
    }

    public String buildEmergencyContact() 
    {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    @Override
    public String toString() 
    {
        return "Patient Information:\n" +
               "Full Name: " + buildFullName() + "\n" +
               "Address: " + buildAddress() + "\n" +
               "Phone Number: " + phoneNumber + "\n" +
               "Emergency Contact: " + buildEmergencyContact();
    }
}