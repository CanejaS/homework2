/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 * This class initializes the song variable.
 * @author cadelmonterde
 */
public class Track implements Comparable<Track>{
        private String songs;
    
    /**
     * Constructor to create a track object with a song.
     * @param songs 
     */
    public Track(String songs)
    {
        this.songs = songs;
    }
    /**
     * Empty Constructor
     */
    public Track()
    {
    
    }
    
    
    /**
     * Returns a song as a string.
     * @return 
     */

    public String getSongs() {
        return songs;
    }
    
    /**
     * Sets a song to a string value.
     * @param songs 
     */
    public void setSongs(String songs) {
        this.songs = songs;
    }
    
    
    /**
     * To string method to display a track object.
     * @return 
     */
    @Override
    public String toString() {
        return "Track{" + "songs=" + songs + '}';
    }
    
    /**
     * compareTo method Compares two songs.
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Track o) {
        //Track hold = (Track) o;
        return o.getSongs().compareTo(songs);
    }
    

    
}
