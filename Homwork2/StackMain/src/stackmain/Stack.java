/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackmain;

/**
 *
 * @author cadelmonterde
 */
public abstract class Stack {
    private int[] hold;
    private int size;
    private int pos;// = -1;
    public Stack(int size)
    {
        this.size = size;
        hold = new int[size];
        pos = -1;
    }
    public abstract void push(int value);
//        pos++;
//        hold[pos] = value;
        
    //in our case pop should return an int. it removes the top element???
    public abstract int pop();
//        int last_el = pos;
//        pos--;
//    //    remove();
//        return hold[last_el];
    
    
    
    
    //    private void remove ()
//    {
//        int[] temp_array = null;
//        for(int i =0; i < hold.length-1; i ++)
//        {
//            temp_array[i] = hold[i];
//        }
//        hold = temp_array;
//    }
}
