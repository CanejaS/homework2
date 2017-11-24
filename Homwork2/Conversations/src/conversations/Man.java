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
public class Man extends Human {

    private String favoriteSport;
    
    public Man(String aName, String aFavSport)
    {
        super(aName);
        favoriteSport = aFavSport;
    }
    
    public String getFavoriteSport() {
        return favoriteSport;
    }

    public void setFavoriteSport(String favoriteSport) {
        this.favoriteSport = favoriteSport;
    }
    
    public String toString()
    {
        return super.toString() + " and my favorite sport is " + favoriteSport;
    }
    
    public void speak()
    {
        System.out.println("I am a Man!" + toString());
    }
    
    
}
