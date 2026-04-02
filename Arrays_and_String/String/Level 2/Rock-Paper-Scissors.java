import java.util.Scanner;

class RockPaperScissors_NoFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- INPUT ----------------
        System.out.print("Enter number of games to play: ");
        int games = sc.nextInt();

        String[] choices = {"Rock", "Paper", "Scissors"};
        String[][] results = new String[games][3]; // [Round][User, Computer, Winner]

        int userWins = 0, compWins = 0, draws = 0;

        // ---------------- PLAY GAMES ----------------
        for (int i = 0; i < games; i++) {
            // User choice
            System.out.println("\nRound " + (i + 1));
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.next();

            // Computer choice (random)
            int rand = (int)(Math.random() * 3);
            String compChoice = choices[rand];

            // Determine winner
            String winner = "";
            if (userChoice.equalsIgnoreCase(compChoice)) {
                winner = "Draw";
                draws++;
            } else if (
                (userChoice.equalsIgnoreCase("Rock") && compChoice.equals("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && compChoice.equals("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && compChoice.equals("Paper"))
            ) {
                winner = "User";
                userWins++;
            } else {
                winner = "Computer";
                compWins++;
            }

            // Store round result
            results[i][0] = userChoice;
            results[i][1] = compChoice;
            results[i][2] = winner;
        }

        // ---------------- DISPLAY TABLE ----------------
        System.out.println("\nGame Results:");
        System.out.println("Round\tUser\t\tComputer\tWinner");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < games; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        // ---------------- WIN STATS ----------------
        double userPercent = ((double) userWins / games) * 100;
        double compPercent = ((double) compWins / games) * 100;
        double drawPercent = ((double) draws / games) * 100;

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins    : " + userWins + " (" + userPercent + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPercent + "%)");
        System.out.println("Draws        : " + draws + " (" + drawPercent + "%)");

        sc.close();
    }
}
