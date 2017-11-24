package appointmentinheritance;

import java.util.Scanner;
/**

  Title:           Programming Assignment #3.b
  Semester:        COP3337 – Fall 2017
  @author          5793866
  Instructor:      C. Charters
  
   Due Date:       10/8/2017

   This Program allows the end user to create an appointment be a one time thing
   * monthly or even yearly appointments. It will also check if an appointment 
   * at a certain day is valid. 
 */
public class AppointmentInheritance {
//Define an array of Appointments here (globally)

    Appointment[] myAppointments;
    Scanner keyboard = new Scanner(System.in);

    /**
     * The Main Method creates an instance of its own class and calls its two 
     * methods to be executed.
     */
    public static void main(String args[]) {
        AppointmentInheritance myAppts = new AppointmentInheritance();
        myAppts.makeAppointments();
        myAppts.checkAppointments();

    }
    /**
     * The make Appointments Method is responsible for creating the appointment 
     * array displaying the menu and allowing the user to make a choice based
     * on the type of appointment the user needs to make.
     */
    public void makeAppointments() {

        System.out.println("How many appointments do you wish to make?");
        int numAppts = keyboard.nextInt();
        myAppointments = new Appointment[numAppts];

        //Ask user how many appoints (numAppts) they want to make, make an array of Appointment type for that many entries,
        //and loop that many times, to do the following:
        //Define variables for apptDescription, apptDay, apptMonth, apptYear
        //Define variables for apptIndex and menuSelection
        //instantiate the array of Appointment objects:
        //Loop as many times as the number of objects the user said he wanted to create:
        for (int i = 0; i < numAppts; i++) {
            //Display a menu of making appts:  Onetime, Daily Monthly
            System.out.println("Please make a selection:\n1. One Time Appointment\n2. Daily Appointment \n3. Monthly Appointment ");
            //get the user's menu selection
            int menuSelection = keyboard.nextInt();
            keyboard.nextLine(); //clears buffer
            System.out.println("What is the description of your appointment? ");
            String apptDescription = keyboard.nextLine();

            //According to the menu selection, ask user for further data.
            //Then, create the appropriate subclass object: Onetime, Daily, Monthly
            //Place object in array (ensure there is enough space left)
            if (menuSelection == 1) {
                int apptMonth;
                int apptYear;
                int apptDay;
                System.out.println("Month for your appointment between (1-12)");
                do {
                    apptMonth = keyboard.nextInt();

                } while (apptMonth < 0 || apptMonth > 12);

                System.out.println("Year for your appointment between 2017 and 2018 ");
                do {
                    apptYear = keyboard.nextInt();
                } while (apptYear < 2017 || apptYear > 2018);

                System.out.println("Day for your appointment Please select a number between 1 - 31 ");
                do {
                    apptDay = keyboard.nextInt();
                } while (apptDay < 1 || apptDay > 31);

                myAppointments[i] = new Onetime(apptYear, apptMonth, apptDay, apptDescription);
            } else if (menuSelection == 2) {
                myAppointments[i] = new Daily(apptDescription);

            } else if (menuSelection == 3) {
                int apptDay;
                System.out.println("Day for your appointment Please select a number between 1 - 31 ");
                do {
                    apptDay = keyboard.nextInt();
                } while (apptDay < 1 || apptDay > 31);

                myAppointments[i] = new Monthly(apptDay, apptDescription);

            }

        }
        System.out.println("*************Thank you for making all of your appointments.*****************\n");

    }

    /** 
     * The checkAppointments method has the main purpose to check for the user if 
     * an appointment was made at a given time.
     */
    public void checkAppointments() {
        //Ask user for a specific date that they wish to see all appointments
        //Input all the values into local variables for year, month, and day

        //Create a for-loop that will go through the array of appointments, and will 
        //ask if each appointment occursOn(year, month, day).
        //if true, print out the appointment object.
        int apptMonth;
        int apptYear;
        int apptDay;
        System.out.println("Check Month for your appointment between (1-12)");
        do {
            apptMonth = keyboard.nextInt();

        } while (apptMonth < 0 || apptMonth > 12);

        System.out.println("Check Year for your appointment between 2017 and 2018 ");
        do {
            apptYear = keyboard.nextInt();
        } while (apptYear < 2017 || apptYear > 2018);

        System.out.println("Check Day for your appointment Please select a number between 1 - 31 ");
        do {
            apptDay = keyboard.nextInt();
        } while (apptDay < 1 || apptDay > 31);
        for (int i = 0; i < myAppointments.length; i++) {
            boolean state = myAppointments[i].occursOn(apptYear, apptMonth, apptDay);
            if (state) {
                System.out.println("Your appointment is valid! " + myAppointments[i]+ " " +apptMonth+ " "+apptDay+" "+apptYear);
            } else {
                System.out.println("No appointment for this date.");
            }
        }

    }
}


/*
    Recursive linear Search algorithm

public int search(int x[], int i)
{
    if(x[i] == 5) return i;
    
    else
    return search()
}
*/