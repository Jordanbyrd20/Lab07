import java.util.Random;
import java.util.Scanner;
public class Task08 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random rand = new Random();

                String choice;

                do {
                    int roll = 0;
                    int die1, die2, die3, sum;

                    System.out.println("\nRoll  Die1  Die2  Die3   Sum");
                    System.out.println("--------------------------------");

                    do {
                        roll++;

                        die1 = rand.nextInt(6) + 1;
                        die2 = rand.nextInt(6) + 1;
                        die3 = rand.nextInt(6) + 1;

                        sum = die1 + die2 + die3;

                        System.out.printf("%-5d %-5d %-5d %-5d %-5d%n",
                                roll, die1, die2, die3, sum);

                    } while (!(die1 == die2 && die2 == die3));

                    System.out.print("Run again? (Y/N): ");
                    choice = scanner.next();

                } while (choice.equalsIgnoreCase("Y"));

                System.out.println("Goodbye!");
                scanner.close();
            }
        }


