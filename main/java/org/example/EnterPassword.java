package org.example;

import java.util.Scanner;

public class EnterPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter password:");
        input = scanner.nextLine();

        if(PasswordValidator.isSafe(input)){
            System.out.println("Password validated");
        } else if (input.equals("?")){
            input = PasswordGenerator.generateSecurePassword();
            System.out.println(input);
        } else {
            System.out.println("Password not validated");
        }
    }
}
