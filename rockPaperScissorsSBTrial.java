//Shawn Blank
//December 2nd 2019
//rock paper scissors project
import java.util.*;
import java.util.Random;
public class rockPaperScissorsSBTrial{//begin class
public static void main (String[]args){//begin main
//Game rules
System.out.println("The game will begin by asking the user to select from a number from 1-3 " + 
"1 is equal to rock, 2 is equal to paper, and 3 is equal to scissors. \nOnce you select your item you will then play against the computer who also picks a symbol " +
"The rules of the game:\n1.) rock beats scissors 2.) paper beats rock 3.) scissors beats paper " + "\n"+
"\nIf the user and the computer choose The same item then the game will automatically restart and be played again. \nIf someone wins then the be given the chance to play again " +
"and a new outcome will be generated from the computer" + "\nif you do wish to play again then say yes, other wise say NO and the game will stop");


//Scanner class created
Scanner keyboard = new Scanner(System.in);
//variables being given an Integer data type
int userInput,userChoice,computerChoice;

//storing the functions in a variable 
//calling the functions
System.out.println("");

//Stroing the uetr input



//storing the computer generated number


//inputting the returned values to be calculated to decide a winner


// boolean value being made to see if the value is true
boolean playAgain = true;

//while loop used to run the program if the conditions are true
while(playAgain==true){//begin while loop
      
      //proram being run from three functions
      userChoice = userInput();
      computerChoice=randomNumberGenerator();      
      results(userChoice, computerChoice);
      
      // if statement to say wheaher or not the symbols are the same
      if(userChoice != computerChoice){//if statement
         
         //asking if they would like to play again if yes then runs again
         System.out.println("");
         System.out.println("Would you like to play again? ");
         
         String play = keyboard.nextLine();
        // if the user says no then the program will stop
        
      if(play.equalsIgnoreCase("no")){//begin if 
         
         playAgain=false;
              
         }//end if two
      
      }// end if one
      
      }// end while loop

}// end main 

// user input function made 
public static int userInput(){

//scannetr being used
Scanner keyboard = new Scanner(System.in);

//integer data type
int choice;

//asking user to make choice
System.out.println("please enter either a number 1,2,3. The number 1 would equal rock, the number 2 would equal paper, and the number 3 would equal scissors");
choice = keyboard.nextInt();

//switch statement used to select one three numbers in order to make choice
   switch(choice){
//number 1 means rock
            case 1:
                        System.out.println("user has chosen: rock");
                  break;
                  //number 2 means paper
            case 2:
                        System.out.println("user has chosen: paper");
                  break;
                  //else or number 3 
            case 3:
                         System.out.println("user has chosen: scissors");
                         
                        
               
           
           
           }
                      
           //returning the user input
           return choice;
}

//function made to generate a random number that would then select a choice of symbol
public static int randomNumberGenerator(){
//integer data type
int randomNum;
//random number class being used 
Random randomNumbers =new Random();
//random num would then chooses numbers from the ranges pf 1-3
randomNum=randomNumbers.nextInt(3) + 1;
//switch used to say that whatever number is selected print the word 
switch(randomNum){
            case 1:
                  System.out.println( "computer has chosen: Rock");
                  break;
            case 2:
                  System.out.println("computer has chosen: paper");
                  break;
            default:
                  System.out.println("computer has chosen: scissors");
           }
           //returning the number being selected
                      
          return randomNum;
                                                   
}

//final outcome of who won made into results function
public static void results(int user, int computer){
      
    //if statements being made in order to decide who wins
       if(user==1 && computer == 1){
       //printing out the outcome 
       System.out.println("Rock ties Rock, play again \n");       
      }
      else if(user==1 && computer==2){
         System.out.println("Paper beats Rock, The computer wins :(");
      }
      else if(user==1 && computer==3){
         System.out.println("Rock beats Scissors, The user wins :)");
      }
      else if(user==2 && computer==1){
         System.out.println("Paper beats Rock, The user wins :)");
         }
      else if(user==2 && computer==2){
         System.out.println("Paper ties paper, play again \n");
      }
      else if (user==2 &&computer==3){
         System.out.println("Scissors beats paper, The computer wins :(");
      }
      else if(user==3 && computer==1){
         System.out.println("Rock crushes Scissors, the computer wins :(");
         }
      
      else if(user==3 && computer==2){
         System.out.println("Scissors cuts paper, The user wins :)");
         }
      
      else if(user==3 && computer==3){
         System.out.println("Scissors ties Scissors, play again \n");
         
    //end of outcome     
         
}

         
}
         
}
         




