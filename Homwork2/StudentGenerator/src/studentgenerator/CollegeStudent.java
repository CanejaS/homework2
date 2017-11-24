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
public class CollegeStudent extends Student {
    
     
    private int yearInCollege;
    private String levelOfDistinction;
    private static int collegeStudentCount;

   
    /**
     * This constructor will allows to create an object and initialize it to the 
     * following parameters.
     * @param anId
     * @param aLastName
     * @param aGPA
     * @param aYearInCollege 
     */
    public CollegeStudent(String anId, String aLastName, double aGPA, int aYearInCollege)
    {
        super (anId, aLastName, aGPA);
        yearInCollege = aYearInCollege;
        levelOfDistinction = "None";
        collegeStudentCount++;
        
        
    }    
    
    /**
     * The setYearInCollegeMethod will the yearInCollege Variable to its parameter
     * @param aYearInCollege 
     */
    public void setYearInCollege(int aYearInCollege)
    {
        yearInCollege = aYearInCollege;
    }
    
    /**
     * The getYearInCollege method will return the current value of the  year InCollegeVariable
     * @return 
     */
    public int getYearInCollege()
    {
        return yearInCollege;
    }
    
    /**
     * This method sets a level of distinction to the value of the parameter.
     * @param aLevelOfDistinction 
     */
    public void setLevelOfDistinction(String aLevelOfDistinction)
    {
        levelOfDistinction = aLevelOfDistinction;
    }
    
    /**
     * This method returns the current Level of distinction.
     * @return 
     */
    public String getLevelOfDistinction()
    {
        return levelOfDistinction;
    }
    
    /**
     * This method will return the current value of CollegeLevelStudentCount.
     * @return 
     */
    public static int getCollegeStudentCount()
    {
        return collegeStudentCount;
    }
   
    
   
   /**
    * The CalculateGPA method is our definition of the abstract method that 
    * changes the level of distinction based on the GPA.
    */   
    public void calculateGPA()
    {
       //Based upon the following logic, create the missing method:    
       if (getGPA() >= 3.98)
       {
           setLevelOfDistinction("summa cum laude");
       }
       else if (getGPA() >= 3.5)
       {
           setLevelOfDistinction("magna cum laude");
       }
       else if (getGPA() >= 3)
       {
           setLevelOfDistinction("cum laude");
       }
    
    }

      
       
       
        /**
         * This to string method defines how the CollegeStudentObject will be printed.
         * @return 
         */
    @Override
    public String toString()
    {
        return super.toString()+" The level of Distinction is "+getLevelOfDistinction();
       //Task 1:  Invoke the super class' toString() and then concatenate the rest of the fields
       //specific to the subclass
    }      
    
}

    


