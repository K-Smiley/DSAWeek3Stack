
package DSAWeek3;

import java.util.Stack;


public class BalBraces {
     public static void main(String args[]){
        String testString = "[{}]";
        Stack <Character> bStack = new Stack <>();
        
        //read a string containg the brackets
        //push any opening bracket to stack, for closing bracket pop the stack and this should match the closing bracket
        //continue for the full length of string, at the end stack should be empty
        boolean bal = true;
        for(int i = 0;i<testString.length(); i++){
            char ch = testString.charAt(i);
            if(ch =='[' || ch == '{' || ch == '(') //encountered an opening bracket
                bStack.push(ch);
            else if( ch == ']'){
                if(bStack.isEmpty() || bStack.pop() != '[') //encountered a closing bracket{
                    bal = false;
            
            }
            else if( ch == '}'){
                if(bStack.isEmpty() || bStack.pop() != '{') //encountered a closing bracket{
                    bal = false;
            
            }
            else if( ch == ')'){
                if(bStack.isEmpty() || bStack.pop() != '(') //encountered a closing bracket{
                    bal = false;
            
            }
             
        }
        
        if( (bStack.empty() && bal == true))
            System.out.println("It is a balanced braces expression");
        else
            System.out.println(testString + "It is not a balanced braces expression");        
    
          
    }
    
}

