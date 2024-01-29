package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PasswordValidator {

    //Checht ob alle Regeln eingehalten wurden
    public static boolean validatePassword(String password){
        return hasAtLeast8Chars(password) &&
        hasDigits(password) &&
        isUpperAndLowerCase(password) &&
        isNotCommonlyUsed(password) &&
        hasSpecialChars(password);
     }

    // Checkt ob das eingegebene Password mindestens 8 Zeichen lang ist
    public static boolean hasAtLeast8Chars(String password) {
        return password.length() >= 8;
    }

    //Checkt ob das eingegeben Password mindestens eine Ziffer enthält
    public static boolean hasDigits(String password) {
        return password.matches(".*\\d.*");
    }

    //Checkt ob das Password Groß- und Kleinbuchstaben enthält
    public static boolean isUpperAndLowerCase(String password) {
        return password.matches(".*[a-z].*") && password.matches(".*[A-Z].*");
    }

    //Checkt ob das Password stark ist
    public static boolean isNotCommonlyUsed(String password) {
        return !(password.matches("Password1")) && !(password.matches("Aa345678"));
    }

    //Checkt ob Sonderzeichen enthalten sind
    public static boolean hasSpecialChars(String password) {
        return password.matches(".*\\W.*");
    }

}