/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgos;

import java.util.Random;
import java.util.Arrays;

/**
 * 
  Title:           Programming Assignment: Sorting Algorithms
  Semester:        COP3337 – Fall 2017
  @author          5793866
  Instructor:      C. Charters
  
   Due Date:       11/07/2017
  
 * The purpose of this class is to create different sorting algorithms and see
 * the speed that they execute the sorting on a 20000 array with random elements
 * in it.
 */
public class SortingAlgos {

    
    public static int[] myOriginalUnsortedArray1 = new int[20];
    public static int[] myCopyUnsortedArray2 = new int[20];
    public static long bubbleSortDuration, quickSortDuration, selectionSortDuration, insertionSortDuration, mergeSortDuration;
     public static int count =0;
     
    /**
     * Calls all the public static methods.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // SortingAlgos func = new SortingAlgos();
          generateRanNums();
        
      //   copyRanNums();
        // quickSort(count, myOriginalUnsortedArray1.length-1);  //Extra Credit!
//        
//        copyRanNums();
//        mergeSort();  //Extra Credit!
//        
          copyRanNums(); // resets the sorted copy arry = unsorted original array
          selectionSort();
        
          copyRanNums();
          insertionSort();
        
          copyRanNums();
          bubbleSort();
          
          compareSortTimes();
    }

  public static void generateRanNums()
    {
        Random rand = new Random(); 
        for(int i =0; i <myOriginalUnsortedArray1.length;i++)
        {
            myOriginalUnsortedArray1[i] = (int)rand.nextInt(5000)+1;
        }
    }
  
  
    public static void copyRanNums()
    {
        for(int i =0; i < myOriginalUnsortedArray1.length; i++)
        {
            myCopyUnsortedArray2[i] = myOriginalUnsortedArray1[i];
        }
    }
    
    /**
     * We have an index in the outer loop indicating the current location of the
     * "smallest number" starting the inner loop one element higher than the
     * outer loop going all the way to the end of the size of the array. if any
     * of those elements is smaller than the index set in the outer loop the
     * index gets updated to the index in the inner loop. we then swap the
     * elements the biggest one for the smallest one
     */
    public static int[] selectionSort()
    {
         
        long start = System.nanoTime();
        for (int i = 0; i < myCopyUnsortedArray2.length - 1; i++)
        {
            
            int index = i;
            for (int j = i + 1; j < myCopyUnsortedArray2.length; j++)
            {
               if (myCopyUnsortedArray2[j] < myCopyUnsortedArray2[index]) index = j; 
            }
                
      
            int smallerNumber = myCopyUnsortedArray2[index];  
            myCopyUnsortedArray2[index] = myCopyUnsortedArray2[i];
            myCopyUnsortedArray2[i] = smallerNumber;
        }
        long end = System.nanoTime();
        selectionSortDuration = end - start;
        return myCopyUnsortedArray2;
    
    }
    
    
    /**
     * In the outer loop of this method its first index begins at one, then on 
     * the inside the inner loop... if the previous element is bigger than the 
     * current element set the current element = previous element and decrement 
     * the index until this condition is not true, going back to the outer
     * loop and starting over. So this method compares the "next" element in the 
     * array with all of the previous elements before it.
     */
   public static void insertionSort()
   {
       long startTime = System.nanoTime();
      for (int i = 1; i < myCopyUnsortedArray2.length; i++)
      {
         int next = myCopyUnsortedArray2[i];
         // Move all larger elements up
         int j = i;

         while (j > 0 && myCopyUnsortedArray2[j - 1] > next)
         {
            myCopyUnsortedArray2[j] = myCopyUnsortedArray2[j - 1]; //set the current element = to the previous element.
            j--;
         }
         // Insert the element
         myCopyUnsortedArray2[j] = next;  // we exit the loop j becomes previous because of our j-- value inside the loop.
      }
      
        long end = System.nanoTime();
        insertionSortDuration = end-startTime;
   }

   /**
    * Bubble Sort is an O(n^2) algorithm due to the nature of its two for loops
    * since the inner loop started at one if the previous element is bigger than 
    * the following element swap them. keep on moving the element to the end until
    * this is no longer the case and the outer loop decreases starting once more.
    */
    public static void bubbleSort()
    {
        long start = System.nanoTime();
        for (int i = (myCopyUnsortedArray2.length - 1); i >= 0; i--) 
        {
            for (int j = 1; j <= i; j++) 
            {
                if (myCopyUnsortedArray2[j - 1] > myCopyUnsortedArray2[j]) 
                {
                    int temp = myCopyUnsortedArray2[j - 1];
                    myCopyUnsortedArray2[j - 1] = myCopyUnsortedArray2[j];
                    myCopyUnsortedArray2[j] = temp;
                }
            }
        }
        long end = System.nanoTime();
        bubbleSortDuration = end-start;
    }
    
    /**
     * Display all the times the algorithms took to run.
     */
    public static void compareSortTimes()
    {
        long smallest =0;
        if(bubbleSortDuration < insertionSortDuration && bubbleSortDuration <selectionSortDuration)
        {
            System.out.println("our bubbleSort has the fastest time with "+bubbleSortDuration+" nanoseconds");
        }
        else if(insertionSortDuration < bubbleSortDuration && insertionSortDuration < selectionSortDuration)
        {
            System.out.println("our insertionSort has the fastest time with "+insertionSortDuration+" nanoseconds");
        }
        else{  System.out.println("our selectionSort has the fastest time with "+selectionSortDuration+" nanoseconds");}
        
        System.out.println("Bubble sort Time "+ bubbleSortDuration +" nanoseconds.");
        System.out.println("Insertion Sort Time "+ insertionSortDuration+" nanoseconds");
        System.out.println("Selection Sort Time "+ selectionSortDuration+" nanoseconds");
        
    }
}

