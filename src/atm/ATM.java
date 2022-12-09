/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author Otema Technologies
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;
        double balance = 15000.00;
        int choose;
        int myPin;
        boolean again = true;
        int loginAttempt = 1;
        boolean success = false;

        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Pin Number");
            myPin = input.nextInt();
            if(Login.login(myPin, loginAttempt)){
                success = true;
                while(again){
                    Menu.mainMenu();
                    option = input.nextInt();
                }
            }else{
                success = false;
            }
            loginAttempt += 1;
        }while(loginAttempt <=3 && !success);
        
    } 
    
}
