package org.example;

import java.security.SecureRandom;

public class PasswordGenerator {

    static String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String LOWER = "abcdefghijklmnopqrstuvwxyz";
    static String DIGITS = "0123456789";
    static String SPECIALS = "!@#$%^&*()-_+=<>?";

    public static String generateSecurePassword() {
        int randomLength = (int) (Math.random()*10);
        String characters = UPPER + LOWER + DIGITS + SPECIALS;

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < randomLength; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        String generatedPassword = password.toString();

        if (PasswordValidator.hasAtLeast8Chars(generatedPassword) && PasswordValidator.hasDigits(generatedPassword) && PasswordValidator.isUpperAndLowerCase(generatedPassword) && PasswordValidator.isNotCommonlyUsed(generatedPassword) && PasswordValidator.hasSpecialChars(generatedPassword)) {
            return generatedPassword;
        }
        return generateSecurePassword();
    }
}

