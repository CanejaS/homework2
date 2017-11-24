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
public class HourlyEmployee extends Employee {
    
    private double wage;
    
    public HourlyEmployee(String firstName, String lastName, double wage)
    {
        super(firstName, lastName);
        this.wage = wage;
    }
    
    public void setWage(double aWage)
    {
        wage = aWage;
    }
    
    public double getWage()
    {
        return wage;
    }
    
    //Task 1:
    
    public double weeklyPay(int hoursWorked)
    {
        double pay =  wage * hoursWorked;
        if (hoursWorked > 40)
        {
            int otHours = hoursWorked - 40;
            double otPay = otHours * wage * .5;
            pay = pay + otPay;
            
        }
        return pay; 
    }  


   
    //Task 2:
    //Override .toString() by invoking the super class .toString and 
    //then concatenating the HourlyEmployee -specific fields.

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
