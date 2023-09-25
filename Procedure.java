/*
Class: CMSC203 CRN 21575 Program: Assignment 2 
Instructor: Grigoriy A. Grinberg 

Summary of Description: Write a class named Patient that has fields for the following data: • First name, middle name, and last name • Street Address, city, state, and ZIP code • Phone number (example 301-123-4567) • Name and phone number of emergency contact 

Due Date: 09/18/2023 
Integrity Pledge: I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. Matthew Mucha

 */



import java.util.Scanner;
class Procedure 
{
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;

    // Constructors
    public Procedure() {}

    public Procedure(String procedureName, String procedureDate) 
    {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) 
    {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Accessors and Mutators

    public String getProcedureName() 
    {
        return procedureName;
    }

    public void setProcedureName(String procedureName) 
    {
        this.procedureName = procedureName;
    }

    public String getProcedureDate() 
    {
        return procedureDate;
    }

    public void setProcedureDate(String procedureDate) 
    {
        this.procedureDate = procedureDate;
    }

    public String getPractitionerName() 
    {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) 
    {
        this.practitionerName = practitionerName;
    }

    public double getCharges()
    {
        return charges;
    }

    public void setCharges(double charges) 
    {
        this.charges = charges;
    }

    public String toString() 
    {
        return "Procedure Information:\n" +
                "Procedure Name: " + procedureName + "\n" +
                "Procedure Date: " + procedureDate + "\n" +
                "Practitioner Name: " + practitionerName + "\n" +
                "Charges: $" + String.format("%.2f", charges);
    }

    // Additional Constructor to take user input
    public static Procedure createProcedureFromUserInput() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Procedure Name: ");
        String procedureName = scanner.nextLine();

        System.out.print("Procedure Date (e.g. 06/12/2023): ");
        String procedureDate = scanner.nextLine();

        System.out.print("Practitioner Name: ");
        String practitionerName = scanner.nextLine();

        System.out.print("Charges: ");
        double charges = scanner.nextDouble();

        return new Procedure(procedureName, procedureDate, practitionerName, charges);
    }
}