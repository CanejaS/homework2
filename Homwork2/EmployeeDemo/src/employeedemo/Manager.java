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
public class Manager extends SalariedEmployee {
    
    private double weeklyBonus;
    
    public Manager(String aFirstName, String aLastName, double anAnnualSalary, double aWeeklyBonus)
    {
        super(aFirstName, aLastName, anAnnualSalary);
        weeklyBonus = aWeeklyBonus;
    }
    
    public void setWeeklyBonus(double aBonus)
    {
        weeklyBonus = aBonus;
    }
    
    public double getWeeklyBonus()
    {
        return weeklyBonus;
    }
    
    public double weeklyPay(int hours)
    {
        double pay = super.weeklyPay(hours) + weeklyBonus;
        return pay;
    }
//Define the missing method using the logic below:

    
//Override .toString() to invoke the superclass .toString() and concatenate all the remaining fields

    @Override
    public String toString() {
        return super.toString();
    }
    
  
}
