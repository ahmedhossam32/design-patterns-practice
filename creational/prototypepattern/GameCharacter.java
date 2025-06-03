package prototypepattern;

public class GameCharacter implements Cloneable {
    private String name;
    private Weapon weapon;

    public GameCharacter(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Weapon getWeapon() { return weapon; }
    public void setWeapon(Weapon weapon) { this.weapon = weapon; }

    // ✅ Shallow copy (shares weapon)
    public GameCharacter shallowCopy() {
        try {
            return (GameCharacter) super.clone(); // weapon is shared
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // ✅ Deep copy (weapon cloned)
    public GameCharacter deepCopy() {
        return new GameCharacter(this.name, new Weapon(this.weapon));
    }

    public void print() {
        System.out.println(name + " with weapon: " + weapon.getType());
    }
}
