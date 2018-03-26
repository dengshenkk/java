public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public static void main(String[] args){
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.78f;
        garen.moveSpeed = 350;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
        System.out.println("创建了一个英雄类,并实例化出两个英雄");
    }
}
