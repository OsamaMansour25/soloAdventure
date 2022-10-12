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
                        System.out.println(player.look() + player.getCurrentRoom().getItems());

                    } else {
                        System.out.println("There is no room in this path");
                    }
                case ("south"):
                    boolean canGoSouth = ad.goSouth();
                    if (canGoSouth) {
                        System.out.println("You have chosen to go south");
                        System.out.println(player.look() + player.getCurrentRoom().getItems());
                    } else {
                        System.out.println("You cannot go this path");
                    }
                    break;

                case ("west"):
                    boolean canGoWest = ad.goWest();
                    if (canGoWest) {
                        System.out.println("You have chosen to go west");
                        System.out.println(player.look() + player.getCurrentRoom().getItems());

                    } else {
                        System.out.println("You cannot go this path");
                    }

                    break;
                case ("east"):
                    boolean canGoEast = ad.goEast();
                    if (canGoEast) {
                        System.out.println("You have chosen to go east");
                        System.out.println(player.look() + player.getCurrentRoom().getItems());
                    } else {
                        System.out.println("You cannot go this path");
                    }
                    break;
                case ("look"):
                    System.out.println(player.look() + player.getCurrentRoom().getItems());
                    break;
                case ("exit"):
                    isRunning = false;
                    break;

                case ("take"):
                    System.out.println("Which item do you want to pickup?");
                    String takeItem = sc.nextLine();
                    boolean itemTaken = player.takeItem(takeItem);
                    if (itemTaken == true) {
                        System.out.println("You have taken " + takeItem);
                    }
                        else {
                        System.out.println("There is no such item in this room"); }
                        break;

                case("drop"):
                    System.out.println("Which item do you want to drop?");
                    String dropItem = sc.nextLine();
                    boolean itemDropped = player.dropItem(dropItem);
                    if (itemDropped == true) {
                        System.out.println("You have dropped" + dropItem);
                    }
                    else {
                        System.out.println("You don't have this item"); }
                    break;

                case ("inventory"):
                    System.out.println(player.printInventory());
                    break;
                case ("commands"):
                    System.out.println("""
                            Movement commands: "north", "south", "east", "west"
                            Other commands: "help" (prints available commands), "exit" (Quits the game), "look" (Repeats the description of the room).
                                                       
                            """);
                    break;

                case("consume"):
                    System.out.println("Here is your inventory");
                    System.out.println(player.printInventory());
                   // boolean canEat = player.eatItemFromInv();
                    //boolean canConsume = player.eatItemFromRoom(userChoice);
                    System.out.println("What would you like to consume?");
                   // boolean foodConsumed = player.eatItemFromRoom(canConsume);
                   FoodEnum isFood = player.consumeFood(sc.nextLine());
                   switch (isFood)
                   {
                       case FOOD:
                           System.out.println("You have consumed " + isFood + " and it has been removed from your inventory");
                       System.out.println("Your health is" + player.gethealth());
                       break;

                       case NOT_FOUND:
                           System.out.println(isFood + " is not in your inventory");
                           break;

                       case NOT_FOOD:
                           System.out.println(isFood + " is not food");
                           break;
                   }
                   break;
                case("equip"):
                    System.out.println("Here is your inventory");
                    System.out.println(player.printInventory());
                    System.out.println("What weapon would you like to equip?");
                    WeaponEnum isWeapon = player.equipWeapon(sc.nextLine());
                    switch (isWeapon)
                    {
                        case WEAPON:
                            System.out.println("You have equipped" + isWeapon);
                            break;
                        case NOT_FOUND:
                            System.out.println("Could not find " + isWeapon + " In your inventory");
                            break;
                        case NOT_WEAPON:
                            System.out.println("You cannot equip" + isWeapon + " it is not a weapon");
                            break;
                    }
                    break;

                case"attack", "fire":
                    AttackEnum attack = player.attack();
                    switch (attack)
                    {
                        case PLAYER_DEFEATED:
                            System.out.println("You have been slain. Game over");
                            isRunning = false;
                            break;
                        case ENEMY_DEFEATED:
                            System.out.println("You have slain an enemy! They dropped their item on the ground " +
                                    "and disappeared from the room");
                            break;
                        case ENEMY_ATTACKED:
                            System.out.println("An enemy has attacked you! Your hp is " + player.gethealth());
                        case FIRED:
                            System.out.println("You have fired your weapon!");
                            break;
                        case MELEE:
                            System.out.println("You have swung and attacked with your weapon");
                            break;
                        case NO_AMMO:
                                System.out.println("You don't have ammo to fire this weapon");
                        case NO_WEAPON_EQUIPPED:
                            if(player.getEquippedWeapon() == null) {
                                System.out.println("You don't have a weapon equipped");
                                break;
                            }
                    }
                    break;



                case("health"):
                    Integer health = player.gethealth();
                    if(health > 0 && 25 >= health) {
                        System.out.println("Your health is" + health + "You are low in hp. Avoid fights and get food");
                    }
                    if(health > 25 && 50 >= health) {
                        System.out.println("Your health is" + health + "You are kinda low, be careful with fights and get food");
                    }
                    if(health > 50 && 75 >= health) {
                        System.out.println("Your health is" + health + "You are good on health, you can take fights, but avoid taking too much damage");
                    }
                    if(health > 75 && 100 > health) {
                        System.out.println("Your health is" + health + "You are almost at full health points");
                    }
                    if(health == 100) {
                        System.out.println("You are at full hp");
                    }
                    break;


            }


        }
    }
}
