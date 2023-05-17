import java.util.Random;

public class PairOfDice {
    private int firstDice;
    private int secondDice;

    public PairOfDice() {
        roll(); // Roll the dice initially
    }

    public void roll() {
        Random random = new Random();
        firstDice = random.nextInt(6) + 1;
        secondDice = random.nextInt(6) + 1;
    }

    public int getFirstDice() {
        return firstDice;
    }

    public int getSecondDice() {
        return secondDice;
    }

    public int getTotal() {
        return firstDice + secondDice;
    }

    public static void main(String[] args) {
        PairOfDice dice = new PairOfDice();
        int rolls = 0;

        while (dice.getTotal() != 2) {
            dice.roll();
            rolls++;
            System.out.println("Roll " + rolls + ": " + dice.getFirstDice() + " + " + dice.getSecondDice() + " = " + dice.getTotal());
        }

        System.out.println("It took " + rolls + " rolls to get snake eyes!");
    }
}
