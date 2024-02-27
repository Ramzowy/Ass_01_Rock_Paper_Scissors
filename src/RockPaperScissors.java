import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playerA;
        String playerB;
        String choice;
        boolean done = false;

        do {
            while (true)
            {
                System.out.print("PlayerA enter your move(R,P,S): ");
                playerA = in.nextLine();
                if ((playerA.equalsIgnoreCase("R")) || (playerA.equalsIgnoreCase("S")) || (playerA.equalsIgnoreCase("P")))
                {
                    break;
                }
                else
                {
                  System.out.println("Please enter a valid move !!");
                }
            }
            while (true)
            {
                System.out.print("PlayerB enter your move(R,P,S): ");
                playerB = in.nextLine();
                if ((playerB.equalsIgnoreCase("R")) || (playerB.equalsIgnoreCase("S")) || (playerB.equalsIgnoreCase("P")))
                {
                    break;
                }
                else
                {
                    System.out.println("Please enter a valid move !!");
                }
            }
            if ((playerA.equalsIgnoreCase("R")) && (playerB.equalsIgnoreCase("R")))
            {
                System.out.println( "Rock vs Rock, It's a tie");
            }
            else if ((playerA.equalsIgnoreCase("P")) && (playerB.equalsIgnoreCase("P")))
            {
                System.out.println("Scissors vs Scissors,It's a tie");

            }
            else if ((playerA.equalsIgnoreCase("S")) && (playerB.equalsIgnoreCase("S")))
            {
                System.out.println("Scissors vs Scissors, It's a tie");

            }
            else if ((playerA.equalsIgnoreCase("R")) && (playerB.equalsIgnoreCase("S")))
           {
                System.out.println("PlayerA wins, Rock breaks Scissor");
            }
            else if ((playerA.equalsIgnoreCase("P")) && (playerB.equalsIgnoreCase("R")))
            {
              System.out.println("PlayerA wins, Paper covers Rock");
            }
            else if ((playerA.equalsIgnoreCase("S")) && (playerB.equalsIgnoreCase("P"))) {
               System.out.println("PlayerA wins, Scissors cuts paper");
            }
            else if ((playerB.equalsIgnoreCase("R")) && (playerA.equalsIgnoreCase("S")))
            {
                System.out.println("PlayerB wins, Rock breaks Scissor");
            }
            else if ((playerB.equalsIgnoreCase("P")) && (playerA.equalsIgnoreCase("R")))
            {
                System.out.println("PlayerB wins, Paper covers Rock");
            }
            else if ((playerB.equalsIgnoreCase("S")) && (playerA.equalsIgnoreCase("P"))) {
                System.out.println("PlayerB wins, Scissors cuts paper");
            }
            else {
                ;
            }
            while (true)
            {
                System.out.print("Wanna play Again[Y/N]: ");
                choice = in.nextLine();
                if (choice.equalsIgnoreCase("Y"))
                {
                    break;
                }
                else if (choice.equalsIgnoreCase("N"))
                {
                    done = true;
                    break;
                }
                else
                {
                    System.out.println("Please enter a valid input!!");
                }
            }



        } while (!done);



    }
}