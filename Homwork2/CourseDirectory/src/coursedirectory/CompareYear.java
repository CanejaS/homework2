package coursedirectory;

import java.util.Comparator;

/**
 * The purpose of this individual class is to Compare two objects 
 * by Implementing the The Comparator Interface, In order to Sort them
 * later on.
 */
public class CompareYear implements Comparator<Course>{

    /**
     * This method takes two Course parameters and compares them,
     * Returns a 0 if the are equal Returns 1 if object 1 is bigger than
     * the second object and return -1 otherwise.
     * @param o1
     * @param o2
     * @return 
     */
    @Override
    public int compare(Course o1, Course o2) {
        if(o1.getYearLevel() > o2.getYearLevel())
        {
            return 1;
        }
        else if(o1.getYearLevel() == o2.getYearLevel())
        {
            return 0;
        }
        else 
            return -1;
    }
    
}
