/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursedirectory;
import  java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**

  Title:           Programming Assignment Course Directory.
  Semester:        COP3337 – Fall 2017
  @author          5793866
  Instructor:      C. Charters
  
   Due Date:       10/15/2017

    This program allows the user to create an FIU Course with its prerequisites
    * and all other inputs such as Name of the course, Year level and the number of
    * credits. It also gives the end user a bunch of different choices to sort the 
    * courses under a given category. Starting with the FIU course Name, followed 
    * by the FLA course name and the year level.
 */
public class CourseDirectory {
    ArrayList<Course> courses = new ArrayList<Course>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CourseDirectory myDirectory = new CourseDirectory();
        myDirectory.createFIUCourses();
        myDirectory.displayMenu();
        
    }
    
    
    /**
     * The createFIUCourses method takes in no parameters and its responsible
     * for populating the courses arrayList, Since the array list if a list
     * of course objects we need to call create an object with the parameters
     * taken as input from the user creating a course object which we then add
     * to the array list.
     */
    public void createFIUCourses()
    {
        Scanner in = new Scanner(System.in);
        boolean create = true;

        do
        {
            //Course(String anFIUCourseName, String aFLACourseName, int aYearLevel, int aNumCredits, ArrayList<String> myPreReqs)
            
            String anFIUCourseName, aFLACourseName;
            int aYearLevel, aNumCredits;
            int userChoice =0;
            int initOnce =0;
            boolean done = false;
            ArrayList<String> myPreReqs = new ArrayList<>(); //make sure this clears the pre reqs thing and doesnt add them to the next coirse
            String preReq;
            
            System.out.println("Enter an FIU Course Name:");
            anFIUCourseName = in.next();
            
            System.out.println("Please Enter an FLA Course Name: ");
            aFLACourseName = in.next();
  
            System.out.println("Enter the Year Level");
            aYearLevel = in.nextInt();
            
            System.out.println("Enter the number of credits");
            aNumCredits = in.nextInt();
            
            //Course setPreReq = new Course();
            while(!done)
            {
                if(initOnce == 0)
                {
                   System.out.println("Is there a pre-req");
                   System.out.println("1. YES");
                   System.out.println("2. NO");
                   userChoice = in.nextInt();
                   if(userChoice == 1) break;
                   initOnce =1;
                }
                System.out.println("Please enter a preq");
                preReq = in.next();
                myPreReqs.add(preReq);
                System.out.println("Is there another pre-req");
                System.out.println("1. YES");
                System.out.println("2. NO");
                userChoice = in.nextInt();
                if(userChoice == 1)
                {
                    done = false;
                }
                else
                {
                    done = true;
                }
            }
           
            Course hold = new Course(anFIUCourseName,aFLACourseName,aYearLevel,aNumCredits,myPreReqs);
            courses.add(hold);
            
            
            System.out.println("Would you like to create another course ?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            userChoice = in.nextInt();
            if(userChoice == 1)
            {
                create = true;
            }
            else if(userChoice == 2)
                create = false;
            else
            {
                System.out.println("Wrong input");
            }
            //create = in.nextBoolean();
        }while(create);
    }
    
    /**
     * The displayMenu takes the ArrayList that we populated in the FIU courses
     * method and Sorts the, bases on the user Choice.
     */
    public void displayMenu()
    {
        int userChoice = 0;
        Scanner in = new Scanner(System.in);
        while(userChoice != 4)
        {
        
            System.out.println("1. Sort courses by FIU course name");
            System.out.println("2. Sort courses by FLA course name");
            System.out.println("3. Sort courses by year level");
            System.out.println("4. Exit");
            userChoice = in.nextInt();
            switch(userChoice)
            {
                case 1:
                {
                    Collections.sort(courses);
                    for(Course hold:courses)
                    {
                        System.out.println(hold);
                    }
                    ////////////////////////////////
                    break;
                }
                case 2:
                {
                    Collections.sort(courses, new ComparFLANames());
                    for(Course hold:courses)
                    {
                        System.out.println(hold);
                    }
                    break;
                }
                case 3:
                {
                    Collections.sort(courses, new CompareYear());
                    for(Course hold:courses)
                    {
                        System.out.println(hold);
                    }
                    break;
                }
                case 4:
                {
                    break;
                }
                default:
                    System.out.println("Wrong input my fellow end user. ");
                    break;
            }
            
        }
        
    }
    
    
    
}