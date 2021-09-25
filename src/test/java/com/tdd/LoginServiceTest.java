package com.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tdd.services.LoginService;

/**
 * Unit test for simple App.
 */
public class LoginServiceTest {

    @Test
    void testLogin() {
        
        String login = "test@gmail.com";
        String password = "test123456";

        boolean isLoggedIn = LoginService.login(login, password);

        assertEquals(true, isLoggedIn);

    }

}
