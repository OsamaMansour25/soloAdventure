public class MeleeWeapon extends Weapons{
    public MeleeWeapon(String description) {
        super(description);
    }

    @Override
    public AttackEnum attack() {
        return AttackEnum.MELEE;
    }


    }

