package bestfriends;

/**
 *The BestFriend Class creates the getters and setters method as well as
 * declaring different constructors to initialize variables every time an 
 * object is made 
 */

public class BestFriend 
{
    private static int friendNumber =0;
    private int friendIdNumber;
    private String firstName;
    private String lastName;
    private String nickName;
    private String cellPhoneNumber;
    
    /**
     * No argument constructor object used to create a BestFriend Object and 
     * remove the initialization warning given by the compiler.
     */
    public BestFriend()
    {
        
    }
    
    /**
     * A constructor to initialize the private variables of the class.
     * @param aFirstName 
     * @param aLastName
     * @param aNickName
     * @param aCellPhoneNumber
     * 
     */
    public BestFriend(String aFirstName, String aLastName, String aNickName, String aCellPhoneNumber)
    {
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.nickName = aNickName;
        this.cellPhoneNumber = aCellPhoneNumber;
        friendNumber++;
        friendIdNumber = friendNumber;
    }
    /**
     * A constructor to initialize just the first and last name of a 
     * user this will later on be useful on our search method.
     * @param name
     * @param lastName 
     */
    public BestFriend(String name, String lastName)
    {
        this.firstName = name;
        this.lastName = lastName;
    }
    
    /**
     * This method returns a string representation of the object with the given format.
     * @return 
     */
    @Override
    public String toString()
    {
        return friendIdNumber + ". " + nickName + " " + firstName + " " + lastName + " " + cellPhoneNumber;
    }
    
    /**
     * the setName method sets the name object to hold the value of the parameter.
     * @param firstName 
     */
    public void setName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * getName method returns the current name being held by the object.
     * @return 
     */
    public String getName()
    {
        return this.firstName;
    }
    
    /**
     * setLastName method sets the lastName object to hold the value of the parameter.
     * @param lastName 
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    /**
     * getLastName method returns the current last name being held by the object.
     * @return 
     */
    public String getLastName()
    {
        return this.lastName;
    }
    
    /**
     * setNickName method sets the nickName object to hold the value of the parameter.
     * @param nickName 
     */
    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }
    
    /**
     * getNickName method returns the current nickname being held by the object.
     * @return 
     */
    public String getNickName()
    {
        return this.nickName;
    }
    
    /**
     * setPhoneNumber method sets the phone number object to hold the value of the parameter.
     * @param cellPhoneNumber 
     */
    public void setPhoneNumber(String cellPhoneNumber)
    {
        this.cellPhoneNumber = cellPhoneNumber;
    }
    
    /**
     * getPhoneNumber method returns the current phone number being held by the object.
     * @return 
     */
    public String getPhoneNumber()
    {
        return this.cellPhoneNumber;
    }
    
    /**
     * setFriendIdNumber method sets the friend id number object to hold the value of the parameter.
     * @param friendIdNumber 
     */
    public void setFriendIdNumber(int friendIdNumber)
    {
        this.friendIdNumber = friendIdNumber;
    }
    
    /**
     * getFriendIdNumber method returns the current friend id number being held by the object.
     * @return 
     */
    public int getFriendIdNumber()
    {
        return this.friendIdNumber;
    }
    
    /**
     * equals method when called it will compare the current object to another 
     * object passed as a parameter, in our case this is useful since you can compare 
     * one object with an object of the same type inside the ArrayList. 
     * @param another
     * @return 
     */
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
