public class RangedWeapon extends Weapons{
    Integer ammo = 1;
    public RangedWeapon(String description, Integer damage) {
        super(description, damage);
    }

    @Override
    public AttackEnum attack() {
        if(ammo == 0) {
            return AttackEnum.NO_AMMO;
        }
        ammo--;
        return AttackEnum.FIRED;
    }
}
