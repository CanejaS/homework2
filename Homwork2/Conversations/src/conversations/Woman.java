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
public class Woman extends Human {
    
    private String favoriteStore;
    
    public Woman(String aName, String aFavStore)
    {
        super(aName);
        favoriteStore = aFavStore;
        
    }

    public String getFavoriteStore() {
        return favoriteStore;
    }

    public void setFavoriteStore(String favoriteStore) {
        this.favoriteStore = favoriteStore;
    }
    
    public String toString()
    {
       return super.toString() + " and my favorite store is " + favoriteStore;
    }
    
    public void speak()
    {
        System.out.println("I am a Woman! " + toString());
    }
}
