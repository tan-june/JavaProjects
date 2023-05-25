import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Number Guessing Game! (0-50)");
        System.out.println("You will have 5 tries!");
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int number = (int) Math.floor(Math.random()*50);
        boolean guess = false;

        while(guess != true){
            if(counter > 4){
                System.out.println("You're Out of Guesses! The number was: " + number + "!");
                System.exit(1);
            }
            System.out.print("Please Guess #" + (counter+1) + ": ");
            int guessed = (int) in.nextDouble();
            if(guessed == number){
                System.out.println();
                System.out.println("Congrats, you guessed the right number: " + guessed + "!");
                guess = true;
            }
            else if(guessed > number){
                System.out.println("Less Than");
            }
            else if(guessed < number){
                System.out.println("Greater Than");
            }
            counter = counter+1;
        }
    }
}