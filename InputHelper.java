package week3;


import java.util.Scanner;
import java.util.logging.Logger;

public class InputHelper {
    private final Scanner reader;
    
 
    public InputHelper() {
        reader = new Scanner(System.in);
    }

    // Read Character

    /**
     *
     * @param prompt
     * @return
     */
        public char readCharacter(String prompt) {
        System.out.println(prompt + ": ");
        char inputText = reader.nextLine().charAt(0);
        return inputText;
    }    
    
    // Read Character - set of valid values

    /**
     *
     * @param prompt
     * @param validCharacters
     * @return
     */
        public char readCharacter(String prompt, String validCharacters) {
        char inputText;
        boolean inputError;        
        do {
            inputError = false;             
            System.out.println(prompt + ": ");
            inputText = reader.nextLine().toUpperCase().charAt(0);
            if (validCharacters.indexOf(inputText) == -1) {
                inputError = true;
                System.out.println("Character out of range: please re-enter: "); 
            }
        } while (inputError);        
        return inputText;
    }     
    
    // Read String

    /**
     *
     * @param prompt
     * @return
     */
        public String readString(String prompt) {
        
        System.out.println(prompt + ": ");
        String inputText = reader.nextLine();
        return inputText;
    }
    
    
}