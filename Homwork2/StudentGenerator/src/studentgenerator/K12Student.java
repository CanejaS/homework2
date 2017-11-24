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
public class K12Student extends Student {
    
    private int yearInK12School;
    private double rank;
    private static int k12StudentCount;

   
   
    
    public K12Student(String anId, String aLastName, double aGPA, int aYearInK12School)
    {
        super (anId, aLastName, aGPA);
        yearInK12School = aYearInK12School;
        k12StudentCount++;

        
    }    
    
    public void setYearInK12School(int aYearInK12School)
    {
        yearInK12School = aYearInK12School;
    }
    
    public int getYearInK12School()
    {
        return yearInK12School;
    }
    
    public void setRank(double aRank)
    {
        rank = aRank;
    }
    
    public double getRank()
    {
        return rank;
    }
    
     public static int getK12StudentCount()
    {
        return k12StudentCount;
    }

    
    
    @Override
        public void calculateGPA() 
        {
            if (getGPA() >= .90)
           {
               setRank(.10);
           }
           else if (getGPA() >= .80)
           {
               setRank(.20);
           }
           else if (getGPA() >= .70)
           {
               setRank(.30);
           }
           else if (getGPA() >= .60)
           {
               setRank(.40);
           }
           else if (getGPA() >= .50)
           {
               setRank(.50);
           }
           else if (getGPA() >= .40)
           {
               setRank(.60);
           }
           else if (getGPA() >= .30)
           {
               setRank(.70);
           }
           else if (getGPA() >= .20)
           {
               setRank(.80);
           }
           else if (getGPA() >= .10)
           {
               setRank(.90);
           }
           else
           {
               setRank(1.00);
           }
           
        }
    
       
       
  
        
  @Override
    public String toString()
    {
        return super.toString() + getRank();
    }    
}
