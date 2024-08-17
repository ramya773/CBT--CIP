import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){
        System.out.println("Try to guess the number between 1 and 100.");

        Scanner sc = new Scanner(System.in);

        boolean playagain;
        do {
            guess();
            System.out.println("Would you like to play again? Y/N");
            String playagainStr = sc.next();
            playagain = playagainStr.equalsIgnoreCase("Y");
        } while (playagain);
        System.out.println("Thanks for playing.");
    }

    static void guess(){
        int cn;
        int ug;
        int gc;
        cn = (int) (100 * Math.random()) + 1;
        gc = 0;
        System.out.println();
        System.out.println("Guess The Number: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            ug = sc.nextInt();
            gc++;
            if (ug == cn) {
                System.out.println("You guessed the correct number.");
                break;
            }
            if (gc == 5) {
                System.out.println("Out of chances You lose. The number was " + cn);
                break;
            }
            if (ug < cn && ug>0) {
                System.out.println("Your number is low. Try again.");
            } else if (ug > cn && ug<101) {
                System.out.println("Your number is high. Try again.");
            }
        }

        System.out.println();
    }
}
