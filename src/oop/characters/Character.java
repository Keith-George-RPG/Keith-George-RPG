package oop.characters;

public abstract class Character implements Attackable, Defendable {

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp;
    protected int attackDamage = 0;
    protected int spAttackDamage = 20;
    protected int baseDefense = 5;
    protected int spDefense = 10;

    public Character(int hp, int attackDamage) {
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense() {
        this.baseDefense = baseDefense;
    }

    //    BEHAVIORS THAT ALL CHARACTERS SHARE
    public void attack() {
        if (attackDamage > baseAttackDamage) {
            System.out.println("Attacked for " + attackDamage + " damage");
        } else {
            System.out.println("Attacked for " + baseAttackDamage + " damage");
        }
    }

//    public void diceRoll() {
//        if (Hero.rollDice > Enemy.rollDice)
//    }

}
