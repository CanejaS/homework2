/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentinheritance;

/**
   Monthly appointment.
*/
public class Monthly extends Appointment
{
   private int day;

   /**
      Initializes appointment for a given date.
      @param day the day of the month
      @param description the text description of the appointment
   */
   public Monthly(int day, String description)
   {
     //call the superclass constructor to initialize description
     //then, initialize the day instance variable
      super(description);
      this.day = day;
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
      //will return true if the day passed in the parameter matches the day instance variable
       if(this.day == day)
       {
           return true;
       }
       return false;
   }
   
   public int getDay()
   {
       return day;
   }
}
