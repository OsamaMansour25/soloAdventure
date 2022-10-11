public abstract class Weapons extends Items {
    private Integer damage;
public Weapons(String description, Integer damage) {
    super(description);
    this.damage = damage;
}

public abstract AttackEnum attack();
    public Integer getDamage() {
        return damage;
    }
}

