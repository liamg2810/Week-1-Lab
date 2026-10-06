package mmu.liam.ac.uk;

import mmu.liam.ac.uk.games.CoinFlip;
import mmu.liam.ac.uk.games.IGame;

import java.util.Scanner;

public class Main {
    static void main() {
        var games = new IGame[] { new CoinFlip() };

        IO.println("Welcome to the game show!\nWe have a nice array of games.");

        for (int i = 0; i < games.length; i++) {
            IO.println(i + 1 + ": " + games[i].getName());
        }

        Scanner scanner = new Scanner(System.in);

        var num = -1;

        while (num < 0 || games.length <= num) {
            IO.println("Please enter a valid number from the list:\n");
            num = scanner.nextInt() - 1;
            scanner.nextLine();
        }

        games[num].play();

        IO.println("Thanks for playing!");
    }
}
