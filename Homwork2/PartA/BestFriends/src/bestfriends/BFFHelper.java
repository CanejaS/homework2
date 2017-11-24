
package bestfriends;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * The BFFHelper class contains all of the functions/functionality that would've 
 * been in the main class in order to reduce the amount of code we see in it.
 */
public class BFFHelper 
{
    
    ArrayList<BestFriend> myBFFs;
    Scanner keyboard = new Scanner(System.in);
   
    /**
     * A constructor that takes no parameters and initializes the Array List of BestFriend Objects.
     */
    public BFFHelper()
    {
        myBFFs = new ArrayList<BestFriend>();
    }
    
    /**
     * the addABFF method will take inputs from the user send the inputs 
     * back as parameters to a new BestFriend Object and add then add
     * that Object to the ArrayList.
     */
    public void addABFF()
    {
        System.out.println("Enter a first name: ");
        String firstName = keyboard.next();
        System.out.println("Enter a last name: ");
        String lastName = keyboard.next();
        System.out.println("Enter a nick name: ");
        String nickName = keyboard.next();
        System.out.println("Enter a phone number: ");
        String cellPhone = keyboard.next();
        BestFriend aBFF = new BestFriend(firstName, lastName, nickName, cellPhone);
        myBFFs.add(aBFF);
        
        
    }
    
    /**
     * the changeABFF method will search for a the user that one wants to edit 
     * it then creates a menu to decide what the user wants to change 
     * we create a new bestFriend Object to hold the value of the ArrayList found
     * by the search method which returns an index with the location of the found 
     * object with this we can edit each individual part of the object and
     * write it back to the ArrayList.
     * 
     */
    public void changeABFF()
    {
        int index =0,userChoice;
        index = searchABFF();
        String firstName, lastName, nickName,phoneNumber;
        BestFriend currentObj = new BestFriend();
        Scanner choice = new Scanner(System.in);
        Scanner change = new Scanner(System.in);
        if(index >= 0)
        {
            do
            {
            currentObj = myBFFs.get(index);
            System.out.println("What would you Like to Change for this user.");
            System.out.println("1. Change Friends Name. ");
            System.out.println("2. Change Friends Last Name. ");
            System.out.println("3. Change Friends Nickname. ");
            System.out.println("4. Change Friends Phone Number. ");
            System.out.println("5. Exit Sub-menu. ");
            userChoice = choice.nextInt();
            
            switch(userChoice)
            {
                case 1: 
                {
                    System.out.print("What would be the new name for your friend? ");
                    firstName = change.next();
                    currentObj.setName(firstName);
                    myBFFs.set(index, currentObj);
                    break;
                }
                case 2:
                {
                    System.out.print("What would be the new Last name for the user? ");
                    lastName = change.next();
                    currentObj.setLastName(lastName);
                    myBFFs.set(index, currentObj);
                    break;
                }
                case 3:
                {
                    System.out.println("What would be the new nickname for your friend? ");
                    nickName = change.next();
                    currentObj.setNickName(nickName);
                    myBFFs.set(index, currentObj);
                    break;
                }
                case 4:
                {
                    System.out.println("What would be the new phone number for your friend? ");
                    phoneNumber = change.next();
                    currentObj.setPhoneNumber(phoneNumber);
                    myBFFs.set(index, currentObj);
                    break;
                }
                case 5:
                {
                    System.out.println("Exit");
                    break;
                }
                default :
                {
                    System.out.println("Not an Option within the Submenu. ");
                }
            }
            
            }while(userChoice != 5);

            
            
        }
    }
    
    /**
     * The displayABFF method will check if the ArrayList is empty if its not empty 
     * The user will be asked what they want with a choice to display one or all members 
     * of the arrayList and display accordingly. 
     */
    public void displayABFF()
    {
        Scanner menuInput = new Scanner(System.in);
        int menuChoice = 0;
        
        if(myBFFs.isEmpty())
        {
            System.out.println("The ArrayList is Empty Please get some friends!! ");
        }
        else
        {
            System.out.println("Please chooce an option from the submenu. ");
            System.out.println("1. Display a single user. ");
            System.out.println("2. Display everyone. ");
            menuChoice = menuInput.nextInt();
            switch(menuChoice)
            {
                case 1:
                {
                    int foundIndex = searchABFF();
                    if(foundIndex >= 0)
                    {
                        System.out.println(myBFFs.get(foundIndex));
                    }
                    break;
                }
                case 2:
                {
                    for(BestFriend friends :myBFFs)
                    {
                        System.out.println(friends);
                    }
                    break;
                }
                default:
                {
                    System.out.println("Wrong user Input... Not a menu Option. ");
                }
            }

        }
    }
    
    /**
     * The removeABFF searches for a user on the ArrayList and removes that user
     * with the index returned by the search method.
     */
    public void removeABFF()
    {
        int removeIndex =0;
        removeIndex = searchABFF();
        if(removeIndex >= 0)
        {
            myBFFs.remove(removeIndex);
        }
    }
    
    /**
     * The searchABFF method will take and name and last name input from the user
     * and create a BestFriend object with those two parameters then compare that 
     * object with every element inside the ArrayList if they are equal we break 
     * the loop by returning the index of the ArrayList.
     * @return 
     */
    public int searchABFF()
    {
        String aName, aLastN;
        Scanner userInput = new Scanner(System.in);
        int index;
       // boolean state = false;
       // BestFriend temp = new BestFriend();
        
        System.out.println("Please enter the name of the user you'd like to Change, Display or Remove ");
        aName = userInput.next();
        System.out.println("Please enter the last Name of the person you would like to Change Display or Remove ");
        aLastN = userInput.next();
        
        BestFriend currentObj = new BestFriend(aName, aLastN);
        
        for(index = 0; index < myBFFs.size(); index++)
        {
            if(currentObj.equals(myBFFs.get(index)))
            {
             //   temp = myBFFs.get(index);
                return index;
            }
        }
        return -1;
    }
    

    
    
}


