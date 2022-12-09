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
public class Menu {
    
    public static void mainMenu(){
        System.out.println("******************Hello!*******************\n");
        System.out.println("**********Welcome to ATM Banking***********\n\n");
        System.out.println("****Please choose one of the options below****\n\n");
        System.out.println("< 1 >  Check Balance\n");
        System.out.println("< 2 >  Deposit\n");
        System.out.println("< 3 >  Withdraw\n");
        System.out.println("< 4 >  Exit\n\n");
    }
    //exit menu
     public static void exitMenu(){
        System.out.println("--------------Remember to take your receipt!!!------------------\n");
        System.out.println("-----Thank you for using ATM Banking Machine!!!-----\n");
    }
    
}
