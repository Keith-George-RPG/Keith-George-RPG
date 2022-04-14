package oop.game;

import java.util.Scanner;

public class DiceRoll {

    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        boolean RollDice = true;
        do {
            System.out.println("Would you like to roll the dice? type y or n");
            String decision = scanner.next();
            if (decision.equalsIgnoreCase("y")) {
                System.out.println("How many total sides are on each dice?");
                int numberOfSides = scanner.nextInt();
                int diceOne = getNumber(numberOfSides);
                int diceTwo = getNumber(numberOfSides);
                System.out.printf("You rolled a %d and a %d \n", diceOne, diceTwo);
            } else {
                System.out.println("have a good day!");
                RollDice = false;
            }
        } while(RollDice);
    }

    public static int getNumber(int numSides) {
        int rolledNumber = (int) (Math.random() * numSides + 1);
        return rolledNumber;
    }
}
