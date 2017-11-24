/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedemo;

/**
 *
 * @author mtsguest
 */
public abstract class Employee {
    
    private String firstName;
    private String lastName;
  
    
    public Employee()
    {
        firstName = null;
        lastName = null;
    }
    public Employee(String aFirstName, String aLastName)
    {
        firstName = aFirstName;
        lastName = aLastName;
     
    }
    
    public void setFirstName(String aFirstName)
    {
        firstName = aFirstName;
    }
    
    public void setLastName(String aLastName)
    {
        lastName = aLastName;
    }
    
 
    
    public String getFirstName()
    {
       return firstName; 
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    
    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }

    public abstract double weeklyPay(int hours);
    
    
}
