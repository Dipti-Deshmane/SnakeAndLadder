package SnakeAndLadder;

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPosition = 0;
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;

        int option = random.nextInt(3);
        switch (option) {
            case 0:
                System.out.println("Player rolled a " + diceRoll + ". Stay at same position.");
                break;
            case 1:
                System.out.println("Player rolled a " + diceRoll + ". It's a ladder! Moving up.");
                playerPosition += diceRoll;
                break;
            case 2:
                System.out.println("Player rolled a " + diceRoll + ". it's a snake! Moving down.");
                playerPosition -= diceRoll;
                break;
        }
    }
}