/**
 * 教练和运动员案例(学生分析然后讲解)
 * 乒乓球运动员和篮球运动员。
 * 乒乓球教练和篮球教练。
 * 为了出国交流，跟乒乓球相关的人员都需要学习英语。
 * 请用所学知识：
 * 分析，这个案例中有哪些抽象类，哪些接口，哪些具体类。
 */


// 1.实现说英语的接口
// 2.实现一个人类
// 1.说英语接口

interface SpeakEnglish {
    public abstract void speak();
}

// 2.定义一个人类
abstract class Person {
    private String name;
    private int age;
    private String careerType;

    public Person() {
    }

    /**
     * Person带参构造函数
     *
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(this.name + "睡觉了");
    }

    public void getInfo() {
        System.out.println("姓名: " + this.name + " 年龄: " + this.age + " 职业:" + this.careerType);
    }

    /**
     * 设置职业类型
     *
     * @param careerType 教练/运动员
     */
    public void setCareerType(String careerType) {
        this.careerType = careerType;
    }

    public String getCareerType() {
        return careerType;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 设置年龄
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}

// 3.定义一个教练抽象类
abstract class Coach extends Person {
    Coach() {
    }

    /**
     * 教练抽象类的带参构造方法
     *
     * @param name
     * @param age
     */
    Coach(String name, int age) {
        super(name, age);
    }

    // 抽象吃的方法
    abstract void eat();

    // 抽象一个教练学习类
    abstract void teach();
}

// 3.1定义一个乒乓球教练实例类
class pingpangCoach extends Coach implements SpeakEnglish {
    public pingpangCoach() {
    }

    /**
     * 乒乓球教练的带参构造方法
     *
     * @param name
     * @param age
     */
    public pingpangCoach(String name, int age) {
        super(name, age);
    }

    // 重写吃的方法
    public void eat() {
        System.out.println(super.getName() + "吃羊肉了");
    }

    // 给乒乓球教练增加说英语的方法
    public void speak() {
        System.out.println(super.getName() + " 说英语了");
    }

    // 实现教练的教学方法
    public void teach() {
        System.out.println(super.getName() + "是" + super.getCareerType() + "教练");
    }
}

// 3.2定义一个篮球教练实例
class basketballCaoch extends Coach {
    basketballCaoch() {
    }

    /**
     * 篮球教练的带参构造方法
     *
     * @param name
     * @param age
     */
    basketballCaoch(String name, int age) {
        super(name, age);
    }

    // 实现吃的方法
    public void eat() {
        System.out.println(super.getName() + " 他吃肥肉");
    }

    // 实现教学方法
    public void teach() {
        System.out.println(super.getName() + " 他教篮球");
    }

}

// 4.定义一个运动员 抽象类
abstract class Player extends Person {
    Player() {
    }

    /**
     * 运动员抽象类带参构造函数
     *
     * @param name
     * @param age
     */
    Player(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}

// 5.定义一个乒乓球运动员 实例对象
class pingpangPlay extends Person implements SpeakEnglish {
    pingpangPlay() {
    }

    /**
     * 乒乓球运动员带参构造函数
     *
     * @param name
     * @param age
     */
    pingpangPlay(String name, int age) {
        super(name, age);
    }

    // 重写学习
    public void study() {
        System.out.println(super.getName() + "正在学习");
    }

    // 重写吃的方法
    public void eat() {
        System.out.println(super.getName() + "吃东西了");
    }

    // 实现接口
    public void speak() {
        System.out.println(super.getName() + "说英语");
    }
}

// 定义篮球运动员
class basketball extends Player {
    basketball() {
    }

    /**
     * 篮球运动员带参构造函数
     *
     * @param name
     * @param age
     */
    basketball(String name, int age) {
        super(name, age);
    }


    @Override
    public void study() {
        System.out.println(super.getName() + "正在学习");
    }

    public void eat() {
        System.out.println(super.getName() + " 吃牛肉");
    }
}

public class InterFaceTest {
    public static void main(String[] args) {
        pingpangPlay p1 = new pingpangPlay("1号乒乓球", 35);
        p1.setCareerType("乒乓球运动员");
        p1.eat();
        p1.sleep();
        p1.speak();
        p1.study();
        p1.getInfo();
        System.out.println("----------------------");

        pingpangCoach c1 = new pingpangCoach("1号教练员", 66);
        c1.setCareerType("乒乓球教练");
        c1.eat();
        c1.sleep();
        c1.speak();
        c1.teach();
        c1.getInfo();
        System.out.println("==================");

        basketballCaoch c2 = new basketballCaoch("2号篮球教练", 88);
        c2.setCareerType("篮球教练");
        c2.eat();
        c2.sleep();
        c2.teach();
        c2.getInfo();
        System.out.println("----------------------");

        basketball b2 = new basketball("2号篮球", 16);
        b2.setCareerType("篮球运动员");
        b2.eat();
        b2.study();
        b2.sleep();
        b2.getInfo();
        // 没有说英语的方法 报错!
//        b1.speak();

        /*
         * 犯错点:
         *  构造方法写了返回值! 构造方法没有返回值
         */

    }
}
