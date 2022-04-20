public abstract class PhysicalCharacter extends Character {

    private int armor;


    public PhysicalCharacter(String name,int health,int damage,int armor){
        super(name, health, damage + armor);
    }

    @Override
    public void showCharacter() {
        super.showCharacter();
    }

    @Override
    public int attacked(int a) {
        return health = damage - armor;
    }
}