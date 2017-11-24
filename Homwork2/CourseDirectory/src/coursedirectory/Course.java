
package coursedirectory;
import java.util.ArrayList;
/**
 * The Course class initializes all the String and integer variables that
 * will be used as user input later on to create course objects, as well
 * as overwrite the toString method to display the object and overwrite the
 * compareTo method used to compare two objects.
 */
public class Course implements Comparable {
    private String FIUCourseName;
    private String FLACourseName;
    private int yearLevel;
    private int numCredits;
    private ArrayList<String> prerequisites;
    
    /**
     * The course constructor initializes all the  private variables. 
     * @param anFIUCourseName
     * @param aFLACourseName
     * @param aYearLevel
     * @param aNumCredits
     * @param myPreReqs 
     */
    public Course(String anFIUCourseName, String aFLACourseName, int aYearLevel, int aNumCredits, ArrayList<String> myPreReqs)
    {
        FIUCourseName = anFIUCourseName;
        FLACourseName = aFLACourseName;
        yearLevel = aYearLevel;
        numCredits = aNumCredits;
        prerequisites = new ArrayList<String>(myPreReqs);
       
    }
    /**
     * The empty constructor is used to create an empty course object.
     */
    public Course()
    {
    
    }

    /**
     * theGetFIUCourseName method returns an FIU Course Name.
     * @return 
     */
    public String getFIUCourseName() {
        return FIUCourseName;
    }

    /**
     * The setFIUCourseName allows the user to set the variable to any 
     * desired string value.
     * @param FIUCourseName 
     */
    public void setFIUCourseName(String FIUCourseName) {
        this.FIUCourseName = FIUCourseName;
    }

    /**
     * The getFLACourseName returns the current value of the FLACourseName
     * variable.
     * @return 
     */
    public String getFLACourseName() {
        return FLACourseName;
    }
    
    /**
     * setFLACoueseName method allows the user to set the variable to any 
     * desired string value.
     * @param FLACourseName 
     */
    public void setFLACourseName(String FLACourseName) {
        this.FLACourseName = FLACourseName;
    }

    /**
     * the getYearLevel Method returns the current value of the yearLevel
     * variable.
     * @return 
     */
    public int getYearLevel() {
        return yearLevel;
    }

    /**
     * The setYearLevel allows the user to set the variable to any 
     * desired integer value.
     * @param yearLevel 
     */
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    /**
     * The getNumerCredits method returns the current value of the numCredits
     * variable.
     * @return 
     */
    public int getNumCredits() {
        return numCredits;
    }

    /**
     * The setNumCredits allows the user to set the variable to any 
     * desired integer value.
     * 
     * @param numCredits 
     */
    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }

    /**
     * The getPrerequisites the current value of the prerequisites
     * variable.
     * @return 
     */
    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }

    /**
     * The setPrerequisites allows the user to set the variable to any 
     * desired ArrayList value.
     * @param prerequisites 
     */
    public void setPrerequisites(ArrayList<String> prerequisites) {
        this.prerequisites = new ArrayList<String>(prerequisites);
    }

    /**
     * Overwriting the toString method decides how the object is displayed.
     * @return 
     */
    @Override
    public String toString() {
        return "Course{" + "FIUCourseName=" + FIUCourseName + ", FLACourseName=" + FLACourseName + ", yearLevel=" + yearLevel + ", numCredits=" + numCredits + ", prerequisites=" + prerequisites + '}';
    }
    
    /**
     * The compateTo object overwrites the method from the interface, and compares
     * the FIUCourseName String.
     * @param other
     * @return 
     */
    @Override
    public int compareTo(Object other)
    {
        Course otherCourse = (Course) other;
        return this.FIUCourseName.compareTo(otherCourse.FIUCourseName);
    }
    
    
    
    
    
    
    
    
}
