/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10439739_progr_part1;
import java.util.Scanner;
/**
 *
 * @author Unarine Makumule
 */
public class ST10439739_PROGR_PART1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = null;
        String username, password, firstName, lastName;

        // Keep asking for valid account creation details using a while loop
        boolean isAccountCreated = false;

        System.out.println("Create an account");

        while (!isAccountCreated) { 
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            System.out.print("Enter first name: ");
            firstName = scanner.nextLine();
            System.out.print("Enter last name: ");
            lastName = scanner.nextLine();

            if (!AccountCreation.isValidUsername(username)) {
                System.out.println("Invalid username! Username must contain an underscore and be no more than 5 characters long.");
            } else if (!AccountCreation.isValidPassword(password)) {
                System.out.println("Invalid password! Password must be at least 8 characters long, contain a capital letter, a number, and a special character.");
            } else {
                user = AccountCreation.createAccount(username, password, firstName, lastName);
                isAccountCreated = true;
                System.out.println("\nAccount created successfully!");
            }
        }

        // Proceed to login if account creation is successful
        if (user != null) {
            System.out.println("\nLogin:");
            System.out.print("Enter username: ");
            String loginUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String loginPassword = scanner.nextLine();

            // Attempt login
            Login.login(user, loginUsername, loginPassword);
        } else {
            System.out.println("\nFailed to create account. Please try again.");
        }

        scanner.close();
    }
}


