/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgenerator;
import java.util.ArrayList;

/**
 *
 * @author Owner
 */

public abstract class Student implements CalculatableGPA{
    
    private String id;
    private String lastName;
    private double gpa;
    
    /**
     * This constructor is responsible for setting our variables
     * to the parameters in the constructor.
     * @param anId
     * @param aLastName
     * @param aGPA 
     */
    public Student(String anId, String aLastName, double aGPA)
    {
        id = anId;
        lastName = aLastName;
        gpa = aGPA;
    }
    /**
     * This method returns a student ID
     * @return 
     */
    
    public String getId()
    {
        return id;
    }
    
        
    /**
     * This method returns a student lastName
     * @return 
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * This method return a student GPA
     * @return 
     */
    public double getGPA()
    {
        return gpa;
    }
    
    /**
     * This method sets the student ID to the parameter Value.
     * @param anId 
     */
    public void setId(String anId)
    {
        id = anId;
    }
    
        
    /**
     * this method sets the student last name to its parameter value.
     * @param aLastName 
     */
    public void setLastName(String aLastName)
    {
        lastName = aLastName;
    }
    
    /**
     * this method sets a student GPA to its parameter value.
     * @param aGPA 
     */
    public void setGPA(double aGPA)
    {
        gpa = aGPA;
    }
    
    /**
     * The to String method is the one responsible for 
     * the way that the Student object is gonna be printed.
     * @return 
     */
    public String toString()
    {
        return id + " " + lastName + " " + gpa;
    }
 
    /**
     * the implementation of the interface method in the abstract class.
     */
    public abstract void calculateGPA();
}

