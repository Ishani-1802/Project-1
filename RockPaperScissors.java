import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args){
        String [] choices = {"Rock", "Paper", "Scissors"};
        String computerChoice = choices[new Random().nextInt(3)];
        String playerMove;
        Scanner scanner =new Scanner(System.in);
        
        while(true){
            System.out.println("Hey! Please enter your move(Rock , Paper or Scissors):");
            playerMove = scanner.nextLine();
            
            if(playerMove.equalsIgnoreCase("Rock")||playerMove.equalsIgnoreCase("Paper")||playerMove.equalsIgnoreCase("Scissors")){
                break;
            }
            System.out.println("Invalid move. Please enter Rock, Paper or Scissors");
        }

        System.out.println("Computer's move: "+computerChoice);
        if(playerMove.equalsIgnoreCase(computerChoice)){
            System.out.println("It's a tie!");
        }
        else if(playerMove.equalsIgnoreCase("Rock")){
            if(computerChoice.equalsIgnoreCase("Scissors")){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
        }
        else if(playerMove.equalsIgnoreCase("Paper")){
            if(computerChoice.equalsIgnoreCase("Scissors")){
                System.out.println("You lose!");
            }
            else{
                System.out.println("You lose!");
            }
        }
        else if(playerMove.equalsIgnoreCase("Scissors")){
            if(computerChoice.equalsIgnoreCase("Paper")){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
        }
      
    }
}
