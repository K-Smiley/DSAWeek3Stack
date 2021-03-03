
package DSAWeek3;


import java.util.Stack;


public class Palindrome {
    
    public static void main(String args[]){
        String testString = "able was i i saw elba";
        Stack <Character> pStack = new Stack <>();
        
        //read an item and push to stack
        for(int i = 0; i < testString.length(); i++){
            
            pStack.push(testString.charAt(i));
        }
        
        boolean isPalindrome = true; 
        //pop an item from the stack and compare item by item with the testString
        for(int j = 0; j < testString.length(); j++){
            
            if(testString.charAt(j)!= pStack.pop()){
                isPalindrome = false;
                break;
            }
                
        }
        if(isPalindrome)
            System.out.println(testString + ": is a palindrome");
        else
            System.out.println(testString + ": is not a palindrome");
    }
    
}

