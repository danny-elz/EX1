package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt() * 13  + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;


            //card.setValue(insert call to random number generator here)
            //
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        System.out.println("Card value? (1-13): ");
        int value = sc.nextInt();
        System.out.println("Suit value? (1-4)");
        int suit = sc.nextInt()-1;

        boolean found = false;
         for(int i = 0; i<hand.length; i++){
             if(hand[i].getValue() == value && hand[i].getSuit().equals(Card.SUITS[suit])){
                 found = true;
                 break;
             }
         }
         if(found){
             printInfo();
         } else {
             System.out.println("Sorry card was not found");
         }


        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here.
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        //
        // Then loop through the cards in the array to see if there's a match.

        // If the guess is successful, invoke the printInfo() method below.

    }

    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        
        //im done

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Danny, but you can call me prof, Danny or sir");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Gym");
        System.out.println("-- pass this course");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- gaming");
        System.out.println("-- working out");
      
        System.out.println();


    }

}
