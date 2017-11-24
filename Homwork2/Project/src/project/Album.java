/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 * The Album class is responsible for initializing  the album artist, title and
 * Track ArrayList as well as the getters and setters for all these variables.
 * @author cadelmonterde
 */
public class Album implements Comparable<Album>{
    private String artist;
    private String title;
    ArrayList<Track> trackList = new ArrayList<>();
    
    /**
     * Constructor to create an Album Object with the following parameters.
     * @param artist
     * @param title
     * @param songs 
     */
    public Album(String artist, String title,ArrayList<Track> songs)
    {
        this.artist = artist;
        this.title = title;
        trackList = songs;
    }
    
    /**
     * constructor to initialize an artist.
     * @param artist 
     */
    public Album(String artist)
    {
        this.artist = artist;
    }
    /**
     * The get Artist Method returns an artist.
     * @return 
     */
    public String getArtist() {
        return artist;
    }
    
    /**
     * The getTrackList method returns a Track Object.
     * @return 
     */
    public ArrayList<Track> getTrackList() {
        return trackList;
    }

    /**
     * The setTrackList method sets the trackList object to a parameter.
     * @param trackList 
     */
    public void setTrackList(ArrayList<Track> trackList) {
        this.trackList = trackList;
    }

    /**
     * The set artist Method sets the artist variable to the methods parameter.
     * @param artist 
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    
    /**
     * Returns the title of of an album
     * @return 
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of an album.
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    
    /**
     * To String object to display an album Object.
     * @return 
     */
    @Override
    public String toString() {
        return "Album{" + "artist=" + artist + ", title=" + title + ", trackList=" + trackList + '}';
    }


    /**
     * Compares a title to another Title.
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Album o) {
        //Album hold = (Album) o;
        return title.compareTo(o.getTitle());
    }

    
}
