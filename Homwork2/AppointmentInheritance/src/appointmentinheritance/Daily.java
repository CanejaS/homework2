/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentinheritance;

/**
   Daily appointment.
*/
public class Daily extends Appointment
{
   /**
      Constructs a Daily Appointment
      @param description the text description of the appointment
   */
   public Daily(String description)
   {
     //call the superclass constructor, passing the description
     //no other attributes are needed for a Daily object
       super(description);
       
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
     //this is the polymorphic method that will return true always, since this is a daily appt.
       return true;
   }
}

