package rci.tutorial.enums;

/**
 * Created by cimorads on 4/25/2016.
 */
public class Main {
    public static void main (String[] args) {
        Card a = new Card(Rank.DEUCE, Suit.DIAMONDS);
        Card b = new Card(Rank.FIVE, Suit.HEARTS);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
