package com.co.soyjorgediaz5.testingform;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class EmailValidatorTest {

    // Correct Input
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue(){
        assertTrue(EmailValidator.isValidEmail("name@email.com"));
    }

    // Email with subdomain
    @Test
    public void emailValidator_CorrectEmailSubDomain_ReturnsTrue(){
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"));
    }

    // Without .com
    @Test
    public void emailValidator_InvalidEmailNoTld_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("name@email"));
    }

    // With extra characters
    @Test
    public void emailValidator_InvalidEmailDoubleDot_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("name@email..com"));
    }

    // With no username
    @Test
    public void emailValidator_InvalidEmailNoUsername_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("@email.com"));
    }

    // Empty Input
    @Test
    public void emailValidator_EmptyString_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail(""));
    }

    // Null value check
    @Test
    public void emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null));
    }

}
