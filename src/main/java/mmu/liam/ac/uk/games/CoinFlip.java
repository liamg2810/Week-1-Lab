package mmu.liam.ac.uk.games;

public class CoinFlip implements IGame {
    private int heads = 0;
    private int tails = 0;

    @Override
    public void play() {
        while (true) {
            var in = IO.readln("Awaiting input to flip coin... (q to quit) ");

            if (in.equals("q"))
                break;

            flip();
        }
    }

    @Override
    public String getName() {
        return "Coin Flip";
    }

    private void flip() {
        if (Math.random() < 0.5) {
            IO.println("You flipped heads. You have flipped heads " + ++heads + " times.");
        } else {
            IO.println("You flipped tails. You have flipped tails " + ++tails + " times.");
        }
    }
}
