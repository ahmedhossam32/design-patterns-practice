package prototypepattern;

public class PrototypePattern {

    public static void main(String[] args) {
       GameCharacter hero1 = new GameCharacter("Ahmed", new Weapon("Sword"));

        GameCharacter shallowClone = hero1.shallowCopy();
        GameCharacter deepClone = hero1.deepCopy();

        shallowClone.setName("Hossam");
        shallowClone.getWeapon().setType("Bow"); // shared

        deepClone.setName("Ali");
        deepClone.getWeapon().setType("Axe"); // independent

        hero1.print();         // Will show "Bow" because of shallow copy
        shallowClone.print();  // "Bow"
        deepClone.print();     // "Axe"
    }
}
