/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10439739_progr_part1;
/**
 *
 * @author Unarine Makumule
 */
public class Login {

    // Login user and verify the credentials
    public static boolean login(User user, String username, String password) {
        if (user == null) {
            System.out.println("No user found, please create an account first.");
            return false;
        }
        
        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            System.out.println("Login successful! Welcome " + user.getFirstName() + " " + user.getLastName());
            return true;
        } else {
            System.out.println("Login failed! Invalid username or password.");
            return false;
        }
    }
}