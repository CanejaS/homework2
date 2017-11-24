/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversations;

/**
 *
 * @author PG6
 */
public abstract class Human implements Speakable {
    
    private String name;
    
    public Human(String aName)
    {
        name = aName;
    }
    
    public String toString()
    {
        return "My name is " + name;
    }
    
    public abstract void speak();

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
