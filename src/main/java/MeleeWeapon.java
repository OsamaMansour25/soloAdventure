public class MeleeWeapon extends Weapons{

    public MeleeWeapon(String description, Integer damage) {
        super(description, damage);
    }

    @Override
    public AttackEnum attack() {
        return AttackEnum.MELEE;
    }


    }

