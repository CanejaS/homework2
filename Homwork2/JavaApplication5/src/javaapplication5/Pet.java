/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author cadelmonterde
 */
public class Pet implements Comparable <Pet>{
    private String breed;
    private String name;
    private String weight;

    public Pet(String breed, String name, String weight)
    {
        this.breed = breed;
        this.name = name;
        this.weight = weight;
    }
    
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWight() {
        return weight;
    }

    public void setWight(String wight) {
        this.weight = wight;
    }

    @Override
    public String toString() {
        return "Pet{" + "breed=" + breed + ", name=" + name + ", weight=" + weight + '}';
    }

    @Override
    public int compareTo(Pet otherPet) {
        //To change body of generated methods, choose Tools | Templates.

          
            return this.breed.compareToIgnoreCase(otherPet.breed);
        //or if we want to compare by wight
        // if (this.wight > otherPet.wights)
        //return 1;
        // else if(this.weight == otherPet.weight)
        //return 0;
        //eles
        //return -1
       
    }

//    @Override
//    public int compareTo(Pet o) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
}
