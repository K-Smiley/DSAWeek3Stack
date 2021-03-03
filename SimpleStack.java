package week3;

import java.util.Scanner;


public class SimpleStack implements IADTStack {

    // instance variables
    public String[] stack; // declare string array
    private static final int MAXELEMENTS = 100; //var belongs to class, can't be changed
    public int top; // declare var for top of array
    
 
 

    public void createStack() {
        
        stack = new String[MAXELEMENTS]; // create new String array, with max no. of items 100
        top = 0; // initialise var for top of array
    }

    public int size() {
        
        return this.MAXELEMENTS; // as in capacity, different to length

    }

    public boolean isEmpty() {

        if (top == 0) {
            System.out.println("Stack Array IS empty");
            return true;
        }
        System.out.println("Stack Array is NOT empty");
        return false;

    }

    public boolean isFull() {

        if (top == MAXELEMENTS) {
            System.out.println("Stack Array IS full");

        }
        System.out.println("Stack Array is NOT full");
        return true;

    }

    public void push(String item) {

        System.out.println("Top index before push is: " + top);
        stack[top] = item; // add new string to top of array
        top++; // increment top

        System.out.println(item);
        System.out.println("Top index after push is: " + top);

    }

    public String pop() {

        String item = stack[top - 1]; // top is empty space, most recent item is 1 below this
        System.out.println("Item removed is " + item);
        return item;

    }
    
    
    public static void main(String[] args) {
        
    IADTStack testSimpleStack = new SimpleStack();
    testSimpleStack.createStack();

    InputHelper inputHelper = new InputHelper();
   



    boolean finished = false;
        
        do {
          
            
            System.out.print("\nA. Add item to Stack");
            System.out.print("\tB. Remove item from Stack");                  
            System.out.print("\tQ. Quit\n");         
            char choice = inputHelper.readCharacter("Enter choice", "ABQ");
            switch (choice) {
                case 'A': 
                        String item = inputHelper.readString("Enter item to add");
                	testSimpleStack.push(item);
                    break;
                case 'B':  
                	testSimpleStack.pop();
                    break;
                       
                case 'Q': 
                    finished = true;
            }
        } while (!finished);        
    }
  
    
    
    
    
    


}
    
    
   