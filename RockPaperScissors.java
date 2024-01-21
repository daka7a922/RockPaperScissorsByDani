import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String playerInput = "";
        String playerMove = "";

        System.out.print("Choose [r]ock, [p]aper or [s]cissors:");
        playerInput = scanner.nextLine();

        if (playerInput.equals("r") || playerInput.equals("rock")){
        playerMove = ROCK;
        } else if (playerInput.equals("p") || playerInput.equals("paper")) {
            playerMove = PAPER;
        }else if (playerInput.equals("s") || playerInput.equals("scissors")){
            playerMove = SCISSORS;
        }else {
            System.out.println("Invalid Input. Try again!");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(3)+1;
        String computerMove = "";

        switch (computerRandomNumber){

            case 1:
                computerMove = ROCK;
                System.out.println("Computer chose Rock");
                break;

            case 2:
                computerMove = PAPER;
                System.out.println("Computer chose Paper");
                break;

            case 3:
                computerMove = SCISSORS;
                System.out.println("Computer chose Scissors");
                break;
        }

        if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
        (playerMove.equals(PAPER) && computerMove.equals(ROCK)) ||
         (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))){


            System.out.println("You win!");
        } else if ((playerMove.equals(SCISSORS) && computerMove.equals(ROCK)) ||
                (playerMove.equals(ROCK) && computerMove.equals(PAPER)) ||
                (playerMove.equals(PAPER) && computerMove.equals(SCISSORS))) {

            System.out.println("Computer wins!");
        } else {
            System.out.println("Draw");
        }


    }

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
}