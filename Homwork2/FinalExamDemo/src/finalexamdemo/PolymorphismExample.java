/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexamdemo;

/**
 *
 * @author Cristy
 */
public class PolymorphismExample {

    public static void main(String args[]) {

        GradedActivity[] myActivities = new GradedActivity[5];
        
        GradedActivity myGradedActivity = new GradedActivity();
        myGradedActivity.setScore(70.0);
        myActivities[0]= myGradedActivity;
        
        GradedActivity myPassFailActivity = new PassFailActivity(70);
        myPassFailActivity.setScore(70);
        myActivities[1] = myPassFailActivity;
        
        GradedActivity myPassFailExam = new PassFailExam(10, 3, 70);
        myActivities[2] = myPassFailExam;
        
        GradedActivity myFinalExam = new FinalExam(10, 3);
        myActivities[3] = myFinalExam;
        
        GradedActivity myCurvedActivity = new CurvedActivity(1.20);
        myCurvedActivity.setScore(60);
        myActivities[4] = myCurvedActivity;
        
        //Polymorphism at work!        
        for (int i=0; i < myActivities.length; i++)
        {
            System.out.println(myActivities[i]);
        }
        

    }
}
