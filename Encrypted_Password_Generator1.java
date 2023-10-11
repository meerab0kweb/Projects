/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2;
import java.util.Scanner;//import scanner

 
public class Assignment2 {
   //method define for the program to recognize when the user enters a digit
public static boolean isDigit(char c) {//method definition heading the variable c is declared as char for digits
        //method body
    return c >= '0' || c <= '9';//for all numbers  
}//end the method return loop
    
public static void main(String[] args) {//method heading or prototype



// -------------------------------------------------------
// Written by: Meerab Khan
// -------------------------------------------------------- 

//This program Write a java program using nested selection statements and a while loop that takes user input a
//word string and generates a password based on the following conversion:
// If the character being analyzed is a digit, it concatenates the digit character to the new string.
// If the character is a lower-case letter, it concatenates the corresponding character to the new
//string as listed in the table below.
// If the character being analyzed is anything other than a lower-case letter or digit,
//it concatenates an asterisk (*) for that character.
//Letter Corresponding
//character
//a, b, c , d #
//e, f , g, h @
//i, j, k, l ?
//m, n, o, p %
//q, r, s , t &
//u, v, w, x $
//y, z !
//this program asks user for a new word until the user enters ‘NO’, ’no’, or ‘No’ to
//stop. 



//write the output welcoming message
System.out.println("????????????????????????????????");
System.out.println("        Password Generator");
System.out.println("????????????????????????????????");

        
        Scanner in = new Scanner(System.in);//declare scanner in to use for user input

        while (true) {//start with while

            System.out.println("Enter a word:(NO to stop)");//this is in the while loop it is the sentence in the output that repeats 
            String word = in.next();//declare a user input variable (word)

            // start of a if statement that ends the program when the word is NO or no or No 
            if (word.equals("NO") || word.equals("no") || word.equals("No")) {
                break;//put in break so that the program stops
            }// end of if statement

            String password = "";//declare the variable password of type string

            //start the for loop by declaring the integer i to return the number of characters present in the string word           
            for (int i = 0; i < word.length(); i++) {

                //declare a variable character as char to use in switch statements for changing specific letters
                char character = word.charAt(i);//charAt returns the character at the specified index i in the string.  

                switch (character) {//start of switch cases loop. Use switch cases to switch letters from the word string 

                    case 'a', 'b', 'c', 'd':
                        password += "#";//here are the rules to assign the character value to add or equal to the password
                        break;//use break so that the statement stops before the next statement of case starts 
                    case 'e', 'f', 'g', 'h':
                        password += "@";
                        break;
                    case 'i', 'j', 'k', 'l':
                        password += "?";
                        break;
                    case 'm', 'n', 'o', 'p':
                        password += "%";
                        break;
                    case 'q', 'r', 's', 't':
                        password += "&";
                        break;
                    case 'u', 'v', 'w', 'x':
                        password += "$";
                        break;
                    case 'y', 'z':
                        password += "!";
                        break;

                    default://use default to specify the code to run if there is no case match in the switch
                        
                        // Check if the character is a digit in the default
                        if (character >= '0' && character <= '9') {//call method invocation
                            password += (character); //this returns the digit back to the password
                        } //end of if statement
                        
                        else {//begining of else statement
                            password += ("*");// Any other character becomes an asterisk (*) except for the if statement above 
                        }//end of else statement 
                        break;// ends the default statement so that the loop repeats again from the first case statement

                }//end of switch case loop

            }//end of for loop

             
            System.out.println("\n");//add double line of space
            //output the password add \"before closing the message to output the word at the start in double quotes and "\ to the end
            System.out.println("The generated password for \"" + word + "\" is " + password);
            System.out.println();//add a line of space
            System.out.println("=============================================");//output this line

        }//end of while loop

        in.close();//close the scanner

        System.out.println("\n");//adds a double line of space between the no and the ending message 
        System.out.println("Thank you for using our program."); //output the ending message

    }//end of code

}
    
    
    
    
    
    
    
    
    
      
