import java.util.Scanner;

public class UserInterface {

    Scanner sc;
    private Player player;
    Adventure ad;

    public UserInterface() {
        sc = new Scanner(System.in);
        player = new Player();
        ad = new Adventure();

    }

    public void startGame() {
        boolean isRunning = true;
        System.out.println(""" 
                Welcome to the adventure game! You have started off in room number 1. What direction do you wish to proceed?
                You can only move by typing "South", "West", "East", and "North".
                Commands: exit (Quit the game), help (commands), look (get a description for current room)
                           
                        
                """);
        while (isRunning) {
            String userChoice = sc.nextLine().toLowerCase();
            switch (userChoice) {
                case ("north"):
                    boolean canGoNorth = ad.goNorth();
                    if (canGoNorth) {
                        System.out.println("You have chosen to go north");
                        System.out.println(player.look());

                    } else {
                        System.out.println("There is no room in this path");
                    }
                case ("south"):
                    boolean canGoSouth = ad.goSouth();
                    if (canGoSouth) {
                        System.out.println("You have chosen to go south");
                        System.out.println(player.look());
                    } else {
                        System.out.println("You cannot go this path");
                    }
                    break;

                case ("west"):
                    boolean canGoWest = ad.goWest();
                    if (canGoWest) {
                        System.out.println("You have chosen to go west");
                        System.out.println(player.look());

                    } else {
                        System.out.println("You cannot go this path");
                    }

                    break;
                case ("east"):
                    boolean canGoEast = ad.goEast();
                    if (canGoEast) {
                        System.out.println("You have chosen to go east");
                        System.out.println(player.look());
                    } else {
                        System.out.println("You cannot go this path");
                    }
                    break;
                case ("look"):
                    System.out.println(player.look());
                    break;
                case ("exit"):
                    isRunning = false;
                    break;
                case ("commands"):
                    System.out.println("""
                            Movement commands: "north", "south", "east", "west"
                            Other commands: "help" (prints available commands), "exit" (Quits the game), "look" (Repeats the description of the room).
                                                       
                            """);


            }


        }
    }
}
