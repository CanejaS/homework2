/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Arrays;

/**
 *
 * @author cadelmonterde
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pet dog = new Pet("Thing4","","");
        Pet dog2 = new Pet("Thing53","","");
        Pet dog3 = new Pet("Thing2","","");
        Pet dog4 = new Pet("Thing1","","");
        Pet dog5 = new Pet("Thing2","","");
        
        Pet myDogs[] = new Pet[5];
        myDogs[0] = dog;
        myDogs[1] = dog2;
        myDogs[2] = dog3;
        myDogs[3] = dog4;
        myDogs[4] = dog5;
        
        
        Arrays.sort(myDogs);
        
        for(Pet o: myDogs)
        {   
            System.out.println(o);
        }
               
        //Collections.sort(myDogs, new PetComparator());
    }
    
}
