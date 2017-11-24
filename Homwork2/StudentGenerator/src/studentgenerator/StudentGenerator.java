////[6:26 PM, 10/31/2017] Mario BigD: /*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package studentgenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 4199107
 */
public class StudentGenerator {

    /**
     * @param args the command line arguments
     */
    ArrayList<CalculatableGPA> myStudents = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        StudentGenerator myDemo = new StudentGenerator();
        myDemo.createStudents();
        myDemo.computeGPA();
        myDemo.summarizeTotals();

    }

    public void createStudents() {
       
        String studentId;
        String studentName;
        String studentType;
        String fileName;
        double gpa;
        int grade;
        Scanner inFile = null;
        CollegeStudent collegeStudent;
        K12Student k12Student;
        try {
            System.out.print("What is the name of the file you wish to read? ");
            fileName = keyboard.nextLine();
            File file = new File(fileName);
            inFile = new Scanner(file);
            while (inFile.hasNext()) {
                String currentLine = inFile.nextLine();
                String[] delimiter = currentLine.split(" ");
                studentType = delimiter[0];
                studentId = delimiter[1];
                studentName = delimiter[2];
                gpa = Double.parseDouble(delimiter[3]);
                grade = Integer.parseInt(delimiter[4]);
                char[] c =studentType.toCharArray();
                if(c[0] == 'C')
                {
                    collegeStudent = new CollegeStudent(studentId,studentName,gpa,grade);
                    myStudents.add(collegeStudent);
                }
                else if(c[0] =='K')
                {
                    k12Student = new K12Student(studentId,studentId,gpa,grade);
                    myStudents.add(k12Student);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File wasnt found");
        } finally {
           inFile.close();
        }

    }

    public void computeGPA() {
        for(int i =0; i <myStudents.size();i++)
        {
            myStudents.get(i).calculateGPA();
            System.out.println(myStudents.get(i));
        }
    }

    public void summarizeTotals() {
        System.out.println("The total number of college students is: " + CollegeStudent.getCollegeStudentCount());
        System.out.println("The total number of K12 students is: " + K12Student.getK12StudentCount());
    }
}