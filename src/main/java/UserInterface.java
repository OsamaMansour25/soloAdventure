import java.util.Scanner;

public class UserInterface {
    private Adventure ad;
    Scanner sc;

    public UserInterface() {
        ad = new Adventure();
        sc = new Scanner(System.in);
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
                        System.out.println(ad.look());

                    } else {
                        System.out.println("There is no room in this path");
                    }
                case ("south"):
                    boolean canGoSouth = ad.goSouth();
                    if (canGoSouth) {
                        System.out.println("You have chosen to go south");
                        System.out.println(ad.look());
                    } else {
                        System.out.println("You cannot go this path");
                    }
                    break;

                case ("west"):
                    boolean canGoWest = ad.goWest();
                    if (canGoWest) {
                        System.out.println("You have chosen to go west");
                       System.out.println(ad.look());

                    } else {
                        System.out.println("You cannot go this path");
                    }

                    break;
                case ("east"):
                    boolean canGoEast = ad.goEast();
                    if (canGoEast) {
                        System.out.println("You have chosen to go east");
                        System.out.println(ad.look());
                    } else {
                        System.out.println("You cannot go this path");
                    }
                    break;
                case ("look"):
                    System.out.println(ad.look());
                    break;
                case ("exit"):
                    isRunning = false;
                    break;


            }


        }
    }
}
