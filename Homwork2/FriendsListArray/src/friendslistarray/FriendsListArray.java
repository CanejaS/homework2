/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friendslistarray;
import java.util.Scanner;

/**

  Title:           Programming Assignment #2.b -PhoneBook Array
  Semester:        COP3337 – Fall 2017
  @author          5793866
  Instructor:      C. Charters
  
   Due Date:       09/30/2017

    This program creates a phone book where you can add and manage your Best Friends with. 
    * Its menu comes with the following functionality, Add a new friend, change his information,
    * remove a friend from the Phone-Book, Display friend/s information and exit!
 */
public class FriendsListArray {
    
    /** 
     * The main method creates the main menu to be displayed to the user as well 
     * as an instance of the helper class to call upon its methods.
     * @param args 
     */
    public static void main(String[] args) 
    {
        FriendsListArrayHelper instance = new FriendsListArrayHelper();
        Scanner menuChoiceInput = new Scanner(System.in);
        
        int menuChoice = 0;
        do
        {   
            System.out.println("\n Please Select An Option From The Menu: \n");
            System.out.println("1.) Add Friend ");
            System.out.println("2.) Change Friend Info  ");
            System.out.println("3.) Remove Friend From Book ");
            System.out.println("4.) Display Friends From Book ");
            System.out.println("5. Exit ");
            menuChoice = menuChoiceInput.nextInt();
            
            switch(menuChoice)
            {
                case 1:
                {
                    instance.addFriend();
                    break;
                }
                case 2:
                {
                    instance.changeFriend();
                    break;
                }
                case 3:
                {
                    instance.remove();
                    break;
                }
                case 4:
                {
                    instance.dispFriends();
                    break;
                }
                case 5:
                {
                    break;
                }
                default :
                    System.out.println("\n Wrong... Input is not part of a menu item. \n");
            }
        } while(menuChoice != 5);
    }

}