package org.example;

import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {

    static String UPPER = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String LOWER = "abcdefghijklmnopqrstuvwxyz";
    static String DIGITS = "0123456789";
    static String SPECIALS = "!@#$%^&*()-_+=<>?";

    public static String generateSecurePassword() {

        String characters = UPPER + LOWER + DIGITS + SPECIALS;

        SecureRandom random = new SecureRandom();
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(characters.length());
            passwordBuilder.append(characters.charAt(randomIndex));
        }

        String password = passwordBuilder.toString();

        if (PasswordValidator.hasDigits(password) && PasswordValidator.isUpperAndLowerCase(password) && PasswordValidator.isNotCommonlyUsed(password) && PasswordValidator.hasSpecialChars(password)) {
            return password;
        }
        return generateSecurePassword();
    }
}

