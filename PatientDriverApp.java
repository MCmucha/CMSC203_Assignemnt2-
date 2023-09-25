/*
Class: CMSC203 CRN 21575 Program: Assignment 2 
Instructor: Grigoriy A. Grinberg 

Summary of Description: Write a class named Patient that has fields for the following data: • First name, middle name, and last name • Street Address, city, state, and ZIP code • Phone number (example 301-123-4567) • Name and phone number of emergency contact 

Due Date: 09/18/2023 
Integrity Pledge: I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. Matthew Mucha

 */



import java.util.Scanner;
public class PatientDriverApp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Get patient information
        System.out.print("Full Name (First Middle Last): ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");

        if (nameParts.length < 3) 
        {
            System.out.println("Invalid input for full name. Please provide first, middle, and last names.");
            scanner.close();
            return;
        }

        String firstName = nameParts[0];
        String middleName = nameParts[1];
        String lastName = nameParts[2];

        System.out.print("Street Address: ");
        String streetAddress = scanner.nextLine();

        System.out.print("Phone Number (e.g. 301-123-4567): ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Emergency Contact Name: ");
        String emergencyContactName = scanner.nextLine();

        System.out.print("Emergency Contact Phone: ");
        String emergencyContactPhone = scanner.nextLine();

        // Create patient object
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, phoneNumber, emergencyContactName, emergencyContactPhone);

        // Create procedure objects
        Procedure procedure1 = Procedure.createProcedureFromUserInput();
        Procedure procedure2 = Procedure.createProcedureFromUserInput();
        Procedure procedure3 = Procedure.createProcedureFromUserInput();

        // Display patient information
       
        System.out.println(patient);

        // Display procedure information
      
      
        System.out.println(procedure1);
      
        System.out.println(procedure2);
       
        System.out.println(procedure3);

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("\nTotal Charges: $" + String.format("%.2f", totalCharges));
        System.out.println(" ");
        
        
        System.out.println("Student Name: Matthew Mucha"); 
        System.out.println("MC#: M2112112"); 
        System.out.println("Due Date: 09/25/2023"); 
        scanner.close();
    }

    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) 
    {
        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
    }
}