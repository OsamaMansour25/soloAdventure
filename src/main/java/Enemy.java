import java.util.ArrayList;

public class Enemy {
    Weapons meleeWeapon;
    private Integer health;
    private Weapons weapon;
    private String description;
    private ArrayList<Enemy> enemy = new ArrayList<>();
    private Player player;
    private Room currentRoom;

    public Enemy(String description, Integer health, Weapons meleeWeapon) {
        this.description = description;
        this.health = health;
        this.meleeWeapon = meleeWeapon;

    }
    public ArrayList<Enemy> getEnemy() {
        return enemy;

    }
    public AttackEnum attack(){
        return AttackEnum.ENEMY_ATTACKED;
    }
    public Integer getHealth() {
        return health;
    }
    public void setHealth(Integer health) {
        this.health = health;

    }
    public void enemyDefeated() {
        if (health <= 0) {
            removeEnemy(player.getCurrentEnemy());

        }

    }
    public void removeEnemy(Enemy enemy) {
        getEnemy().remove(currentRoom.getEnemy().remove(enemy));
    }
}
