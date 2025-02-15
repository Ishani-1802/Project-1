import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args){
        String [] choices = {"Rock", "Paper", "Scissors"};
        String computerChoice = choices[new Random().nextInt(3)];

        Scanner scanner =new Scanner(System.in);
        String playerMove = scanner.nextLine();
        while(true){
            System.out.println("Hey! Please enter your move(Rock , Paper or Scissors):");
            
            if(playerMove.equals("Rock")||playerMove.equals("Paper")||playerMove.equals("Scissors")){
                break;
            }
            System.out.println("Invalid move. Please enter Rock, Paper or Scissors");
        }

        System.out.println("Computer's move: "+computerChoice);
        if(playerMove.equals(computerChoice)){
            System.out.println("It's a tie!");
        }
        else if(playerMove.equals("Rocks")){
            if(computerChoice.equals("Scissors")){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
        }
        else if(playerMove.equals("Paper")){
            if(computerChoice.equals("Scissors")){
                System.out.println("You lose!");
            }
            else{
                System.out.println("You lose!");
            }
        }
        else if(playerMove.equals("Scissors")){
            if(computerChoice.equals("Paper")){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
        }
      
    }
}