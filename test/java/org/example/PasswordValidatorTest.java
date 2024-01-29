package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    // hasAtLeast8Chars
    @Test
    void hasAtLeast8Chars_when5Chars_returnFalse(){
        assertFalse(PasswordValidator.hasAtLeast8Chars("Gurke"));
    }

    @Test
    void hasAtLeast8Chars_when9Chars_returnTrue(){
        assertTrue(PasswordValidator.hasAtLeast8Chars("Zarnowski"));
    }

    //hasDigits
    @Test
    void hasDigits_whenGurke187_returnTrue(){
        assertTrue(PasswordValidator.hasDigits("Gurke187"));
    }

    @Test
    void hasDigits_whenGurke_returnTrue(){
        assertFalse(PasswordValidator.hasDigits("Gurke"));
    }

    //isUpperAndLowerCase
    @Test
    void isUpperAndLowerCase_when_gurke_returnFalse(){
        assertFalse(PasswordValidator.isUpperAndLowerCase("gurke"));
    }

    @Test
    void isUpperAndLowerCase_whenGurke_returnTrue(){
        assertTrue(PasswordValidator.isUpperAndLowerCase("Gurke"));
    }

    @Test
    void isUpperAndLowerCase_whenGURKE_returnFalse(){
        assertFalse(PasswordValidator.isUpperAndLowerCase("GURKE"));
    }
    @Test
    void isUpperAndLowerCase_when_guRke_returnTrue(){
        assertTrue(PasswordValidator.isUpperAndLowerCase("guRke"));
    }

    //isCommonlyUsed
    @Test
    void isNotCommonlyUsed_whenPassword1_returnsFalse(){
        assertFalse(PasswordValidator.isNotCommonlyUsed("Password1"));
    }

    @Test
    void isNotCommonlyUsed_whenAa345678_returnsFalse(){
        assertFalse(PasswordValidator.isNotCommonlyUsed("Aa345678"));
    }

    @Test
    void isNotCommonlyUsed_whenGurkePaprika187_returnsTrue(){
        assertTrue(PasswordValidator.isNotCommonlyUsed("GurkePaprika187"));
    }

    //hasSpecialChars
    @Test
    void hasSpecialChars_whenGurkeHashtag187_returnTrue(){
        assertTrue(PasswordValidator.hasSpecialChars("Gurke#187"));
    }

    @Test
    void hasSpecialChars_whenGurke187_returnFalse(){
        assertFalse(PasswordValidator.hasSpecialChars("Gurke187"));
    }
}