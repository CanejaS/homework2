/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentinheritance;

/**
   A onetime appointment.
*/
public class Onetime extends Monthly
{
   private int year;
   private int month;
 //  private int day;

   /**
      Initializes appointment for a given date.
      @param year the year
      @param month the month
      @param day the day
      @param description the text description of the appointment
   */
   public Onetime(int year, int month, int day, String description)
   {
       super(day,description);
       this.year = year;
       this.month = month;
     //  this.day = day;
   }

   /**
      Determines if this appointment occurs on the given date.
      @param year the year
      @param month the month
      @param day the day
      @return true if the appointment occurs on the given date.
   */
   public boolean occursOn(int year, int month, int day)
   {
      //return true if ALL of the parameters match the instance variables
      if(this.year == year && this.month == month)
      {
          return true;
      }
      return false;
   }
   /**
    * The getYear Method returns the Year.
    * @return 
    */
   public int getYear()
   {
       return year;
   }
   
   /**
    * the getMonthMethodReturns the month.
    * @return 
    */
   public int getMonth()
   {
       return month;
   }
}
