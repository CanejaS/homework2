package friendslist;
import java.lang.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cadelmonterde
 */
public class BestFriend 
{
    private static int friendNumber =0;
    private int friendIdNumber;
    private String firstName;
    private String lastName;
    private String nickName;
    private String cellPhoneNumber;
    
    public BestFriend()
    {
        
    }
    
    public BestFriend(String aFirstName, String aLastName, String aNickName, String aCellPhoneNumber)
    {
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.nickName = aNickName;
        this.cellPhoneNumber = aCellPhoneNumber;
        friendNumber++;
        friendIdNumber = friendNumber;
    }
    public BestFriend(String name, String lastName)
    {
        this.firstName = name;
        this.lastName = lastName;
    }
    
    @Override
    public String toString()
    {
        return friendIdNumber + ". " + nickName + " " + firstName + " " + lastName + " " + cellPhoneNumber;
    }
    
    public void setName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getName()
    {
        return this.firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    
    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }
    public String getNickName()
    {
        return this.nickName;
    }
    public void setPhoneNumber(String cellPhoneNumber)
    {
        this.cellPhoneNumber = cellPhoneNumber;
    }
    public String getPhoneNumber()
    {
        return this.cellPhoneNumber;
    }
    public void setFriendIdNumber(int friendIdNumber)
    {
        this.friendIdNumber = friendIdNumber;
    }
    public int getFriendIdNumber()
    {
        return this.friendIdNumber;
    }
    @Override
    public boolean equals(Object another)
    {  
        if(another instanceof BestFriend)
        {   
            BestFriend anotherBFF = (BestFriend) another;
            if(firstName.equalsIgnoreCase(anotherBFF.firstName) 
               && lastName.equalsIgnoreCase(anotherBFF.lastName))
            {
                return true;
            }
        
        }
    
        return false;
    }
}
// object newobJ = new Object(...,...) 
// object.equals(arrayList.get(i))