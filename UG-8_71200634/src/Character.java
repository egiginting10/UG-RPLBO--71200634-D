    public abstract class Character {
        protected  int damage;
        protected  String name;
        protected   int health;

        public Character(String name,int health ,int damage){
            this.name = name;
            this.health = health;
            this.damage = damage;
        }
        public void showCharacter(){
            System.out.println("nama :"+name + "health :"+health + "damage :"+damage);
        }
        public boolean isDie(){
            if (health <= 0){
                return true;
            }
            else {
                return false;
            }
        }
        public abstract int attacked(int a);
    }