
package programmingassignment1;

/**

  Title:           Programming Assignment #1
  Semester:        COP3337 – Fall 2017
  @author          5793866
   Instructor:     C. Charters
  
   Due Date:      08/25/2017

    This program creates and prints different star patterns dictated by different implementations of for loops.
    An outer for loop takes care of the amount of lines in the pattern to be printed as well as being directly proportional
    to the design printed in the inner loop.
 */

public class ProgrammingAssignment1 {
    /**
     * Main Method responsible for executing an instance of the methods below.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Instantiate the driver class, so you can call instance methods (& not static methods)
        ProgrammingAssignment1 design = new ProgrammingAssignment1();
        design.makeDesign1();
        design.makeDesign2();
        design.makeDesign3();
        
    }
        
    /**
     * makeDesign1 method, Prints a Right Triangle stars.
     */
    public void makeDesign1()
    {
        for(int i = 0; i <= 5; i++)
        {
          for(int j =0; j <i; j++)
          {
            System.out.print("*");
          }
        System.out.println();
        }
        // create a new line so that design1 and design2 don't look like a single design
        System.out.println(); 
    }
    
    /**
     * makeDesign2 method, Prints a Left Triangle of stars.
     */
    public void makeDesign2()
    {
      
      for (int i = 0; i < 5; i++)
      {
        for(int k = 0; k < i; k++)
        {
          System.out.print(" ");
        }
        for(int j = 5; j > i;  j--)
        {
          System.out.print("*");
        }

        System.out.println();
      }
    }
    
    /**
     * makeDesign3 method, Prints a Pyramid of stars.
     */
    public void makeDesign3()
    {
        
        for(int i = 0; i < 8; i++)
        {	
          for(int k = 8; k > i+1; k--)
            {

              System.out.print(k);
            }
          
          
          for(int j = 1; j <= 2*i-1; j++)
          {
            System.out.print("*");
          }
          System.out.println();
        }
    }
}
