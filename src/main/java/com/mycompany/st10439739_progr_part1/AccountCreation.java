/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10439739_progr_part1;
/**
 *
  * @author Unarine Makumule
 */
import java.util.regex.Pattern;

public class AccountCreation {
    
    // Check if the username is valid
    public static boolean isValidUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Check if the password is valid
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        if (!Pattern.compile("[A-Z]").matcher(password).find()) return false; // Must contain an uppercase letter
        if (!Pattern.compile("[0-9]").matcher(password).find()) return false; // Must contain a number
        if (!Pattern.compile("[^a-zA-Z0-9]").matcher(password).find()) return false; // Must contain a special character
        return true;
    }

    // Create a new user account
    public static User createAccount(String username, String password, String firstName, String lastName) 
    {
        return new User(username, password, firstName, lastName);
    }
}


