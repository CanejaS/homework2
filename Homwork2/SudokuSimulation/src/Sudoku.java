/**
 * This class is responsible for formatting the string, creating the sudoku 
 * board layout and checking if its a valid board by verifying if the columns
 * rows and sub-squares are valid.
 * @author cadelmonterde
 */
public class Sudoku {
/**
 * This method takes in a parameter S which is a string that contains all the
 * numbers that build a Sudoku and creates the right format for it.
 * @param s
 * @return 
 */
    public String[][] makeSudoku(String s) {
        int SIZE = 9;
        int k = 0;
        String[][] x = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x[i][j] = s.substring(k, k + 1);
                k++;
            }
        }
        return x;
    }
/**
 * This method designs the printable table format for the Sudoku board
 * @param x
 * @return 
 */
    public String getPrintableSudoku(String[][] x) {
        int SIZE = 9;
        String temp = "";
        for (int i = 0; i < SIZE; i++) {
            if ((i == 3) || (i == 6)) {
                temp = temp + "=================\n";
            }
            for (int j = 0; j < SIZE; j++) {
                if ((j == 3) || (j == 6)) {
                    temp = temp + " || ";
                }
                temp = temp + x[i][j];
            }
            temp = temp + "\n";
        }
        return temp;
    }
/**
 * This method takes into account all the methods that check if the sub-squares
 * rows and columns are valid and return true if so.
 * @param x
 * @return 
 */
    public boolean isValidSudoku(String[][] x) {
        return rowsAreLatin(x) && colsAreLatin(x) && goodSubsquares(x);
    }
/**
 * Checks if all the rows are valid by checking one by one and making sure that 
 * all the values from 1 through 9 are found on every row.
 * @param x
 * @return 
 */
    public boolean rowsAreLatin(String[][] x) {
        boolean test = true;
        for (int i = 0; i < x.length; i++) {
            test = test && rowIsLatin(x,i);
        }
        return test;
    }

    /**
     * Checks if a single row is valid by making sure all the numbers from 1 
     * through 9 show up in the row.
     * @param x
     * @param i
     * @return 
     */
    public boolean rowIsLatin(String[][] x, int i) {
        // fill in your code here
        Boolean[] flag = new Boolean[9];
        for(int z=0; z<flag.length;z++)
        {
            flag[z] = false;
        }
        
        for(int y =0; y <x.length; y++)
        {
            flag[Integer.parseInt(x[i][y])-1] = true; //starts at 0 but at some point x[i][x] is gonna be one hence out of bound.
        }
        for(int j =0; j<9; j++)
        {
            if(flag[j] != true)
            return false;
        }
        
        return true;
    }
/**
 * This function checks if all the columns are valid by checking one at a time
 * to make sure they all contain the numbers 1 through 9.
 * @param x
 * @return 
 */
    public boolean colsAreLatin(String[][] x) {
        // fill in your code here
        boolean test = true;
        for (int i = 0; i < x.length; i++) 
        {
            test = test && colIsLatin(x,i);
        }
        return test;
    }
/**
 * This function checks if a single column is valid it sets a boolean to true 
 * if the value is found meaning if there's a false value in the boolean array
 * the column is invalid.
 * @param x
 * @param j
 * @return 
 */
    public boolean colIsLatin(String[][] x, int j) {
        // fill in your code here
        Boolean[] flag = new Boolean[10];
        
        for(int z=0; z<flag.length;z++)
        {
            flag[z] = false;
        }
        
        for(int k =0; k <x.length; k++)
        {
            flag[Integer.parseInt(x[k][j])-1] = true;   
        }
        for(int k =0; k< 9; k++)
        {
            if(flag[k] != true)
                return false;
        }
        return true;
    }
/**
 * This method checks if all the sub-squares are valid by checking one at a time 
 * starting in the top left corner of every sub-square.
 * @param x
 * @return 
 */
    public boolean goodSubsquares(String[][] x) {
        
        boolean test = true;

         for (int a = 0; a < 3; a++)
       {
           for (int b = 0; b < 3; b++)
           {
               test = test && goodSubsquare(x,3*a,3*b);
           }
       }

        return test;
    }
/**
 * This Method takes in the Sudoku board a row and colum to check if a single
 * sub-square is valid meaning it contains every number from 1 through 9.
 * @param x
 * @param i
 * @param j
 * @return 
 */
    public boolean goodSubsquare(String[][] x, int i, int j) {
        Boolean[] flag = {false,false,false,false,false,false,false,false,false};//;new Boolean[9];
        
//        for(int z=0; z<flag.length;z++)
//        {
//            flag[z] = false;
//        }
//        
        for(int y=i; y< i+3; y++)
        {
            for(int z =j; z < j+3;z++)
            {
                flag[Integer.parseInt(x[y][z])-1] = true;
                    
            }
        }
        for(int k =0; k< 9; k++)
        {
            if(flag[k] != true)
                return false;
        }
        return true; 
    }

}
