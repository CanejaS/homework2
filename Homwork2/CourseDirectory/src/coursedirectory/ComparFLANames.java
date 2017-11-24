package coursedirectory;

import java.util.Comparator;

/**
 * The purpose of this individual class is to Compare two objects 
 * by Implementing the The Comparator Interface, In order to Sort them
 * later on.
 */
public class ComparFLANames implements Comparator<Course>{

    /**
     * This Method takes two Course Objects as parameters and compares them
     * The compareToIgnoreCase is what compares the two Strings and returns 
     * an Integer.
     * @param o1
     * @param o2
     * @return 
     */
    @Override
    public int compare(Course o1, Course o2) {
        return(o1.getFLACourseName().compareToIgnoreCase(o2.getFLACourseName()));
    }
    
}
