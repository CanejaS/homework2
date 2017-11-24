/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friendslist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author cadelmonterde
 */
public class FriendsList {

    /**
     * @param args the command line arguments
     */
    public static Boolean added = false;
    
    public static void main(String[] args) 
    {
        String name, lastN, nName, phone;
        int choice = 0;
       // Boolean added = false;
        //public static int b;
        
        FriendsList funcs = new FriendsList();
        ArrayList<BestFriend> myBestFriends = new ArrayList();
        Scanner menuChoice = new Scanner(System.in);
        Scanner arguments = new Scanner(System.in);
        //choice = menuChoice.nextInt();
        
        while(choice != 5)
        {
            System.out.println("Please Select an Option from the main menu");

            System.out.println("1.) Add a Best Friend!");
            System.out.println("2.) Change Best Friend Props!");
            System.out.println("3.) Remove a Best Friend!");
            System.out.println("4.) Display Friends!");
            System.out.println("5.) Exit!");
            choice = menuChoice.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Please enter your friends Name: ");
                    name  = arguments.next();
                    System.out.print("Please enter your friends Last Name: ");
                    lastN = arguments.next();
                    System.out.print("Please enter your friends Nickname: ");
                    nName = arguments.next();
                    System.out.print("Please enter your friends Phone Number: ");
                    phone = arguments.next();
                    funcs.addBestFriend(myBestFriends, name, lastN, nName, phone);
                    break;
                }
                case 2:
                {
                    System.out.println("Please Enter your friend's name to eddit");
                    name  = arguments.next();
                    System.out.print("Please enter your friend's Last Name: ");
                    lastN = arguments.next();
                    funcs.changeFriend(myBestFriends, name, lastN);
                    break;
                }
                case 3:
                {
                    System.out.print("Please enter your friend's Name: ");
                    name  = arguments.next();
                    System.out.print("Please enter your friend's Last Name: ");
                    lastN = arguments.next();
                    funcs.removeFriend(myBestFriends, name, lastN);
                    break;
                }
                case 4:
                {
                    funcs.displayFriends(myBestFriends);
                    break;
                }
                case 5:
                {
                    break;
                }
            }
            
        }
       // friends.setName("billy");
       // friends.setLastName("hunter");
       // myBestFriends.add(friends);
        

    }
    public void addBestFriend(ArrayList<BestFriend> aMyBestFriends,String aName,String aLastN,String aNName,String aPhone)
    {
        BestFriend friends = new BestFriend(aName,aLastN,aNName,aPhone);
        aMyBestFriends.add(friends);
    }
    public void displayFriends(ArrayList<BestFriend> aMyBestFriends)
    {
        if(aMyBestFriends.isEmpty())
        {
            System.out.println("Array List is Empty \n");
        }
        for(BestFriend hold : aMyBestFriends)
        {
            System.out.println(hold);
        }
    }
    public void changeFriend(ArrayList<BestFriend> aMyBestFriends,String aName,String aLastN)
    {
        Scanner newUserIn = new Scanner(System.in);
        String newName, newLastName, newNickname,newPhoneNumber;
        
        int index;
        boolean state = false;
        BestFriend temp = new BestFriend();
      
        BestFriend hold = new BestFriend(aName, aLastN);
        for(index = 0; index < aMyBestFriends.size(); index++)
        {
            if(hold.equals(aMyBestFriends.get(index)))
            {
                state = true;
                temp = aMyBestFriends.get(index);
                break;
            }
        }
        
        if(state)
        {
           // temp.setLastName(adsfasdf);
          //  index = aMyBestFriends.indexOf(hold);
            System.out.println("\n Processing Change Request \n");
            System.out.println("Please Input Name: ");
            newName = newUserIn.next();
            System.out.println("Please Input Last Name: ");
            newLastName = newUserIn.next();
            System.out.println("Please Input Nickname: ");
            newNickname = newUserIn.next();
            System.out.println("Please Input Phone Number: ");
            newPhoneNumber = newUserIn.next();
            
            temp.setName(newName);
           // hold.setName(newName);
           // hold.setLastName(newLastName);
            //hold.getNickName();
           // hold.setPhoneNumber(newPhoneNumber);
          //  aMyBestFriends.remove(index);
            aMyBestFriends.set(index,temp);
        }
        else
        {
            System.out.println("User Not Found \n");
        }
    }
    public void removeFriend(ArrayList<BestFriend> aMyBestFriends, String name, String lastName)
    {
        BestFriend hold = new BestFriend(name,lastName,"","");
        hold.setLastName(lastName);
        hold.setName(name);
        if(aMyBestFriends.contains(hold))
        {
            aMyBestFriends.remove(aMyBestFriends.indexOf(hold));
        }
        else
        {
            System.out.println("\n Does Not exist \n" + "name " + hold);
        }
    }
    
}
