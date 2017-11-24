/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversations;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author PG6
 */
public class Conversations {

    ArrayList<Speakable> myPeople = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conversations myConversations = new Conversations();
        myConversations.createPeople();
        myConversations.processConversations();
            
    }
    
    
    public void createPeople()
    {
        Scanner keyboard = new Scanner(System.in);
        String name, favStore, favSport;
        Woman aWoman;
        Man aMan;
       
        
        for (int i = 1; i <= 3; i++)
        {
            System.out.println("Name of Woman?");
            name = keyboard.nextLine();
            
            System.out.println("Favorite Store?");
            favStore = keyboard.nextLine();
            
            aWoman = new Woman(name, favStore);
            myPeople.add(aWoman);
            
            
            System.out.println("Name of Man?");
            name = keyboard.nextLine();
            
            System.out.println("Favorite Sport?");
            favSport = keyboard.nextLine();
            
            aMan = new Man(name, favSport);
            myPeople.add(aMan);
            
             
        }
        
         
    }
    
    public void processConversations()
    {
        for (int i = 0; i < myPeople.size(); i++)
        {
            myPeople.get(i).speak();
        }
    }
    
}
