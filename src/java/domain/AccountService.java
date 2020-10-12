/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import domain.User;

/**
 *
 * @author 832676
 */
public class AccountService {
    private final String validateUser1="adam";
    private final String validateUser2="betty";
    private final String password="password";
    private User user;
    public User login(String username, String passwords) {
    
        if(username.equals(validateUser1)&& passwords.equals(password))
        {
         user=new User(username,password);
         user.setPassword(null);
                
         }
        else if( username.equals(validateUser2) &&passwords.equals(password))
        {
             user=new User(username,password);
         user.setPassword(null);
        }
    return user;
}
}