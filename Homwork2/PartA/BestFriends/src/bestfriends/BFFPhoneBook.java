package bestfriends;
import java.util.Scanner;
/**

  Title:           Programming Assignment #2 -PhoneBook
  Semester:        COP3337 – Fall 2017
  @author          5793866
  Instructor:      C. Charters
  
   Due Date:       09/04/2017

    This program creates a phone book where you can add and manage your Best Friends with. 
    * Its menu comes with the following functionality, Add a new friend, change his information,
    * remove a friend from the Phone-Book, Display friend/s information and exit!
 */
public class BFFPhoneBook 
{
    /** 
     * The main method creates the main menu to be displayed to the user as well 
     * as an instance of the helper class to call upon its methods.
     * @param args 
     */
    public static void main(String args[])
    { 
        int menuOption = 0;
        Scanner keyboard = new Scanner(System.in);
        BFFHelper myHelper = new BFFHelper();
      
        do
        {
            
            System.out.println("1.  Add a Friend");
            System.out.println("2.  Change a Friend");
            System.out.println("3.  Remove a Friend");
            System.out.println("4.  Display a Friend");
            System.out.println("5.  Exit");
            
            System.out.print("Enter your selection: ");
            menuOption = keyboard.nextInt();
            
            switch (menuOption)
            {
                case 1:
                    myHelper.addABFF();
                    break;
                case 2:
                    myHelper.changeABFF();
                    break;
                case 3:
                    myHelper.removeABFF();
                    break;
                case 4:
                    myHelper.displayABFF();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option.  Enter 1 - 5");
                    
            }
            
            
            
        } while (menuOption != 5);
    }
    
    
    
}
