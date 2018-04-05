/*
 * 定义一个猫和狗类, 并额外加入跳高功能
 * 分析:
 *  由于猫狗有共同的属性和方法,所以定义一个共同的父类动物类
 *
 */
abstract class Animal {
    private String name;
    private int age;

    // 定义无参构造
    Animal() {
    }

    // 定义有参构造
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    // 抽象方法
    abstract void eat();

    // 定义get/set方法
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// 普通的猫
class Cat extends Animal {
    public void Jumpping() {
        System.out.println(super.getName() + "会跳高了");
    }

    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 显式调用父类
    Cat(String name, int age) {
        super(name, age);
    }
}

// 跳高的猫
class JumpCat extends Animal implements Jump {
    JumpCat(String name, int age) {
        super(name, age);
    }

    public void eat() {
    }

    public void Jumpping() {
        System.out.println(super.getName() + "会跳高了");
    }
}

// 普通的狗
class Dog extends Animal {
    public void eat() {
        System.out.println(this.getName() + "狗吃肉");
    }

    Dog(String name, int age) {
        super(name, age);
    }
}

// 跳高的狗
class JumpDog extends Animal implements Jump {
    JumpDog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(this.getName() + " 吃肉了, 并且会跳高");
    }

    public void Jumpping() {
        System.out.println(super.getName() + "跳高");
    }
}

// 定义一个额外功能的接口
abstract interface Jump {
    abstract public void Jumpping();
}

public class InterFace {
    public static void main(String[] args) {
        JumpCat c1 = new JumpCat("机器猫", 666);
        c1.sleep();
        c1.Jumpping();
        System.out.println("-----------");

        JumpDog d1 = new JumpDog("阿拉斯加", 88);
        d1.Jumpping();
        d1.eat();
        d1.sleep();

        Dog d2 = new Dog("哈士奇", 6);
        d2.eat();
        // 报错 普通的狗无法跳高
//        d2.Jumpping();
    }
}
