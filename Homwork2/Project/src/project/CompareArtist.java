/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Comparator;
/**
 *This class is used to Compare two Artists.
 * @author cadelmonterde
 */
public class CompareArtist implements Comparator<Album>{
    
    @Override
    public int compare(Album o1, Album o2)
    {
        return (o1.getArtist().compareToIgnoreCase(o2.getArtist()));
    }
    

}
