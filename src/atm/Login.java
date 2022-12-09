/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Otema Technologies
 */
public class Login {
    
    public static boolean login(int pin, int attempt)
{
    int storedpPin = 12345678;
    if (storedpPin == pin)
    {
        System.out.println("Login Successfull");
        return true;
    }
    else
    {
        int left = 3 - attempt;
        System.out.println("You have entered an  invalid Pin number!!! Please try again\n");
        if(left > 1){

        }else{
            
        }
        System.out.println("You have " + left+  " attempts left " );
        return false;
    }
}
    
}
