/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
    
import java.util.Scanner;

/**

  Title:           Programming Assignment #Recursive power method
  Semester:        COP3337 – Fall 2017
  @author          5793866
  Instructor:      C. Charters
  
   Due Date:       11/12/2017

   This Program uses two different methods to return an integer to a certain
   * power all this information is collected from the user, this program also 
   * displays which one of the methods is faster.
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
        static Scanner in = new Scanner(System.in);
        static int num =0;
        static int holdNum,holdPower;
        static long recursiveTime,loopTime;
        
        /**
         * The main method is the one that asks the user for the number and power
         * inputs and passing those as parameters to our methods.
         * @param args 
         */
    public static void main(String[] args) 
    {
        // TODO code application logic here
//        System.out.println("Please enter a number.");
        JavaApplication8 func = new JavaApplication8();
        System.out.println("Please enter a number");
        num = in.nextInt();
        System.out.println("Please enter its power");
        int power = in.nextInt();
        System.out.println();
       // num = 13;
        holdNum = num;
        holdPower = power;
        long start = System.nanoTime();
       System.out.println("Our Recursive method returns: "+func.power(power, num));
       long end = System.nanoTime();
       recursiveTime = end - start;
       num = holdNum;
       power = holdPower;
       long start1 = System.nanoTime();
       System.out.println("Our Loop method returns: "+func.loop(power, num));
       long end1 = System.nanoTime();
       loopTime = end1 - start1;
       if(recursiveTime < loopTime)
       {
           System.out.println("Recursive Time "+recursiveTime+" is smaller than the loop time "+loopTime);
       }
       else
           System.out.println("Loop Time "+loopTime+" is smaller than recursive time "+ recursiveTime);
        
        
    }
    /**
     * This is our recursive method which calls itself n-1 times where n is the
     * power.
     * @param base
     * @param num
     * @return 
     */
    public int power(int base,int num)
    {
        
        
       final int total = num;
       // System.out.println("Please enter a power");
       if (base == 0) return 1;
       else if(base != 1)
        {
              
            return power(base-1,num*holdNum);
             
            // num *= num;
          //   System.out.println(num);
             
        }
        
        else if (base == 1)return num;
        return num;
       // System.out.println(num);
        //num = num*num; // here the value does not update with the
        //System.out.println(num + " "+base);
    }
    /**
     * This is our loop method which uses a loop to calculate the a result and
     * return it once the loop is over.
     * @param base
     * @param num
     * @return 
     */
    public int loop(int base, int num)
    {
        long start = System.nanoTime();
        if(base == 0) return 1;
        else if(base == 1) 
        {
            return num;
        }
        else if(base >1)
        {
            for(int i =1; i< base; i++)
            {
             num *= holdNum;
            }
            return num;
        }
        return 0;
    }
}
