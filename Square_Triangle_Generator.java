/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;
import java.util.Scanner;//import scanner

public class Answer2 {public static void main(String[] args) {
       // -------------------------------------------------------

// Written by: Meerab 


// -------------------------------------------------------- 
  
// This program outputs a perimeter of a 2D shape with the sum of all its sides.This program displays a menu to
//the user to draw a shape and calculate its perimeter based on the user inputs.
// If user enters 1 which means Square, the program prompts user the length of it.
//Then it draws a square using ‘X’, the primary diagonal with ‘\’ and the secondary
//diagonal with ‘\’.
//Also, it displays the perimeter based on the user input. For example, if user
//enters 6 as the length of one side, perimeter is calculated as, 6*4=24
// If user enters 2 which means Triangle, the program gets the length of it from user.
//Then it draws the triangle using the ‘X’.
//Also, it displays the perimeter based on the user input. For example, if user
//enters 5 as the length of one side, perimeter is computed as, 5*3=15.
// If user enters 3 which means Quit, the program is terminated with a closing message.
//if user enters an invalid menu choice, the program continues prompting until a
//valid choice is entered. 

  
  
  
  
  
  
        //display a welcoming message
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("               Welcome to Shape Geneator Program");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println();
        System.out.println("Choose an item from the following list:");
        System.out.println("----------------------------------------");
       //output the choices
        System.out.println("""             
                   1 - Square
                   2 - Triangle
                   3 - Quit""");
        System.out.println("----------------------------------------");
        System.out.println();//output a line of space before the next sentence below
        System.out.print("Please enter your choice:");
        
        //import scanner
        Scanner kb = new Scanner(System.in);////declare scanner kb to use for user input
        
        //the while loop starts here with the boolean condition
        while (true) {
           //here is the user input for the choice
            int number = kb.nextInt();
            
            


            //the if statement starts here for the square choice
            if (number == 1) {
                System.out.print("\n");//this is to add a line of space if user enters an invalid choice
                System.out.println("You have entered \'" + number + "\' for 'Square'.");//output a message for the selected choice
                System.out.println("Please enter the length of the side:");//output the message that prompts user to enter a length
                int length = kb.nextInt();//here is the user input for the length

           
             //the square pattern starts here in a for loop
             int i,j;//declare the variables i and j as integers
              
             for (i = 1; i <= length; i++) {//start the for loop for i       
                for (int space = 0; space < 45; space++) {//this statement is inside the i for loop
                  System.out.print(" ");//this outputs 45 character space for the entire square 
                }//this ends the 45 character space statement here but not the i for loop!
                     
                   
             for ( j = 1; j <= length; j++) {//start the for loop for j
                if ( i == 1 || i == length || j == 1 || j == length || i == j || j == (length - i + 1))
                {//start of the if statement inside the i and j loops we need to put == so that all sides are equal
                  System.out.print("X ");//output of the if statement
                } //end of the if statement
                
                else if (i < j)
                {//start of the else if statement in the i and j loops
                  System.out.print("/ ");//output of the else if for the slashes statement
                } //end of the else if statement
               
                else 
                {//start of the else statement in the i and j loops
                  System.out.print("\\ ");//output the backslashes
                        }//end of the else statement
             }//end of the j for loop
                  System.out.println();//output a line of space between the square pattern and the perimeter sentence
             }//end of i for loop
               
              
             //declare the variable p as a formula for the perimeter of the square(length times 4)
             int p = 4 * length; 
             System.out.println("The perimeter of the Square is " + p);//output the perimeter sentence
             System.out.println();//output space between perimeter sentence and the endind message
             System.out.println("Thanks for using Shape Generator program!");//ending message 
             break;//exit the program
            
            } // the if statement ends here for the selected choice number 1
            
            

            //the else if statement starts here for the selected choice number 2
            else if (number == 2) {
                 System.out.print("\n");//this is to add a line of space if user enters an invalid choice
                 System.out.println("You have entered \'" + number + "\' for 'Triangle'.");//
                 System.out.println("Please enter the length of the side:");//output a message for the selected choice
                 int length = kb.nextInt();//here is the user input for the length
                
                
                 //triangle pattern is here
                int i, j;//declare the variables i and j as integers
               
              for (i = 1; i <= length; i++) {//you need to start the i for loop here so that the 45 character space applies to all the triangle design
                 for (int space = 0; space < 45; space++) {//this is to add 45 character space for the triangle position
                     System.out.print(" ");//this outputs the space in the above statement 
                    }// end of the for 45 characters space
                    
              for (j = 1; j <= i; j++) {//start of the for j loop
                     System.out.print("X ");//this outputs the X symbol for i and j ascending numbers in line till the length(i=length and j=i) 
                    }//end of the j for loop
                     System.out.println();//outputs a line space between the triangle pattern and the perimeter sentence  
                }// end of the i for loop
                
                
                //declare the variable p as the perimeter formula of a triangle(length times 3)
              int p = 3 * length;
              System.out.println("The perimeter of the Triangle is " + p);//output the perimeter sentence
              System.out.println();//output space between perimeter sentence and the endind message
              System.out.println("Thanks for using Shape Generator program!");//ending message
              break;//exit the program
            } //the else if statement ends here for the selected choice number 2
            
           
            
            //the else if statement starts here for the third choice which is quit
            else if (number == 3) {
                System.out.println();//outputs a line of space if user enters an invalid choice
                System.out.println("See you next time!");//terminating sentence
                break; // Exit the program
            } //the else if statement ends here
            
            

          // the else statement starts here for the invalid choice
            else {
                System.out.print("Invalid choice!!! Try again:");//output the sentence try again 
            }//the else statement ends here
        
        
        
        }//the while loop ends here

        kb.close();// close the scanner

    }//close the code
}
