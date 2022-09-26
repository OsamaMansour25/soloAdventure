import java.util.Scanner;

public class UserInterface {
    private Adventure ad;
    Scanner sc;

    public UserInterface() {
        ad = new Adventure();
        sc = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println(""" 
                Welcome to the adventure game! You have started off in room number 1. What direction do you wish to proceed?
                You can only move by typing "South", "West", "East", and "North".
                Commands: exit (Quit the game), help (commands), look (get a description for current room)
           
                        
                """);
    }

    private void movement() {
        String userChoice = null;
        if (userChoice.equalsIgnoreCase("north"))
            System.out.println("You have chosen to move towards north");
        else if (userChoice.equalsIgnoreCase("south"))
            System.out.println("You have chosen to move towards south");
        else if (userChoice.equalsIgnoreCase("west"))
            System.out.println("You have chosen to move towards west");
        else if (userChoice.equalsIgnoreCase("east"))
            System.out.println("You have chosen to move towards east");
        else if(userChoice.equalsIgnoreCase("look"))
            System.out.println(ad.look);
        else if(userChoice.equalsIgnoreCase("exit"))
            System.exit(0);


    }
}

