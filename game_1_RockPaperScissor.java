import java.util.Scanner;
import java.util.Random;

public class game_1_RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int computerInput = random.nextInt(3);
        System.out.print("(0) : Rock || (1) : Paper || (2) : Scissor \n" +
                "Enter your Choice : ");
        int userInput = input.nextInt();
        if (userInput == computerInput) {
            System.out.println("Drawn!");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("You Win !");
        } else {
            System.out.println("Computer Win!");
        }
        System.out.println("Computer choice : "+computerInput);
        if (computerInput==0){
            System.out.println("Computer choice : Rock");
        } else if (computerInput==1) {
            System.out.println("Computer choice : Paper");
        }
        else {
            System.out.println("Computer choice : Scissor");
        }


    }
}
