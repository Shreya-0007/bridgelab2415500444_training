import java.util.Scanner;

class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------- SUITS AND RANKS --------
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

        // -------- INITIALIZE DECK --------
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        // -------- SHUFFLE DECK --------
        for (int i = 0; i < numOfCards; i++) {
            int rand = i + (int)(Math.random() * (numOfCards - i));
            // swap deck[i] and deck[rand]
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }

        // -------- INPUT NUMBER OF PLAYERS AND CARDS --------
        System.out.print("Enter number of players: ");
        int playersCount = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        if (playersCount * cardsPerPlayer > numOfCards) {
            System.out.println("Not enough cards to distribute!");
            sc.close();
            return;
        }

        // -------- DISTRIBUTE CARDS --------
        String[][] players = new String[playersCount][cardsPerPlayer];
        index = 0;
        for (int i = 0; i < playersCount; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index];
                index++;
            }
        }

        // -------- PRINT PLAYER CARDS --------
        for (int i = 0; i < playersCount; i++) {
            System.out.println("\nPlayer " + (i+1) + "'s cards:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(players[i][j]);
            }
        }

        sc.close();
    }
}
