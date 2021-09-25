package com.tdd.services;

public class LoginService {

   public static boolean login(String login, String password){

        if(password.length() < 3 || login.isEmpty()){
            return false;
        }
        return true;
    }
    
}
