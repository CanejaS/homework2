package javaapplication5;


import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cadelmonterde
 */
public class PetComparator implements Comparator<Pet> {
    public int compare(Pet petA, Pet petB)
    {
        return (petA.getName().compareTo(petB.getName()));
    }
    
}
