package friendslistarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The FriendsListArrayHelper class contains all of the functions/functionality that would've 
 * been in the main class in order to reduce the amount of code we see in it.
 */
public class FriendsListArrayHelper {
    //Initialize Object Array Reference Here 
    BestFriend[] friendHolder;
    
    //Public Constructor to initialize the array to the given size
    public FriendsListArrayHelper()
    {
        friendHolder = new BestFriend[10];
    }
    
    /**
     * the addFriend method will take inputs from the user send the inputs 
     * back as parameters to a new BestFriend Object and add then add
     * that Object to one of the elements in the array.
     */       
    public void addFriend()
    {
        Scanner arguments = new Scanner(System.in);
        System.out.print("Please enter your friends Name: ");
        String firstName   = arguments.next();
        System.out.print("Please enter your friends Last Name: ");
        String lastName    = arguments.next();
        System.out.print("Please enter your friends Nickname: ");
        String nickName    = arguments.next();
        System.out.print("Please enter your friends Phone Number: ");
        String phoneNumber = arguments.next();
        
        BestFriend[] copy;
        BestFriend hold = new BestFriend(firstName, lastName, nickName, phoneNumber);
        friendHolder[hold.getFriendIdNumber()-1] = hold;
        
        if(hold.getFriendIdNumber() == friendHolder.length)
        {
            copy = Arrays.copyOf(friendHolder, hold.getFriendIdNumber()+10);
            friendHolder = copy;
        }

    }
    
    /**
     * The dispFriends method will ask the user what they want with a choice 
     * to display one or all members of the arrayList and display accordingly. 
     */
    public void dispFriends()
    {
        Scanner menuChoice = new Scanner(System.in);
        int userMenuSelect = 0;
        int size = 0;
        System.out.println("Please make a selection from the user menu. ");
        System.out.println("1. Display a single Friend. ");
        System.out.println("2. Display all of your friends in the phonebook array App. ");
        System.out.println("Press Anything Else to Exit the program");
        userMenuSelect = menuChoice.nextInt();
        switch(userMenuSelect)
        {
            case 1:
            {
                int index = 0;
                index = search();
                if(index != -1)
                {
                    if(friendHolder[index] != null)
                    System.out.println(friendHolder[index]);
                }
                else
                {
                    System.out.println("\n This user is not in your best friend book :( \n");
                }
                break;
            }
            case 2:
            {
                
                for (int i =0; i < friendHolder.length; i ++)
                {
                    
                      if(friendHolder[i] != null)
                     {
                        System.out.println(friendHolder[i]);
                     }
                } 
                break;
            }
            default :
            {
                System.out.println("Exit Condition has been met. \n");
            }
        }

    }
    
    /**
     * the changeFriend method will search for the user that one wants to edit 
     * it then creates a menu to decide what the user wants to change 
     * we create a new bestFriend Object to hold the value of the array found
     * by the search method which returns an index with the location of the found 
     * object with this we can edit each individual part of the object and
     * write it back to the array.
     * 
     */
    public void changeFriend()
    {
        Scanner userInput = new Scanner(System.in);
        Scanner change = new Scanner(System.in);
        String name, lastName,nickname, phoneNumber;
        BestFriend friend;// = new BestFriend();
        int userChoice = 0;
        int index =0;
        index = search();
        friend = null;
        if(index > 0)
            friend = friendHolder[index];

        if(index >= 0)
        {
            System.out.println("What changes would you like to change from your friends info ?");
            System.out.println("1. Change the name. ");
            System.out.println("2. Change the last Name. ");
            System.out.println("3. Change the nickname. ");
            System.out.println("4. Change the phoneNumber ");
            userChoice = userInput.nextInt();
            switch(userChoice)
            {
                case 1:
                {
                    System.out.println("What would the new name be? ");
                    name = change.next();
                    friend.setName(name);
                    friendHolder[index] = friend;
                    break;
                }
                case 2:
                {
                    System.out.println("What would the new last name be? ");
                    lastName = change.next();
                    friend.setLastName(lastName);
                    friendHolder[index] = friend;
                    break;
                }
                case 3:
                {
                    System.out.println("What would the new nickname be? ");
                    nickname = change.next();
                    friend.setNickName(nickname);
                    friendHolder[index] = friend;
                    break;
                }
                case 4:
                {
                    System.out.println("What would the new phone number be? ");
                    phoneNumber = change.next();
                    friend.setPhoneNumber(phoneNumber);
                    friendHolder[index] = friend;
                    break;
                }
                default: 
                    System.out.println("Not a Correct user choice ");
            }
        }
        else
        {
            System.out.println(" \n You have no Friends :( \n");
        }
    }
    
    /**
     * The remove method will copy the values of the old string into a new string
     * without copying the value found by the search method which is the one being
     * removed from the array and we make the old array point to the new one.
     */
    public void remove()
    {
        int searchIndex = search();
        int j =0;
        BestFriend[] hold = new BestFriend[friendHolder.length-1];//need to care of this when theres only a single element...
        BestFriend changeID = new BestFriend();
        if(searchIndex > 0)
        {
            for(int i =0; i <friendHolder.length-1;i++)
            {
                
                if(i == searchIndex) i+=1;
                
                if(i != searchIndex)
                {
                    hold[j] = friendHolder[i];
                }
                j++;
            }
            friendHolder = hold;
        }
        else if(searchIndex == 0)
        {
            if(changeID.getFriendIdNumber() == 1)
            {
            friendHolder[searchIndex] = null;
            }
            else
            {
                for(int k= 0,y=1; y <friendHolder.length; y++,k++)
                {
                    hold[k] = friendHolder[y];
                }
                friendHolder = hold;
            }
        }
        else
            System.out.println("BRUH ARRAY IS EMPTY...");
            
    }
    
    /**
     * The search method will take a name and last name input from the user
     * and create a BestFriend object with those two parameters then compare that 
     * object with every element inside the array if they are equal we break 
     * the loop by returning the index of the array if the object is not in the
     * array we return -1.
     * @return 
     */
    public int search()
    {
        int index =0;
        Scanner userInput = new Scanner(System.in);
        String name,lastName;
        
        System.out.println("Please enter a name:");
        name = userInput.next();
        System.out.println("Please enter a last name:");
        lastName = userInput.next();
        BestFriend friend = new BestFriend(name,lastName);
        for(index = 0; index <= friend.getFriendIdNumber(); index++)
        {
            if(friendHolder[0] == null)    
            {
                return -1;
            }
            if(friendHolder[index].equals(friend))
            {
                return index;
            }
        }
        return -1;
    }
}
