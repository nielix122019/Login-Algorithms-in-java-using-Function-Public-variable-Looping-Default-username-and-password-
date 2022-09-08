/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_system;
import java.util.Scanner;
/**
 *
 * @author Neil
 */
public class Login_system {
public static Scanner in = new Scanner(System.in);
public static String Username,Password,Logout;
public static boolean status = true;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainFunction();
    }
    public static void mainFunction()
    {
        try
        {
            System.out.println("Welcome to my login system");
            LoginFunction();
        }
        catch(Exception ex)
        {
            System.out.println("Please call the administrator " + ex.getMessage());
        }
                
    }
    
    public static void LoginFunction()
    {
        while(status)
        {
            System.out.print("\nUsername: ");
            Username = in.next().toLowerCase();
            System.out.print("Password: ");
            Password = in.next().toLowerCase();
            
            if(Username.equals("admin") && Password.equals("admin"))
            {
                System.out.println("Welcome to admin dashboard");
                
                while(status)
                {
                    System.out.print("\nDo you want to logout: \nYes \nNo \nEnter Here: ");
                    Logout = in.next().toLowerCase();
                    if(Logout.equals("Yes"))
                    {
                        System.out.println("Thank you!");
                        status = false;
                    }
                    else
                    {
                        System.out.println("Welcome back admin\n");
                        status = true;
                    }
                }
            }
            else if(Username.equals("cashier") && Password.equals("qwerty"))
            {
                System.out.println("Welcome to cashier dashboard");
                
                while(status)
                {
                    System.out.print("\nDo you want to logout: \nYes \nNo \nEnter Here: ");
                    Logout = in.next().toLowerCase();
                    if(Logout.equals("Yes"))
                    {
                        System.out.println("Thank you!");
                        status = false;
                    }
                    else
                    {
                        System.out.println("Welcome back cashier");
                        status = true;
                    }
                }
            }
            else
            {
                System.out.println("Invalid username and password!! \nPlease try again!!\n");
            }
        }
    }
}
