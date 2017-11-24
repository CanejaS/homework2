/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedemo;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author mtsguest
 */
public class EmployeeDemo {

    /**
     * @param args the command line arguments
     */
    //Define an arrayList of Employee type.
    ArrayList<Employee> myEmps = new ArrayList<Employee>();
    
    public static void main(String[] args)
    {
        
        Scanner myKeyboard = new Scanner(System.in);
        int hoursWorked;
        EmployeeDemo myDemo = new EmployeeDemo();
        myDemo.createEmployees();
        myDemo.computeSalary();
   }
    
    public  void createEmployees()
    {
        // Please write code below, and place all objects inside of an arrayList
        
        String lastName, firstName;
        double salary;
        SalariedEmployee salEmp;
        HourlyEmployee hourEmp;
        Scanner inFile = null;
        File myfile;
        
        boolean fileOpened = false;
        try{
                 myfile = new File("salaryEmp.txt");
                inFile = new Scanner(myfile);
            while(inFile.hasNext())
            {

                String hold = inFile.nextLine();
                String[] split = hold.split(" ");
                lastName = split[0];
                firstName = split[1];
                salary =  Double.parseDouble(split[2]);
            //    System.out.println(lastName + firstName + salary );//+ salary);
                salEmp = new SalariedEmployee(firstName,lastName,salary);
                myEmps.add(salEmp);
            }

        }
        catch(FileNotFoundException e){}
        finally{
            inFile.close();
        }
        
            try{
                myfile = new File("hourlyEmp.txt");
                inFile = new Scanner(myfile);
            while(inFile.hasNext())
            {

                String hold = inFile.nextLine();
                String[] split = hold.split(" ");
                lastName = split[0];
                firstName = split[1];
                salary =  Double.parseDouble(split[2]);
           //     System.out.println(lastName + firstName + salary );//+ salary);
                hourEmp = new HourlyEmployee(firstName,lastName,salary);
                myEmps.add(hourEmp);
            }

        }
        catch(FileNotFoundException e){}
        finally{
            inFile.close();
        }
        //read the file1 that contains only SalariedEmployees
        //create SalariedEmployees subclasses, and add them to the Employee arrayList
       
        
          
        //read the file2 that contains only HourlyEmployees
        //create HourlyEmployees subclass, and add them to the Employee arrayList
    }
    
    public void computeSalary()
    {
       // loop through the arrayList, and call the polymorphic method found in the superclass
       // and all of its subclasses. Note:  the polymorphic method needs hours worked, so you will Print the results of the method's calculations   
       // need to query the user and pass that value to the polymorphic method.
        Scanner keyboard = new Scanner(System.in);
        int hours;
        double pay;
        hours = keyboard.nextInt();
        for(Employee s:myEmps)
        {
            pay = s.weeklyPay(hours);
            System.out.println(s);
            System.out.println(pay);
        }
       
    }
    
}
