/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Title: Programming Assignment - Midterm Project Semester: COP3337 – Fall 2017
 *
 * @author 5793866 Instructor: C. Charters
 *
 * Due Date: 10/30/2017
 *
 * The purpose of this project is to parse a given file with songs and obtain
 * the information in different section to later on be added to an arrayList in
 * order to sort individual elements apply binary search.
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    boolean nameState = false;
    boolean titleState = false;
    boolean menuState = false;
    boolean addState = false;
    ArrayList<Album> sortedArtist;
    ArrayList<Album> Catalog = new ArrayList<>();
    ArrayList<Track> songs = new ArrayList<>();
    // = new FileReader("catalog2.txt"); 
    BufferedWriter write;// = new BufferedWriter(); 
    FileWriter fileWriter;
    int choice = 0;

    /**
     * The main menu initializes a Project object to call the read from file
     * method and the menu Select method.
     *
     * @param args
     */
    public static void main(String[] args) {
        Project caller = new Project();
        
        caller.readFromFile();
        caller.disp();
        caller.userMenu();

    }

    /**
     * the ReadFromFile method does not return anything and its responsible for
     * reading the File where the albums are stored as well as displaying the
     * content of the file to the end user.
     */
    public void readFromFile() {

        Album catHolder;
        String line = null;
        String delemiter = " ";
        String[] hold;

        BufferedReader bufferReader = null;

        try {
            FileReader fileReader = new FileReader("catalog2.txt");
            bufferReader = new BufferedReader(fileReader);

            //System.out.println("here 0");
            while ((line = bufferReader.readLine()) != null) {
                hold = line.split(delemiter);
                for (int i = 2; i < hold.length; i++) {
                    songs.add(new Track(hold[i]));
                }
                Collections.sort(songs);
                catHolder = new Album(hold[0], hold[1], songs);
                Catalog.add(catHolder);
                //System.out.println("here");

                //Must AND YOU MUST RESET THE SONGS ARRAYLIST BEFORE PUTTING VALUES ON IT AGAIN.
                songs = new ArrayList<>();
            }
        } catch (IOException ioe) {

        } finally {
            try {
                bufferReader.close();
            } catch (IOException ex) {
                Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        Collections.sort(Catalog);

    }
/**
 * The display Method displays the content of the file that was stored in the 
 * arrayList!.
 */
    public void disp() {
       // readFromFile();
        
        for (int s = 0; s < Catalog.size(); s++) {

            System.out.print(Catalog.get(s).getArtist().replace("_", " "));
            System.out.print("   ");
            System.out.print(Catalog.get(s).getTitle().replace("_", " "));
            System.out.print("   ");
            for (int i = 0; i < Catalog.get(s).getTrackList().size(); i++) {
                System.out.print(Catalog.get(s).getTrackList().get(i).getSongs().replace("_", " ") + "  ");
                //System.out.print(i); 
            }

            System.out.println();
            System.out.println("************************************************"
                    + "*********************************************************"
                    + "*********************************************************"
                    + "*********************************************************"
                    + "*********************************************************"
                    + "*********************************************************"
                    + "*********************************************************"
                    + "*********************************************************"
                    + "*********************************************************");

        }
    }

    /**
     * The userMenu function allows the end user to sort and search the album by
     * artist as well as searching by album title and even add a new album to
     * the file.
     */
    public void userMenu() {

        while (!menuState && choice != 4) {
            try {
                Scanner userChoice = new Scanner(System.in);
                // int choice;
                System.out.println("1. Search by Album Title");
                System.out.println("2. Search by Artist");
                System.out.println("3. Add Album to the catalog");
                System.out.println("4. quit");
                System.out.println("Please make a selection");
                choice = userChoice.nextInt();
                userChoice.nextLine();

                switch (choice) {

                    case 1: {

                        while (!nameState) {
                            try {
                                System.out.println("What Album would you like to search for?? (space is allowed) ");
                                String albumName = userChoice.nextLine();
                                albumName = albumName.replace(" ", "_");
                                Album titleName = new Album("");
                                titleName.setTitle(albumName);
                                Collections.sort(Catalog);
                                int index = Collections.binarySearch(Catalog, titleName);
                                System.out.println(Catalog.get(index));
                                choice = 0;
                                nameState = true;
                                break;

                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Wrong input");
                                nameState = false;
                            }
                        }

                        break;

                    }
                    case 2: {
                        while (!titleState) {
                            try {
                                //not complete at all yet anyway.
                                System.out.println("What artist would you like to search for?  (space is allowed)");
                                String artistName = userChoice.nextLine();
                                artistName = artistName.replace(" ", "_");
                                Collections.sort(Catalog, new CompareArtist());
                                int index = Collections.binarySearch(Catalog, new Album(artistName), new CompareArtist());
                                System.out.println(Catalog.get(index));
                                /**
                                 * One way to approach the problem is to save
                                 * Catalog into a new arrayList search for the
                                 * index of the element in the new array list
                                 * and delete the element from the array list
                                 * and save the index search again until no
                                 * elements are left in our temp array
                                 * **********************************************************************************
                                 * I suppose another way to approach the problem
                                 * would be to display every element left and
                                 * right of the element we just found until they
                                 * are not equal
                                 *
                                 * if this was to be done with a for loop would
                                 * it be something like this.?
                                 *
                                 * // we might have to do one side at a time.
                                 */
                                //System.out.println(Catalog.get(index));
                                for (int i = index; i < Catalog.size() - 1; i++) {
                                    if (Catalog.get(i + 1).getArtist().equals(Catalog.get(index).getArtist())) {
                                        System.out.println(Catalog.get(i + 1));
                                    } else {
                                        break;
                                    }
                                }
                                for (int i = index; i < Catalog.size() + 1; i++) {
                                    if (Catalog.get(i - 1).getArtist().equals(Catalog.get(index).getArtist())) {
                                        System.out.println(Catalog.get(i - 1));
                                    } else {
                                        break;
                                    }
                                }
                                titleState = true;
                                choice = 0;
                                break;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("wrong input");
                                titleState = false;
                            }
                        }
                        break;
                    }
                    case 3: {
                        String all = null;
                        System.out.println("Please give me the name of the Album you'd like to add (space is allowed). ");
                        String newAlbumName = userChoice.nextLine();
                        // userChoice.nextLine();
                        newAlbumName = newAlbumName.replace(" ", "_");
                        System.out.print("Please give me the Title of the Artist. (space is allowed) ");
                        String newAlbumTitle = userChoice.nextLine();
                        //newAlbumTitle = userChoice.nextLine();
                        newAlbumTitle = newAlbumTitle.replace(" ", "_");
                        //System.out.println("Please give me a track for the Album one by one.");
                        // String addTracks;// = userChoice.next();
                        ArrayList<String> addTracks = new ArrayList<>();

                        //addTracks = userChoice.next();
                        //addTracks.replace(" ", "_");
                        try {
                            fileWriter = new FileWriter("catalog2.txt", true);
                            fileWriter.append("\n"); // before i write to the file make sure theres a new line to the file.
                            int menu = 0;

                            while (true) {
                                System.out.print("Please give me a track for the Album one by one. (space is allowed)");
                                String tracks = userChoice.nextLine();
                                tracks = tracks.replace(" ", "_");
                                addTracks.add(tracks);
                                if(menu == 1 )userChoice.nextLine();
                                // addTracks = userChoice.nextLine();
                                //  addTracks = addTracks.replace(" ", "_");
                                System.out.print("1. Add another ");
                                System.out.print("2. exit");
                                menu = userChoice.nextInt();
//                                userChoice.nextLine();

                                if (menu == 2) {
                                   //  fileWriter.close();
                                    break;
                                } else {

                                    all = newAlbumName + " " + newAlbumTitle + " ";
                                    //fileWriter.write("\n");
                                    fileWriter.append(all);
                                    for (int i = 0; i < addTracks.size(); i++) {
                                        fileWriter.append(addTracks.get(i));
                                        fileWriter.append(" ");
                                    }
                                    // fileWriter.append("\n");
                                   
                                }

                                //   break;
                            }
                        } catch (IOException e) {
                        } finally {
                            try {
                                fileWriter.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            Catalog = new ArrayList<>();
                            readFromFile();
                            disp();
                        }
                        break;
                    }
                    case 4: {
                        choice = 4;
                        menuState = true;
                        break;
                    }
                    default:
                        System.out.println("not a choice");

                }
            } catch (InputMismatchException e) {
                System.out.println("wrong input");
                menuState = false;
            }

        }

    }

}
