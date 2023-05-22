import java.util.Scanner;
import static java.lang.Math.pow;

public class InterestApplication {
    public static void run() {
        double principal;
        double interest;
        int time;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Banking Application!");
        System.out.print("Simple (1) or Compound Interest (2)? ");
        int i = in.nextInt();
        System.out.print("Please enter the Principal: ");
        principal = in.nextDouble();
        System.out.print("Please enter the rate (%) (enter in % form): ");
        interest = in.nextDouble();
        System.out.print("Please enter the time in years: ");
        time = in.nextInt();
        if (i == 1) {
            simpleInterest(principal, interest, time);
        } else {
            compoundInterest(principal, interest, time);
        }
    }

    private static void simpleInterest(double principal, double rate, double time) {
        double interest_earned = principal * rate * time * 0.01;
        System.out.printf("$%.2f in Simple Interest Earned on $%.2f at %.2f%% in %.2f years.", interest_earned, principal, rate, time);
        System.out.println();
    }

    private static void compoundInterest(double principal, double rate, int time) {
        double interest_earned = (principal * pow((1 + (rate * 0.01)), time)) - principal;
        System.out.printf("$%.2f in Simple Interest Earned on $%.2f at %.2f%% in %d years.", interest_earned, principal, rate, time);
        System.out.println();
    }
}